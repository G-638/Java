/**
 * @author sathish
 * custom data class
 */
public class ProductDetail {
    String name, id;
    Double price;

    ProductDetail(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
