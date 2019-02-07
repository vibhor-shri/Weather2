package mobile.android.weather.wipro.com.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import mobile.android.weather.wipro.com.weather.data.List;

public class WeatherActivity extends AppCompatActivity implements Weather.WeatherView {

    public static String lat = "18.5204";
    public static String lon = "73.8567";

    Button getWeatherData;
    ListView mWeatherInfoList;
    WeatherPresenter mWeatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        initializeWidgets();
        applyListeners();
        mWeatherPresenter = new WeatherPresenter(this);
    }

    private void initializeWidgets() {
        getWeatherData = (Button) findViewById(R.id.button_fetch_forecast);
        mWeatherInfoList = (ListView)findViewById(R.id.list_view_weather_forecast);

    }

    private void applyListeners() {
        getWeatherData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWeatherPresenter.getWeatherForecast(lat, lon);
            }
        });
    }

    @Override
    public void showForecast(ArrayList<List> weatherInfoList) {
        WeatherAdapter weatherAdapter = new WeatherAdapter(WeatherActivity.this, weatherInfoList);
        mWeatherInfoList.setAdapter(weatherAdapter);

    }

    @Override
    public void showErrorToast() {
        Toast.makeText(WeatherActivity.this, "Unable to get weather forecast right now. Please try again later", Toast.LENGTH_SHORT).show();
    }

}
