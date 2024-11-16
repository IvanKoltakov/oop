package att_1;

public class Schedule {
    public String time_arrival;
    public String name_station;
    public int train_number;

    public Schedule(String name_station, String time_arrival,int train_number) {
        this.name_station = name_station;
        this.time_arrival = time_arrival;
        this.train_number = train_number;
    }

    public void getNameStation() {
        System.out.println("Название станции:" + this.name_station);
    }

    public void setNameStation(String name_station) {
        this.name_station = name_station;
    }
    public void getTimeArrival() {
        System.out.println("Время прибытия:" + this.time_arrival);
    }

    public void setTimeArrival(String time_arrival) {
        this.time_arrival = time_arrival;
    }

    public void getNumber() {
        System.out.println("Номер вагона " + this.train_number);
    }

    public void setNumber(int train_number) {
        this.train_number = train_number;
    }

    public void print() {
        System.out.println("Номер поезда: " + train_number + "\n" + "Время прибытия::" + time_arrival + "\n"
                + "Название станции:" + name_station + "\n");
    }
}
