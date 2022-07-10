package person.cls;

/**
 * 有参构造器注入属性
 */
public class Book {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void printBook() {
        System.out.println(name + "::" + author);
    }

}
