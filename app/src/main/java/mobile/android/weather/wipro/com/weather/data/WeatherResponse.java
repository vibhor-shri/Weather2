package mobile.android.weather.wipro.com.weather.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public class WeatherResponse {

    @SerializedName("cod")
    private String cod;
    @SerializedName("message")
    private Double message;
    @SerializedName("cnt")
    private Integer cnt;
    @SerializedName("list")
    private java.util.ArrayList<List> list = null;
    @SerializedName("city")
    private City city;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public java.util.ArrayList<List> getList() {
        return list;
    }

    public void setList(java.util.ArrayList<List> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}