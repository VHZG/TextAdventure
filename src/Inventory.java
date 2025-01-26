import java.util.ArrayList;

public class Inventory {

    ArrayList<String> inventoryList = new ArrayList<>();

    public void addToInventory(String tools){
        inventoryList.add(tools);
    }

    public void showInventory(){

        if(inventoryList.isEmpty()){
            System.out.println("You dont have any items on your inventory. ");
        }else{
            System.out.println("Inventory: ");

            for(String item : inventoryList){
                System.out.println(item);
            }
        }
    }

}
