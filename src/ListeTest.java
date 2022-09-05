import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();
    Node node = new Node("1");

    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertEquals(true, liste.isEmpty());

        liste.head = node;
        liste.tail = node;

        assertEquals(false, liste.isEmpty());


    }

    @Test
    void insertFromHead() {

        liste.insertFromHead(new Node("1"));
        assertEquals("1",liste.printFromHead());

    }

    @Test
    void insertFromTail() {

        liste.insertFromTail(new Node("1"));
        assertEquals("1",liste.printFromTail());

    }
}