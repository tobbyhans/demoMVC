package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class App {

	@RequestMapping(value = "/saludoinicial")
	@ResponseBody
	public String saludoInicial() {
		return "saludoInicial";

	}

	@RequestMapping(value = "/people", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getPeople() {
		return "juan";
	}

	@RequestMapping(value = "/test")
	@ResponseBody
	public Persona getpersona1() {
		return new Persona("pepe", "juan");
	}
	

//THIS IS WICH QUERY-STRING (?) , @RequestParam String parametro

	@RequestMapping(value = "/conpatrametro", method = RequestMethod.GET)
	@ResponseBody
	public String conParametro(@RequestParam String parametro) {

		return "valor retornado con parametro  ::: " + parametro;
	}
	
	
	@RequestMapping(value = "/pathvariable/{variable}", method = RequestMethod.GET)
	@ResponseBody
	public String conVariable(@PathVariable String variable) {

		return "valor retornado con variable   :::  " + variable;
	}
	
	//debemos tern un html que reponda a la ruta /body asi capturamos los datos
	@RequestMapping(value = "/body", method = RequestMethod.POST)
	@ResponseBody
	public String wichEntity(@RequestBody String body) {

		return "responde desde formulario   :::  " + body;
	}
}
























