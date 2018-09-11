package com.observer.first.test;

import com.observer.javaobserver.CurrentConditionDisplay;
import com.observer.javaobserver.ForecastDisplay;
import com.observer.javaobserver.WeatherData;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisply =
                new CurrentConditionDisplay(weatherData);

        ForecastDisplay forecastDisplay =
                    new ForecastDisplay((weatherData));
        weatherData.setMeasurements(70,49,20);
        weatherData.setMeasurements(20,19,10);

    }
}
