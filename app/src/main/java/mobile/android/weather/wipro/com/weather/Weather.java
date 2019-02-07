package mobile.android.weather.wipro.com.weather;

import java.util.ArrayList;

import mobile.android.weather.wipro.com.weather.data.List;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public interface Weather {

    interface WeatherView {

        void showForecast(ArrayList<List> weatherInfoList);

        void showErrorToast();
    }

    interface WeatherPresenter {

        void getWeatherForecast(String latitude, String longitude);
    }
}
