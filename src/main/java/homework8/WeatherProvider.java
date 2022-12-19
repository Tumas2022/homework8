package homework8;

import homework8.enums.Periods;
import homework8.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}