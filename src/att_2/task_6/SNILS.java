package att_2.task_6;

import java.util.Objects;

public class SNILS implements Comparable<SNILS> {
    private int number;
    private String create_date;
    private String series;

    public SNILS(int number, String create_date, String series) {
        this.number = number;
        this.create_date = create_date;
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public String getCreate_date() {
        return create_date;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SNILS snils = (SNILS) o;
        return series == snils.series && Objects.equals(number, snils.number) && Objects.equals(create_date, snils.create_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, create_date, series);
    }

    @Override
    public int compareTo(SNILS o) {
        return this.series.compareTo(o.series);
    }
}
