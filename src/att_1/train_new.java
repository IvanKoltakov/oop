package att_1;

public class train_new extends trains {
    public String pay_card;
    public train_new(int train_number, String line, int wagons_count, String pay_card) {
        this.train_number = train_number;
        this.line = line;
        this.wagons_count = wagons_count;
        this.pay_card = pay_card;
    }

    public void print() {
        System.out.println("Номер поезда:" + train_number + "\n" + "Линия:" + line + "\n"
                + "Количество вагонов:" + wagons_count + "\n" + "оплата картой:" + pay_card + "\n");
    }
}
