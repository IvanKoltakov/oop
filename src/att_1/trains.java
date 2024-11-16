package att_1;

public abstract class trains implements Interface{
    public int train_number;
    public String line;
    public int wagons_count;

    public void getNumber() {
        System.out.println("Номер вагона " + this.train_number);
    }

    public void setNumber(int train_number) {
        this.train_number = train_number;
    }

    public void getLine() {
        System.out.println("Поезд ходит по линии - " + this.line);
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void getWagonsCount() {
        System.out.println("Поезд состоит из " + this.wagons_count + " вагонов.");
    }

    public void setWagonsCount(int wagons_count) {
        this.wagons_count = wagons_count;
    }
}
