import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MyLinkedListTest {

    @Test
    public void shouldAddElementToEndOfLinkedList() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.append(1);
        list.append(2);

        assertEquals(list.getTail(), new Integer(2));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowNoSuchElementException() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.getHead();
    }

    @Test
    public void shouldAddElementToFrontOfLinkedList() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.prepend(1);
        list.prepend(2);

        assertEquals(list.getHead(), new Integer(2));
    }

    @Test
    public void shouldRemoveElementFromMiddleOfList() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.append(1);
        list.append(2);
        list.append(3);

        list.remove(2);

        assertFalse(list.contains(2));
    }

}
