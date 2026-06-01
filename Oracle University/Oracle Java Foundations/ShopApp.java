class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        Customer c1 = new Customer();
        c1.setName("Pinky");
        IO.println("Hello " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        IO.println(item1.description + "," + item1.price + "," + item1.size);
        IO.println(item2.description + "," + item2.price + "," + item2.size);

        double totalBeforeTax = (item1.price) + (item2.price * 2);

        total = totalBeforeTax + (totalBeforeTax * tax);

        IO.println("Total: " + total);
    }
}