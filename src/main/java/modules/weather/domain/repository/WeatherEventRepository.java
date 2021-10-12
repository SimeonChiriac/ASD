package modules.weather.domain.repository;

import modules.weather.domain.event.WeatherEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherEventRepository extends JpaRepository<WeatherEvent, Long> {
    boolean eventExists(int id);
    WeatherEvent getWeatherEventById(int id);
}
