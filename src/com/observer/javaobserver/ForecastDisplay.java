package com.observer.javaobserver;

import com.observer.first.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 22.9f;
    private float lastPressure ;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("今日气压："+currentPressure+";昨日气压："+lastPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  WeatherData){
            lastPressure = currentPressure;
            WeatherData weatherData = (WeatherData)o;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
