package att_1;

public class train_old extends trains {
    public String heating;
    public train_old(int train_number, String line, int wagons_count, String heating) {
        this.train_number = train_number;
        this.line = line;
        this.wagons_count = wagons_count;
        this.heating = heating;
    }

    public void print() {
        System.out.println("Номер поезда: " + train_number + "\n" + "Линия:" + line + "\n"
                + "Количество вагонов:" + wagons_count + "\n" + "обогрев:" + heating + "\n");
    }
}
