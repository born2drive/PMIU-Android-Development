package com.example.user.weatherappproject.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 18/02/2018.
 */

public class Main {
        @SerializedName("temp")
        @Expose
        double temp;

        @SerializedName("pressure")
        @Expose
        double pressure;

        @SerializedName("humidity")
        @Expose
        int humidity;

        @SerializedName("temp_min")
        @Expose
        double temp_min;

        @SerializedName("temp_max")
        @Expose
        double temp_max;

        public Main(double temp, int pressure, int humidity, double temp_min, double temp_max) {
            this.temp = temp;
            this.pressure = pressure;
            this.humidity = humidity;
            this.temp_min=temp_min;
            this.temp_max=temp_max;
        }

        public double getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(double temp_min) {
            this.temp_min = temp_min;
        }

        public double getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(double temp_max) {
            this.temp_max = temp_max;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

}
