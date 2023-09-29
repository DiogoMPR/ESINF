package TP_Week2;

import java.util.ArrayList;
import java.util.Iterator;

public class PriorityBufferPrinter<E extends Document> implements Iterable<E> {

    private final ArrayList<E> buffer;
    private final Integer maxSize;

    /**
     * Creates a new PriorityBufferPrinter with a maximum buffer size maxSize
     *
     * @param maxSize maximum buffer size
     */

    //b) Implement one constructor of PriorityBufferPrinter which receives the object’s maximum allowed
    //memory.
    public PriorityBufferPrinter(Integer maxSize) {
        buffer = new ArrayList<>(); // Diamond notation: the type can be inferred by the compiler
        this.maxSize = maxSize;
    }

    /** Calculates the size occupied by the docs in the buffer
     *  @return size occupied
     * */

    private Integer usedSize(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //c) Create the method addDocument of PriorityBufferPrinter which adds a Document to the buffer in the
    //order presented above. Use ordered insertion.

    /**
     * Adds a document to the buffer.Documents are added using a numeric priority system, being FIFO when priorities are equal.
     *
     * @param doc   the document to be added to the buffer
     * @return      true if the buffer has space, false otherwise
     */

    public Boolean addDocument(E doc) {
        int usedSize = 0;
        for (int i = 0; i < buffer.size(); i++) {
            usedSize += buffer.get(i).getSize();
        }

        if(usedSize + doc.getSize() > maxSize){
            return false;
        }

        int i = 0;
        while(i < buffer.size()){
            if(buffer.get(i).compareTo(doc) >= 0){
                buffer.add(i, doc);
                return true;
            }
            i++;
        }
        buffer.add(doc);
        return true;
    }

    // d) Create the method getDocument of PriorityBufferPrinter which returns and deletes from the buffer
    //the next Document in the order presented above.

    /**
     * Gets the next document in the queue.
     *
     * @return The next document in the queue
     */

    public E getDocument() {
        if(buffer.isEmpty()){
            return null;
        }
        E doc = buffer.get(buffer.size()-1); // get the first
        buffer.remove(buffer.size()-1); // delete it and return it

        return doc;
    }

    // e) Create the method delDocument of PriorityBufferPrinter which deletes a document from the buffer
    //(if it exists), given a name and an author.

    /**
     * Deletes a document from the buffer (if it exists), given a name and an author
     *
     * @param name      the name of the Document
     * @param author    the author of the Document
     * @return          true if the document existed, false otherwise
     */

    public Boolean delDocument(String name, String author) {
        int i = 0;

        while (i<buffer.size()){
            E doc = buffer.get(i);
            if(doc.getName().equals(name) && doc.getAuthor().equals(author)){
                buffer.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    // f) Create the method delDocumentsAbove of PriorityBufferPrinter which deletes all the documents
    //which size is superior to a given size.

    /**
     * Deletes all the documents which are superior to a given size
     *
     * @param size  the size above which documents will be deleted
     * @return      true if there is at least one Document size
     */

    public Boolean delDocumentsAbove(Integer size) {
        int i = 0;
        Boolean ret = false;
        while(i < buffer.size()){
            if(buffer.get(i).getSize() > size){
                buffer.remove(i);
                i--;
                ret = true;
            }
            i++;
        }
        return ret;
    }

    @Override
    public String toString() {
        return "PriorityBufferPrinter :" + "\n" +
                "buffer = " + buffer +
                ", maxSize=" + maxSize;
    }

    @Override
    public Iterator<E> iterator() {
        return buffer.iterator();
    }

}
