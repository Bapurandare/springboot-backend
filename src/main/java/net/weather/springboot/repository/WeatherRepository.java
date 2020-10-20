package net.weather.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.weather.springboot.model.WeatherData;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherData, Long>{
	
}
