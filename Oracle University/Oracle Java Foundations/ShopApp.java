class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;
        int measurement = 3;
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        IO.println("Hello " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item3.setDescription("Green Sscarf");
        item3.setPrice(5);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        Clothing[] items = { item1, item2, item3, item4 };

        c1.addItems(items);

        for (Clothing item : c1.getItems()) {
            if (c1.getSize().equals(item.getSize())) {
                IO.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
            }
        }

        IO.println("Total: " + c1.getTotalClothingCost());

        c1.setSize(measurement);

    }
}