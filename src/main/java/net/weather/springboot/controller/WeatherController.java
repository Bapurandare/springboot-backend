package net.weather.springboot.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import net.weather.springboot.model.WeatherData;
import net.weather.springboot.repository.WeatherRepository;

@SpringBootApplication

//http://localhost:3000/
@CrossOrigin
@RestController
@RequestMapping("api/")
public class WeatherController {
	
	public String city;
	@Autowired
	private WeatherRepository weatherRepository;
	
	
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("http://localhost:3000/");
//            }
//        };
//    }
	
	//@RequestMapping("api/")
	@GetMapping(path = "weatherDetails")
	public List<WeatherData> getWeather(String city){
		return this.weatherRepository.findAll();
	}
	
//	@GetMapping(path = "weatherCall")
//	public @ResponseBody Object getCityName(@RequestParam String cityname){
//		System.out.println(cityname);
//		
//		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		
//		ResponseEntity<Object> response = restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/weather?q="+cityname+"&appid=6db1dd1c8c5fafd8f6543c5c944cacdc&units=metric",Object.class);
//		System.out.println(response);
//	return response;
//	}
	
//	@GetMapping(path = "weatherDetails")
//	public List<String> getCityName(@RequestParam String cityname){
//		System.out.println(cityname);
//		List<String> list = new ArrayList<String>();
//		if(cityname=="Dallas")
//			list.add("Bhawana");
//		else
//			list.add("Yes");
//			list.add("Yep Yep");
//	return list;
//	}
	
	
}
