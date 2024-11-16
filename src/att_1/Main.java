package att_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        train_new train = new train_new(5,"северная",12,"есть");
        train_old train_old = new train_old(20,"окружная",17, "нет");
        train_old train_new = new train_old(22,"окружная",12, "да");
        station_work station_work = new station_work("арбатская", 20,"восточная", 500);

        List<Interface> list = new ArrayList<>();
        list.add(station_work);
        list.add(train_old);
        list.add(train_new);

        for(Interface i : list){
            i.print();
        }
    }
}
