import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class CompanyDatabase {
    ArrayList<ItemInDatabase> itemsInDatabase = new ArrayList<>();
    ArrayList<DiscountCode> codesInDatabase = new ArrayList<>();

    public CompanyDatabase() {
        try (BufferedReader br = new BufferedReader(new FileReader("ExampleItems.csv"))) {
            String itemID;
            double price;
            String name;
            String desc;
            String address;
            int quantity;
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                itemID = values[0];
                price = Double.parseDouble(values[1]);
                name = values[2];
                desc = values[3];
                address = values[4];
                quantity = Integer.parseInt(values[5]);
                itemsInDatabase.add(new ItemInDatabase(itemID,price,name,desc,address,quantity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("ExampleDiscountCodes.csv"))) {
            String code;
            double discountAmount;
            String[] reqItemIDs;
            String[] conflictingCodes;
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                code = values[0];
                discountAmount = Double.parseDouble(values[1]);
                reqItemIDs = values[2].split(";");
                conflictingCodes = values[3].split(";");
                codesInDatabase.add(new DiscountCode(code, discountAmount, reqItemIDs, conflictingCodes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (ItemInDatabase item : itemsInDatabase){
//            System.out.println(item.toString());
//        }
//        for (DiscountCode code: codesInDatabase) {
//            System.out.println(code.toString());
//        }
    }

    private ItemInDatabase findItemByID(String itemID){
        for(ItemInDatabase item: itemsInDatabase){
            if(item.getItemID().equals(itemID)) return item;
        }
        return null;
    }

    public ItemInCart findItemAndStock(String itemID,int quantity){
        ItemInDatabase found = findItemByID(itemID);
        if (found == null) return null;
        if (found.getStock() < quantity) return new ItemInCart(found.getItemID(),found.getPrice(),found.getName(),found.getDesc(),found.getPictureAddress(),quantity,false);
        return new ItemInCart(found.getItemID(),found.getPrice(),found.getName(),found.getDesc(),found.getPictureAddress(),quantity,true);
    }

    public DiscountCode findDiscountCode(String code){
        for(DiscountCode found: codesInDatabase){
            if(found.getCode().equals(code)) return found;
        }
        return null;
    }
}
