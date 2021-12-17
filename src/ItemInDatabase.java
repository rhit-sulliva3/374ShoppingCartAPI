class ItemInDatabase extends Item {
    private int stock;

    public ItemInDatabase(String itemID, double price, String name, String desc, String pictureAddress, int stock) {
        super(itemID, price, name, desc, pictureAddress);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return super.toString() + " Stock=" + stock;
    }
}
