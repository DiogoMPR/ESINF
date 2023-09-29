package TP_Week2;

public interface Document extends Comparable <Document> {
    Integer getPriority();
    Integer getSize();
    String getName();
    String getAuthor();
}
