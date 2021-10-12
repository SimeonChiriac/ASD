package modules.weather.domain.repository;

import modules.weather.domain.event.EventAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventAttributeRepository extends JpaRepository<EventAttribute, Long> {

    EventAttribute getEvent(int id);
    EventAttribute updateEventAttribute(EventAttribute eventAttribute);

}
