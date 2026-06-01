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

        Clothing[] items = { item1, item2 };

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        // IO.println(item1.description + "," + item1.price + "," + item1.size);
        // IO.println(item2.description + "," + item2.price + "," + item2.size);

        for (Clothing clothing : items) {
            if (c1.size == clothing.size) {
                IO.println(clothing.description + "," + clothing.price + "," + clothing.size);
            }
        }

        // double totalBeforeTax = (item1.price) + (item2.price * 2);
        // total = totalBeforeTax + (totalBeforeTax * tax);

        for (Clothing item : items) {
            if (c1.size == item.size) {
                total += item.price + (item.price * tax);
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