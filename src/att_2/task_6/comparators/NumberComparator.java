package att_2.task_6.comparators;

import att_2.task_6.Patients;
import att_2.task_6.SNILS;

import java.util.Comparator;

public class NumberComparator implements Comparator<SNILS> {

    @Override
    public int compare(SNILS o1, SNILS o2) {
        return o1.getNumber() - o2.getNumber();
    }
}
