class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int size) {
        switch (size) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("X");
        }
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0.0;

        for (Clothing clothing : items) {
            total += clothing.getPrice();
        }

        return total;
    }

    public double calculateAveragePrice() {

        int total = 0;
        int count = 0;

        for (Clothing clothing : items) {
            if (clothing.getSize().equals("L")) {

                total += clothing.getPrice();
            }
        }

        IO.println("TOT:: " + total + " Count::" + count);

        return total / count;
    }
}
