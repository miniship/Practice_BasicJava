package languagebasics;

import model.MountainBike;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {


    @Test
    public void noArgumentConstructorTest() {
        MountainBike mountainBike = new MountainBike();

        Assert.assertEquals(0, mountainBike.getGear());
        Assert.assertEquals(0, mountainBike.getCadence());
        Assert.assertEquals(0, mountainBike.getSpeed());
        Assert.assertEquals(0, mountainBike.getSeatHeight());
        Assert.assertEquals(10, MountainBike.getCapacity());
    }

    @Test
    public void constructorTest() {
        MountainBike mountainBike = new MountainBike(1,2,3,4);

        Assert.assertEquals(1, mountainBike.getCadence());
        Assert.assertEquals(2, mountainBike.getGear());
        Assert.assertEquals(3, mountainBike.getSpeed());
        Assert.assertEquals(4, mountainBike.getSeatHeight());
        Assert.assertEquals(10, MountainBike.getCapacity());
    }
}