package mobile.android.weather.wipro.com.weather.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public class Rain {

    @SerializedName("3h")
    private Double _3h;

    public Double get3h() {
        return _3h;
    }

    public void set3h(Double _3h) {
        this._3h = _3h;
    }

}
