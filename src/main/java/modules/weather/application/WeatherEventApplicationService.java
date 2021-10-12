package modules.weather.application;

import modules.weather.domain.event.EventAttribute;
import modules.weather.domain.event.WeatherEvent;
import modules.weather.domain.repository.EventAttributeRepository;
import modules.weather.domain.repository.WeatherEventRepository;

public class WeatherEventApplicationService {
    private WeatherEventRepository weatherEventRepository;
    private EventAttributeRepository eventAttributeRepository;

    public WeatherEventApplicationService(WeatherEventRepository weatherEventRepository, EventAttributeRepository eventAttributeRepository) {
        this.weatherEventRepository = weatherEventRepository;
        this.eventAttributeRepository = eventAttributeRepository;
    }

    public void convertTemperature(int id, String newUnit, double value){
        boolean eventExits = weatherEventRepository.eventExists(id);
        if(eventExits){
            WeatherEvent weatherEvent =  weatherEventRepository.getWeatherEventById(id);
            EventAttribute eventAttribute =  weatherEvent.getEventAttributes();
            double result = eventAttribute.convertTemperature(newUnit, value);

            eventAttribute.setTemperatureScaleType(newUnit);
            eventAttribute.setValue(result);
            eventAttributeRepository.updateEventAttribute(eventAttribute);
        }
    }

    public EventAttribute getEventAttribute(int WeatherEventId){
        WeatherEvent WeatherEvent = weatherEventRepository.getWeatherEventById(WeatherEventId);
        return eventAttributeRepository.getEvent(WeatherEvent.getEventAttribute().getId());
    }
}

