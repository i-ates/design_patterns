package observer_pattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();
        DisplayScreen1 displayScreen= new DisplayScreen1(weatherData);
        weatherData.registerObserver(displayScreen);

        weatherData.setTemp(5);
        weatherData.setTemp(6);
    }

}
