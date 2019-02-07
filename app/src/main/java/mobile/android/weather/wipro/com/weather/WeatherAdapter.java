package mobile.android.weather.wipro.com.weather;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.android.weather.wipro.com.weather.data.List;

/**
 * Created by vibhorshrivastava on 2/7/19.
 */

public class WeatherAdapter extends BaseAdapter {
    Context context;
    ArrayList<List> weatherInfo;
    private static LayoutInflater inflater = null;

    public WeatherAdapter(Activity activity, ArrayList<List> weatherInfo) {
        context = activity;
        this.weatherInfo = weatherInfo;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return weatherInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        TextView tv_date;
        TextView tv_temperature;
        TextView tv_humidity;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View view;
        view = inflater.inflate(R.layout.card_view_weather_forecast, null);

        holder.tv_date = (TextView) view.findViewById(R.id.text_view_date_value);
        holder.tv_temperature = (TextView) view.findViewById(R.id.text_view_temperature_value);
        holder.tv_humidity = (TextView) view.findViewById(R.id.text_view_humidity_value);

        holder.tv_date.setText(weatherInfo.get(position).getDtTxt());
        Double temperatureInCelcius = weatherInfo.get(position).getMain().getTemp() - 273.15;
        holder.tv_temperature.setText(String.valueOf(String.format ("%.2f", temperatureInCelcius)) + " C");
        holder.tv_humidity.setText(String.valueOf(weatherInfo.get(position).getMain().getHumidity()) + "%");

        return view;
    }

}
