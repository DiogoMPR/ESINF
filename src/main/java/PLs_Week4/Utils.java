package PLs_Week4;

import java.util.List;

public class Utils {
    public static <E extends Comparable<E>> Iterable<E> sortByBST(List<E> listUnsorted) {
        BST<E> BSTTree = new BST<>();
        for (E element : listUnsorted) {
            BSTTree.insert(element);
        }
        return BSTTree.inOrder();
     }
}