package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.WeatherServiceImpl;

public class Application{
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9000/weather", new WeatherServiceImpl());
		System.out.println("Service Published");
	}
}