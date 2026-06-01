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

        // IO.println(item1.description + "," + item1.price + "," + item1.size);
        // IO.println(item2.description + "," + item2.price + "," + item2.size);

        // double totalBeforeTax = (item1.price) + (item2.price * 2);
        // total = totalBeforeTax + (totalBeforeTax * tax);

        for (Clothing item : items) {
            if (c1.getSize().equals(item.getSize())) {
                total += item.getPrice();
                IO.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
            }

            if (total > 15) {
                break;
            }
        }

        IO.println("Total: " + total);

        switch (measurement) {
            case 1, 2, 3:
                c1.setSize("S");
                break;
            case 4, 5, 6:
                c1.setSize("M");
                break;
            case 7, 8, 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }
    }
}