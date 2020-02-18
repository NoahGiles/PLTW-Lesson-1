package weather;

public class StringTester {
    public static void main(String[] args)
    {
        String weatherCondition = "scattered showers day";

        System.out.println(weatherCondition.indexOf("thunder"));

        System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));


    }
}
