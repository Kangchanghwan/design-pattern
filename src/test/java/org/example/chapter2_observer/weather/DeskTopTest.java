package org.example.chapter2_observer.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeskTopTest {

    @Test
    void test(){
        WeatherData weatherData = new WeatherData();

        DisplayScreen deskTop = new DeskTop(weatherData);
        DisplayScreen dashboard = new DashBoard(weatherData);

        weatherData.setMeasurements(0.1f,0.24f,12.4f);
        weatherData.setMeasurements(0.2f,0.24f,2.4f);
        weatherData.setMeasurements(0.3f,0.24f,2.4f);
        weatherData.setMeasurements(0.1f,0.244f,1.4f);
    }

}