package att_1;

public class Schedule {
    public String time_arrival;
    public String name_station;
    public int train_number;
    public String line;

    public Schedule(String time_arrival, String name_station, int train_number, String line) {
        this.time_arrival = time_arrival;
        this.name_station = name_station;
        this.train_number = train_number;
        this.line = line;
    }

    public String getTime_arrival() {
        return time_arrival;
    }

    public void setTime_arrival(String time_arrival) {
        this.time_arrival = time_arrival;
    }

    public String getName_station() {
        return name_station;
    }

    public void setName_station(String name_station) {
        this.name_station = name_station;
    }

    public int getTrain_number() {
        return train_number;
    }

    public void setTrain_number(int train_number) {
        this.train_number = train_number;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
