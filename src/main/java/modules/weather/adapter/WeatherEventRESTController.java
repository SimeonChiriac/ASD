package modules.weather.adapter;

import modules.weather.application.WeatherEventApplicationService;
import modules.weather.domain.event.EventAttribute;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherEventRESTController {

    private WeatherEventApplicationService weatherEventApplicationService;

    public WeatherEventRESTController(WeatherEventApplicationService weatherEventApplicationService) {
        this.weatherEventApplicationService = weatherEventApplicationService;
    }

    @GetMapping
    public ResponseEntity test(){
        return ResponseEntity.ok("gelukt");
    }

    @PostMapping("/convert/{id}/{newUnit}/{value}")
    public ResponseEntity<String> convertTemperature(@PathVariable int id, @PathVariable String newUnit, @PathVariable double value) {
        weatherEventApplicationService.convertTemperature(id, newUnit, value);
        EventAttribute eventAttribute = weatherEventApplicationService.getEventAttribute(id);
        return ResponseEntity.ok("EventAttribute converted to: " + eventAttribute.getTemperatureScaleType() + eventAttribute.getValue());
    }
}
