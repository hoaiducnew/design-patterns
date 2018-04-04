package behavior.observer.weather2;

import behavior.observer.weather2.observer.CurrentConditionsDisplay;
import behavior.observer.weather2.observer.ForecastDisplay;
import behavior.observer.weather2.observer.StatisticsDisplay;
import behavior.observer.weather2.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
