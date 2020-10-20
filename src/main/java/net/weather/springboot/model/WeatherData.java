package net.weather.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weatherDetails")

public class WeatherData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int day;
	
	@Column(name = "degree_temperature")
	private float degreeTemperature;
	
	@Column(name = "fahrenheit_temperature")
	private float fahrenheitTemperature;
	
	@Column(name = "humidity")
	private float humidity;
	
	@Column(name = "pressure")
	private float pressure;
	
	@Column(name = "wind")
	private float wind;
	
	@Column(name = "predictions")
	private String predictions;
	
	public WeatherData() {
		
	}
	
	public WeatherData(float degreeTemperature, float fahrenheitTemperature, float humidity, float pressure, float wind,
			String predictions) {
		super();
		this.degreeTemperature = degreeTemperature;
		this.fahrenheitTemperature = fahrenheitTemperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.wind = wind;
		this.predictions = predictions;
	}
	
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public float getDegreeTemperature() {
		return degreeTemperature;
	}
	public void setDegreeTemperature(float degreeTemperature) {
		this.degreeTemperature = degreeTemperature;
	}
	public float getFahrenheitTemperature() {
		return fahrenheitTemperature;
	}
	public void setFahrenheitTemperature(float fahrenheitTemperature) {
		this.fahrenheitTemperature = fahrenheitTemperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getWind() {
		return wind;
	}
	public void setWind(float wind) {
		this.wind = wind;
	}
	public String getPredictions() {
		return predictions;
	}
	public void setPredictions(String predictions) {
		this.predictions = predictions;
	}
}
