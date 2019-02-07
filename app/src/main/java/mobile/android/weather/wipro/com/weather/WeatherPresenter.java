package mobile.android.weather.wipro.com.weather;

import android.support.annotation.NonNull;

import mobile.android.weather.wipro.com.weather.apimanager.WeatherService;
import mobile.android.weather.wipro.com.weather.data.WeatherResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public class WeatherPresenter implements Weather.WeatherPresenter {

    public static final String BASE_URL = "http://api.openweathermap.org/";
    public static final String APP_ID = "3d4e24e43e697b893f87f92df14536c8";

    private Weather.WeatherView mView;

    public WeatherPresenter(Weather.WeatherView view) {
        mView = view;
    }


    @Override
    public void getWeatherForecast(String latitude, String longitude) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherService service = retrofit.create(WeatherService.class);
        Call<WeatherResponse> call = service.getCurrentWeatherData(latitude, longitude, APP_ID);
        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(@NonNull Call<WeatherResponse> call, @NonNull Response<WeatherResponse> response) {
                if (response.code() == 200) {
                    WeatherResponse weatherResponse = response.body();
                    mView.showForecast(weatherResponse.getList());
                }
            }

            @Override
            public void onFailure(@NonNull Call<WeatherResponse> call, @NonNull Throwable t) {
            }
        });
    }
}
