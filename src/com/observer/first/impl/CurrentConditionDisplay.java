package com.observer.first.impl;

import com.observer.first.DisplayElement;
import com.observer.first.Observer;
import com.observer.first.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperasure;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    @Override
    public void display() {
        System.out.println("当前天气情况：气温"+temperasure+"；湿度："+humidity+
                "；气压："+pressure);
    }
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperasure = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
