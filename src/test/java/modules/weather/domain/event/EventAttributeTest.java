package modules.weather.domain.event;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventAttributeTest {
    EventAttribute eventAttribute = new EventAttribute();

    @Test
    public void  testConvertFahrenheitToCelsius() {
        double result = eventAttribute.convertTemperature("fahrenheit", 52.3);
        assertEquals(11.3, result, 0.3);
    }

}