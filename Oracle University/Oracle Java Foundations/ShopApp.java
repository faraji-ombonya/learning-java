class ShopApp {
    public static void main(String[] args) {
        int measurement = 3;
        Customer c1 = new Customer("Pinky", 3);
        IO.println("Hello " + c1.getName());

        IO.println("Min price: " + Clothing.MINIMUM_PRICE);

        System.out.println();

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Sscarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

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