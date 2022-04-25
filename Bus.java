
public class Bus {


    private int plateNo;
    private int busNo;
    Driver driver;
    Hostess hostess;
    Seat seat;
    Trip trip;

    public int getPlateNo() {
        return plateNo;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setPlateNo(int plateNo) {
        this.plateNo = plateNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
}
