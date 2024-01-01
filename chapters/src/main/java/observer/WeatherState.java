package observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeatherState {
    private float temp;
    private float humidity;
    private float pressure;

}
