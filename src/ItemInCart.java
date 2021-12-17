class ItemInCart extends Item{
    private int quantity;
    private boolean available;

    public ItemInCart(String itemID, double price, String name, String desc, String pictureAddress, int quantity, boolean available) {
        super(itemID, price, name, desc, pictureAddress);
        this.quantity = quantity;
        this.available = available;
    }


}
