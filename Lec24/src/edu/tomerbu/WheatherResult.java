package edu.tomerbu;

//The Message
public interface WheatherResult{
    void result(String temp);
}


//Observable(Message callback)
//WeatherStation
//when the event happens the Observable notifies the Observer//via the callback.result(temp).


//Observer gets notified
//Main
//