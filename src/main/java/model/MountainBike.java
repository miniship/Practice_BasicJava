package model;

public class MountainBike extends Bicycle {
    private int seatHeight;
    private static int capacity;

    static {
        capacity = 10;
    }

    public MountainBike() {
        seatHeight = 0;
    }

    public MountainBike(int cadence, int gear, int speed, int seatHeight) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static int getCapacity() {
        return capacity;
    }
}
