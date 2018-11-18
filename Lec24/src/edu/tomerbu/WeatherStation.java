package edu.tomerbu;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation {

    //async: void is the only return type. can't Throw
    //public void run(){}
    public void tlv(WheatherResult callback){
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    String json = IO.readHTTP("https://query.yahooapis.com/v1/public/yql?q=select%20item.condition%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text=%27tel%20aviv%27)%20and%20u=%27c%27&format=json");

                    //use the callback to inform main about the change
                    callback.result(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1000 * 60);
    }
}

