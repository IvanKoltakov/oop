package att_1;

public class Main {
    public static void main(String[] args){
        train_new train = new train_new(5,"северная",12,"есть");
        train_old train_old = new train_old(20,"окружная",17, "нет");
        train_old.print();
        train.print();
        train.setNumber(11);
        train.setLine("южная");
        train.setWagonsCount(20);
        train.getNumber();
        train.getLine();
        train.getWagonsCount();
        Station Station = new Station("ботанический сад",50,"новокузнецкая");
        Station.print();
        Schedule Schedule = new Schedule("питерская","12:35",20);
        Schedule.print();
        Schedule.setTimeArrival("10:50");
        Schedule.setNumber(2);
        Schedule.setNameStation("северная");
        Schedule.getTimeArrival();
        Schedule.getNumber();
        Schedule.getNameStation();
    }
}
