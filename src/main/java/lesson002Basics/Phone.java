package lesson002Basics;

public class Phone {
    private double price;
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getPriceAndBrand() {
        String priceAndBrand = "Phone's price: " + price + " Phone's brand: " + brand;
        return priceAndBrand;
    }

    public static void main(String[] args) {
        Phone galaxyNote = new Phone("Samsung");
        galaxyNote.setPrice(999);
        System.out.println(galaxyNote.getPriceAndBrand());
    }
}

