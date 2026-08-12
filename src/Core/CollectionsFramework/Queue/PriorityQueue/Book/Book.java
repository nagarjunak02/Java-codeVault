package Core.CollectionsFramework.Queue.PriorityQueue.Book;

public class Book /*implements Comparable<Book>*/{
    Integer id;
    String name;
    Double price;

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
//    @Override
//    public int compareTo(Book o) {
//        return this.price.compareTo(o.price);
//    }

}
