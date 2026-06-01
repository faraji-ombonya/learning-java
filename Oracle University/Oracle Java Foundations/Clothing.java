class Clothing {
    public static final double MINIMUM_PRICE = 10.0;
    public static final double TAX_RATE = 0.2;
    private String description;
    private double price;
    private String size = "M";

    public Clothing(String description, double price, String size) {
        setDescription(description);
        setPrice(price);
        setSize(size);
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void setPrice(double price) {

        if (price < MINIMUM_PRICE) {
            this.price = MINIMUM_PRICE;
        }

        this.price = price;

        // Alternative approach
        // this.price = price < MINIMUM_PRICE ? MINIMUM_PRICE : price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }
}