package org.example.chapter2_observer.weather.concreteObserver;

import org.example.chapter2_observer.weather.DisplayScreen;
import org.example.chapter2_observer.weather.concreteSubject.WeatherData;
import org.example.chapter2_observer.weather.observer.Observer;

public class DeskTop implements DisplayScreen, Observer {
    private String temp;
    private String pressure;
    private final WeatherData weatherData;

    public DeskTop(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "Temperature: " + temp + ", Pressure: " + pressure
        );
    }

    @Override
    public void update() {
        this.temp = String.valueOf(weatherData.getTemperature());
        this.pressure = String.valueOf(weatherData.getPressure());
        display();
    }
}
