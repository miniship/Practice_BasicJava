package languagebasics;

import model.Bicycle;
import org.junit.Assert;
import org.junit.Test;

public class PassingReferenceDataTypeArgumentsTest {

    private PassingReferenceDataTypeArguments passingReferenceDataTypeArguments = new PassingReferenceDataTypeArguments();

    @Test
    public void modifyBicycleSpeedTest() {
        Bicycle bicycle = new Bicycle(1,1,50);

        int speed = passingReferenceDataTypeArguments.modifyBicycleSpeed(bicycle);

        Assert.assertEquals(40, bicycle.getSpeed());
        Assert.assertEquals(0, speed);
    }
}
