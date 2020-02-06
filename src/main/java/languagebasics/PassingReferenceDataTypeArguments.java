package languagebasics;

import model.Bicycle;

public class PassingReferenceDataTypeArguments {
    public int modifyBicycleSpeed(Bicycle bicycle) {
        bicycle.applyBrake(10);
        bicycle = new Bicycle();
        return bicycle.getSpeed();
    }
}
