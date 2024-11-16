package att_1;

public abstract class Station implements Interface{
    public String name_station;
    public int awg_workload;
    public String street_location;

    public Station(String name_station, int awg_workload, String street_location) {
        this.name_station = name_station;
        this.awg_workload = awg_workload;
        this.street_location = street_location;
    }

    public void getNameStation() {
        System.out.println("Название станции:" + this.name_station);
    }

    public void setNameStation(String name_station) {
        this.name_station = name_station;
    }

    public void getAwgWorkload() {
        System.out.println("Средняя нагрузка станции:" + this.awg_workload);
    }

    public void setAwgWorkload(int awg_workload) {
        this.awg_workload = awg_workload;
    }

    public void getStreetLocation() {
        System.out.println("Улица на которой находится станция:" + this.street_location);
    }

    public void setStreetLocation(String street_location) {
        this.street_location = street_location;
    }

}
