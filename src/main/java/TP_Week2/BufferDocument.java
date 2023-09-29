package TP_Week2;

public class BufferDocument implements Document {
    private Integer priority;
    private Integer size;
    private String name;
    private String author;

    public BufferDocument(Integer priority, Integer size, String name, String author)
    {
        this.priority = priority;
        this.size = size;
        this.author = author;
        this.name = name;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Document o) {
        return priority - o.getPriority();
    }

    @Override
    public String toString() {
        return "Priority: "+priority+" Name: "+name;
    }
}

