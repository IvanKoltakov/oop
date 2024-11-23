package att_2.task_6.comparators;

import java.util.Comparator;

import att_2.task_6.Patients;
public class NameComparator implements Comparator<Patients>{
    @Override
    public int compare(Patients a1, Patients a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
