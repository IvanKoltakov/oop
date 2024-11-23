package att_2.task_5;

import att_1.*;
import att_2.task_5.exceptions.*;

import static att_2.task_5.services.service.checkParam;
import static att_2.task_5.services.service.station_position;

public class main {
    public static void main(String[] args) throws CheckedException {
        train_new train = new train_new(1, "кольцевая", 5, "есть");
        Schedule schedule = new Schedule("10:20", "северная", 1, "кольцевая");
        try {
            checkParam(train);
        } catch (CheckedException e) {
            System.out.println("у поезда " + train.getTrain_number() + " " + e.getMessage());
        }

        try {
            station_position(train, schedule);
        } catch (UncheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
