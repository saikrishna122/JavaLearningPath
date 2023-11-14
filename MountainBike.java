public class MountainBike  extends  Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed,int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;//always needs to be the first statement
    }
    public void setHeight (int newValue)
    {
        seatHeight=newValue;
    }
    @Override public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
