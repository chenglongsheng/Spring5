package person.cls;

/**
 * 通过setter方式注入
 */
public class Order {

    private String name;
    private Integer price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void printOrder() {
        System.out.println(name + "::" + price);
    }

}
