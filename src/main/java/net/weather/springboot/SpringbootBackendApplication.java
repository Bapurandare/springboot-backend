package net.weather.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.weather.springboot.controller.WeatherController;
import net.weather.springboot.model.WeatherData;
import net.weather.springboot.repository.WeatherRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{
	
	private static float tempc =1;
	private static float tempf =3;
	private static float humid = 3;
	private static float press = 2;
	private static float w = 7;
	private static String predict = "yay";
	

	
	public static String city;

	public static void main(String[] args) {
		WeatherController wc = new WeatherController();
		
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private WeatherRepository weatherRepository;

	@Override
	public void run(String... args) throws Exception {
		this.weatherRepository.save(new WeatherData(23, 277, 35, 1010, 66, "rain"));
		this.weatherRepository.save(new WeatherData(24, 272, 39, 1001, 68, "cloudy"));
		this.weatherRepository.save(new WeatherData(29, 280, 40, 1020, 59, "cloudy with some rain"));			
		this.weatherRepository.save(new WeatherData(23, 289, 33, 1003, 68, "clear"));
		this.weatherRepository.save(new WeatherData(25, 278, 38, 1006, 59, "windy"));
		this.weatherRepository.save(new WeatherData(29, 277, 33, 1101, 55, "snow"));
		this.weatherRepository.save(new WeatherData(25, 281, 36, 1110, 56, "clear"));
		this.weatherRepository.save(new WeatherData(27, 291, 37, 1010, 55, "clear"));
	}
	
}

