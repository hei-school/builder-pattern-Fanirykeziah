import builder.CarBuilder;
import builder.CarManualBuilder;
import car.Car;
import car.Manual;
import director.Director;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderTest {
    @Test
    public void testBuildSportsCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);
        Car car = builder.getResult();

        assertNotNull(car);
        assertEquals("SPORTS_CAR", car.getCarType().toString());
    }

    @Test
    public void testBuildCarManual() {
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();

        assertNotNull(carManual);
        assertEquals("Type of car: SPORTS_CAR\nCount of seats: 2\nEngine: volume - 3.0; mileage - 0.0\nTransmission: SEMI_AUTOMATIC\nTrip Computer: Functional\nGPS Navigator: Functional\n", carManual.print());
    }
}
