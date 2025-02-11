package tasks_java;

interface Product {
    String getTitle();
    double getFinalPrice();
}

class Electronics implements Product {
    private String title;
    private double price;

    Electronics(String title, double price) {
        this.title = title;
        this.price = price;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getFinalPrice() {
        return price * 0.9;
    }
}

class Clothing implements Product {
    private String title;
    private double price;

    Clothing(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getFinalPrice() {
        return price * 0.85;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

class Food implements Product {
    private String title;
    private double price;

    Food(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getFinalPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
