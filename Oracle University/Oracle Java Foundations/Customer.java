class Customer {
    private String name;
    private String size;
    private Clothing[] items;

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
}
