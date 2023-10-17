package PLs_Week2_DLL;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class DoublyLinkedListIteratorTest {

    public DoublyLinkedListIteratorTest() {
    }
    /**
     * Test of hasNext, next methods, of class DoublyLinkedListIterator.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");

        DoublyLinkedList <Integer> instance = new DoublyLinkedList <>();

        for (int x=0; x<10; x++)
            instance.addLast(x);

        ListIterator <Integer> itr = instance.listIterator();
        for (int x=0; x<10; x++) {
            assertTrue("There should be as many as there were inserted", (itr.next()==x));
        }
    }
    /**
     * Test of hasPrevious, previous methods, of class DoublyLinkedListIterator.
     */
    @Test
    public void testHasPrevious() {
        System.out.println("hasPrevious");

        DoublyLinkedList <Integer> instance = new DoublyLinkedList <>();

        for (int x=0; x<10; x++)
            instance.addFirst(x);

        ListIterator <Integer> itr = instance.listIterator();
        while (itr.hasNext()) itr.next();
        for (int x=0; x<10; x++) {
            assertTrue("There should be as many as there were inserted", (itr.previous()==x));
        }
    }
    /**
     * Test of nextIndex method, of class DoublyLinkedListIterator.
     */
    @Test
    public void testNextIndex() {
        System.out.println("nextIndex");

        DoublyLinkedList <Integer> instance = new DoublyLinkedList <>();

        for (int x=0; x<10; x++)
            instance.addLast(x);

        ListIterator <Integer> itr = instance.listIterator();
        for (int x=0; x<=10; x++) {
            assertTrue("The indexes should be in order", (itr.nextIndex()==x));
            if (itr.hasNext()) itr.next();
        }
    }
    /**
     * Test of previousIndex method, of class DoublyLinkedListIterator.
     */
    @Test
    public void testPreviousIndex() {
        System.out.println("previousIndex");

        DoublyLinkedList <Integer> instance = new DoublyLinkedList <>();

        for (int x=0; x<10; x++)
            instance.addFirst(x);

        ListIterator <Integer> itr = instance.listIterator();
        while (itr.hasNext()) itr.next();
        for (int x=9; x>=-1; x--) {
            assertTrue("The indexes should be in inverse order", (itr.previousIndex()==x));
            if (itr.hasPrevious()) itr.previous();
        }
    }
    /**
     * Test of remove method, of class DoublyLinkedListIterator.
     */
    @Test
    public void testSet() {
        System.out.println("set");

        DoublyLinkedList <Integer> instance = new DoublyLinkedList <>();

        for (int x=0; x<10; x++)
            instance.addLast(x);

        ListIterator <Integer> itr = instance.listIterator();

        try {
            itr.set(99);
            assertTrue("There should have been an exception", false);
        } catch (NoSuchElementException e) {
        }

        for (int x=0; x<10; x++) {
            itr.next();
            itr.set(99);
        }

        for (Integer x : instance)
            assertTrue("All elements should be 99", (x==99));
    }
}