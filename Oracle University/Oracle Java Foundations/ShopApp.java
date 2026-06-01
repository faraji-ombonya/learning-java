class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;
        int measurement = 3;
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.size = "S";
        IO.println("Hello " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Green Sscarf";
        item3.price = 5;
        item3.size = "S";

        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";

        Clothing[] items = { item1, item2, item3, item4 };

        // IO.println(item1.description + "," + item1.price + "," + item1.size);
        // IO.println(item2.description + "," + item2.price + "," + item2.size);

        // double totalBeforeTax = (item1.price) + (item2.price * 2);
        // total = totalBeforeTax + (totalBeforeTax * tax);

        for (Clothing item : items) {
            if (c1.size.equals(item.size)) {
                total += item.price + (item.price * tax);
                IO.println(item.description + "," + item.price + "," + item.size);
            }

            if (total > 15) {
                break;
            }
        }

        IO.println("Total: " + total);

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }
    }
}