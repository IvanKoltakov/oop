package att_2.task_7.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import att_2.task_7.*;

public class tests {
    private DoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void testAdd() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(3, list.getSize());
        assertEquals(10, list.getHead().data);
        assertEquals(30, list.getTail().data);
    }

    @Test
    void testAddFirst() {
        list.add(20);
        list.addFirst(10);
        assertEquals(2, list.getSize());
        assertEquals(10, list.getHead().data);
        assertEquals(20, list.getTail().data);
    }

    @Test
    void testRemove() {
        list.add(10);
        list.add(20);
        list.add(30);

        assertTrue(list.remove(20));
        assertEquals(2, list.getSize());
        assertNull(list.find(20));

        assertFalse(list.remove(40));
    }

    @Test
    void testFind() {
        list.add(10);
        list.add(20);
        list.add(30);

        assertNotNull(list.find(20));
        assertEquals(20, list.find(20).data);
        assertNull(list.find(40));
    }

    @Test
    void testGetHead() {
        list.add(10);
        assertNotNull(list.getHead());
        assertEquals(10, list.getHead().data);
    }

    @Test
    void testGetTail() {
        list.add(10);
        list.add(20);
        assertNotNull(list.getTail());
        assertEquals(20, list.getTail().data);
    }

    @Test
    void testGetSize() {
        assertEquals(0, list.getSize());
        list.add(10);
        assertEquals(1, list.getSize());
        list.add(20);
        assertEquals(2, list.getSize());
        list.remove(10);
        assertEquals(1, list.getSize());
    }
}
