package att_2.task_6.test;

import att_2.task_6.Patients;
import att_2.task_6.SNILS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import att_2.task_6.comparators.*;

public class tests {
    SNILS n1 = new SNILS(12, "12:05:24", "123-456-78-9");
    Patients p1 = new Patients("Димитрий", "камни в почках", n1);
    Patients p2 = new Patients("Добрыня", "синяк под глазом", n1);
    Patients p3 = new Patients("Толик", "стрела в колене", n1);

    SNILS n2 = new SNILS(13, "20:05:24", "122-222-78-9");
    Patients p4 = new Patients("Святослав", "удар об пол", n2);
    Patients p7 = new Patients("митяй", "упал", n2);

    Patients p11 = new Patients("Димитрий", "камни в почках", n1); // - p1
    Patients p111 = new Patients("Димитрий", "камни в почках", n1);
    SNILS n11 = new SNILS(12, "12:05:24", "123-456-78-9");// -- n1
    @Test
    public void equalPatients() {
        Assertions.assertEquals(p1, p1);//рефлексивность

        Assertions.assertEquals(p1, p11);//симметричность
        Assertions.assertEquals(p11, p1);
        Assertions.assertNotEquals(p1, p2);
        Assertions.assertNotEquals(p2, p1);

        Assertions.assertEquals(p1, p11);//транзитивность
        Assertions.assertEquals(p1, p111);
        Assertions.assertEquals(p111, p11);

        Assertions.assertNotEquals(p2, p3);//постоянность
        Assertions.assertNotEquals(p2, p3);

        Assertions.assertNotEquals(p2, null);//неравенство с null
    }
    @Test
    public void hashCodePatients(){
        Assertions.assertEquals(p1.hashCode(), p11.hashCode());// равный hashCode
        Assertions.assertEquals(p1.hashCode(), p111.hashCode());
        Assertions.assertEquals(p11.hashCode(), p111.hashCode());
    }

    @Test
    public void equalsSNILS() {
        Assertions.assertEquals(n1, n11);
        Assertions.assertEquals(n11, n1);
    }

    @Test
    public void hashCodeSNILS() {
        Assertions.assertEquals(n1.hashCode(), n11.hashCode());
    }
    @Test
    public void sortPatientsComparable() {
        List<Patients> Patient = Arrays.asList(p1,p2,p3,p4,p7,p11,p111);
        Collections.sort(Patient);
        List<Patients> expectedPatients = Arrays.asList(p1, p2, p3, p4, p7, p11, p111);
        Assertions.assertEquals(Patient, expectedPatients);
    }
    @Test
    public void sortPatientsComparator01() {
        List<Patients> Patient = Arrays.asList(p1,p2,p3,p4,p7,p11,p111);
        Collections.sort(Patient,new NameComparator());
        List<Patients> expectedPatients = Arrays.asList(p1,p2,p3,p4,p7,p11,p111);
        Assertions.assertEquals(Patient, expectedPatients);
    }
}

