package att_2.task_5.services;

import att_1.train_new;
import att_1.Schedule;
import att_2.task_5.exceptions.CheckedException;
import att_2.task_5.exceptions.UncheckedException;

import java.util.Objects;

public class service {
    public static void checkParam(train_new train) throws CheckedException {
        if (train.getTrain_number() <= 0 || train.getWagons_count() <= 0 ||
                train.getWagons_count() > 20 || train.getLine() == "")
            throw new CheckedException("не верный/е параметры ");
    }

    public static void station_position(train_new train, Schedule schedule) throws UncheckedException {
        if (train.getTrain_number() == schedule.getTrain_number() &&
                Objects.equals(train.getLine(), schedule.getLine())) return;
        throw new UncheckedException("Эти поезд и станция не совпадают.");
    }
}
