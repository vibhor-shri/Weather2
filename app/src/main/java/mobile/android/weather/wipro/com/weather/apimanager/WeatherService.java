package mobile.android.weather.wipro.com.weather.apimanager;

import mobile.android.weather.wipro.com.weather.data.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public interface WeatherService {
    @GET("data/2.5/forecast?")
    Call<WeatherResponse> getCurrentWeatherData(@Query("lat") String lat, @Query("lon") String lon, @Query("APPID") String app_id);
}
