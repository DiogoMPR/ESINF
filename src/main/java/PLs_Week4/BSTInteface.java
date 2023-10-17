package PLs_Week4;

import java.util.List;
import java.util.Map;

public interface BSTInteface<E> {

    public boolean isEmpty();
    public void insert(E element);
    public void remove(E element);

    public int size();
    public int height();

    public E smallestElement();
    public Iterable<E> inOrder();
    public Iterable<E> preOrder();
    public Iterable<E> posOrder();
    public Map<Integer, List<E>> nodesByLevel();

}
