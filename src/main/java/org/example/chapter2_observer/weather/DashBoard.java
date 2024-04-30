package org.example.chapter2_observer.weather;

import java.time.LocalDateTime;

public class DashBoard implements DisplayScreen,Observer{
    private String name;
    private String temperature;
    private final WeatherData weatherData;
    public DashBoard(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void display() {
        System.out.println(name + "'s Dashboard: " + "Temperature: " + temperature);
    }

    @Override
    public void update() {
        this.name = LocalDateTime.now() + "실시간 온도정보";
        this.temperature = String.valueOf(weatherData.getTemperature());
        display();
    }
}
