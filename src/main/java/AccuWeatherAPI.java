import java.util.List;
import java.util.Map;

public interface AccuWeatherAPI {
    List<Map<String,Object>> getWeather(String city);
}
