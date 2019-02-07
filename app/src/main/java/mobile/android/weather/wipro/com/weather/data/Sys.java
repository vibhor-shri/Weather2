package mobile.android.weather.wipro.com.weather.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public class Sys {

    @SerializedName("pod")
    private String pod;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

}
