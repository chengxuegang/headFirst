package com.observer.first.impl;

import com.observer.first.Observer;
import com.observer.first.Subject;

import java.util.ArrayList;

public class WeatherData  implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i> 0){
            observers.remove(o);
        }
    }

    //吧状态告诉每个观察者，因为观察者都实现了update接口
    @Override
    public void notifyObservers() {
        for(int i  = 0 ;  i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity, pressure);
        }
    }

    // 当气象战得到更新观测值时，我们告知观察者
    public void measurementsChanged(){
        notifyObservers();;
    }

    //更新数据
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
