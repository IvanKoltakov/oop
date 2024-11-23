package att_1;

public abstract class trains implements Interface{
    public int train_number;
    public String line;
    public int wagons_count;

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

    public int getWagons_count() {
        return wagons_count;
    }

    public void setWagons_count(int wagons_count) {
        this.wagons_count = wagons_count;
    }
}
