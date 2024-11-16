package att_1;

public class station_work extends Station {
    private int years_work;

    public station_work(String street_location, int years_work, String name_station, int awg_workload) {
        super(name_station, awg_workload, street_location);
        this.years_work = years_work;

    }

    public int getYears_work() {
        return years_work;
    }

    public void setYears_work(int years_work) {
        this.years_work = years_work;
    }

    public void print() {
        System.out.println("название станции: " + name_station + "\n" + "среднняя нагрузка станции: " + awg_workload + "\n"
                + "Улица станции: " + street_location + "\n" + "лет работы: " + years_work + "\n");
    }
}
