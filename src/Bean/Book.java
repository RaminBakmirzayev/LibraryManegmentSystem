package Bean;

public class Book {
    private int bookId;
    private String name;
    private String topic;
    private String publishYear;

    private  String publisher;

    public Book(){

    }
    public Book(int bookId, String name, String topic, String publishYear, String publisher) {
        this.bookId = bookId;
        this.name = name;
        this.topic = topic;
        this.publishYear = publishYear;
        this.publisher = publisher;
    }
    public int getId() {
        return bookId;
    }

    public void setId(int id) {
        this.bookId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
