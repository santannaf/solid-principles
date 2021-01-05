package main.com.example.solid.OpenClosed.utils;

public class Buy {
    private Product product;
    private String city;

    public Buy(Product product) {
        this.product = product;
    }

    public Buy() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}