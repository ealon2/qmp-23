import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ServiceLocator {
    private static ServiceLocator instance = new ServiceLocator();
    private AccuWeatherAPI accuWeatherAPI;

    private ServiceLocator(){
    }

    static ServiceLocator instance(){
        return instance;
    }

    public List<Map<String,Object>> getWeather(String city){
        if (Objects.isNull(accuWeatherAPI))
            throw new ServiceLocatorException("Without Weather Service");
        return accuWeatherAPI.getWeather(city);
    }

    public void setServiceWeather(AccuWeatherAPI api){
        this.accuWeatherAPI = api;
    }
}
