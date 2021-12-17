abstract class Item {
    private String itemID;
    private double price;
    private String name;
    private String desc;
    private String pictureAddress;

    public Item(String itemID, double price, String name, String desc, String pictureAddress) {
        this.itemID = itemID;
        this.price = price;
        this.name = name;
        this.desc = desc;
        this.pictureAddress = pictureAddress;
    }

    public String getItemID() {
        return itemID;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID='" + itemID + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", pictureAddress='" + pictureAddress + '\'' +
                '}';
    }
}
