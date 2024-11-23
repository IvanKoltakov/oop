package att_2.task_6;

import java.util.Objects;

public class Patients implements Comparable<Patients> {
    private String name;
    private String disease;
    private SNILS snils;

    public Patients(String name, String disease, SNILS snils) {
        this.name = name;
        this.disease = disease;
        this.snils = snils;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public SNILS getSnils() {
        return snils;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patients patients = (Patients) o;
        return Objects.equals(name, patients.name) && Objects.equals(disease, patients.disease) && Objects.equals(snils, patients.snils);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, disease, snils);
    }

    @Override
    public int compareTo(Patients o) {
        return this.snils.compareTo(o.snils);
    }
}
