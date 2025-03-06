package console_project;

import java.util.HashMap;

public class WeatherInfo {
    private static final HashMap<String, String> weatherData = new HashMap<>();

    static {
        
        weatherData.put("Paris", "Sunny, 25°C");
        weatherData.put("London", "Rainy, 15°C");
        weatherData.put("New York", "Cloudy, 20°C");
        weatherData.put("Mumbai", "Humid, 30°C");
        weatherData.put("Tokyo", "Clear, 22°C");
    }

    public static String getWeather(String destination) {
        return weatherData.getOrDefault(destination, "Weather data not available for this destination.");
    }
}
