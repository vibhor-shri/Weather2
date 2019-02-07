package mobile.android.weather.wipro.com.weather.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public class Wind {

    @SerializedName("speed")
    private Double speed;
    @SerializedName("deg")
    private Double deg;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }

}
