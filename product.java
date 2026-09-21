class Product {
    private String id, name, category, seller, description;
    private double price;
    private int stock;

    public Product(String id, String name, String category, double price,
                   int stock, String seller, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.seller = seller;
        this.description = description;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public String getSeller() { return seller; }
    public String getDescription() { return description; }

    public void update(String name, String category, double price,
                       int stock, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= 0 || quantity > stock) return false;
        stock -= quantity;
        return true;
    }

    public String toString() {
        return id + " | " + name + " | " + category +
                " | price=" + price + " | Stock: " + stock;
    }
}