import java.io.*;
import java.util.*;

public class DoraemonClient implements Doraemon{
   
    ArrayList<String> doraemon = new ArrayList<>();
    int count = 0;
    public void addItem(String itemName){
        doraemon.add(itemName);
        count +=1;
    };
    
    public void removeItem(String itemName){
        int check = 0;
        if (count>0){
            for (int i = 0; i < count; i++){
                if (doraemon.get(i) == itemName){
                    check = 1;
                    doraemon.remove(itemName);
                    count -=1;
                }
            } 
            if (check != 1){
                System.out.println("Item not found");
            } 
        }  
        else {
            System.out.println("Empty List");
        }  
    }
    
    public void printItems(){
        if (count>0){
            //for (int i = 0; i < count; i++){
                System.out.println(doraemon.toString());
            //}
        }
        else{
            System.out.println("Empty list");
        }

    };
    
    public int getNumItems(){
        return count;

    };
}
class DoraemonClientDemo {
   
    
    public static void main(String[] args) {
        DoraemonClient client = new DoraemonClient();
        System.out.println(client.getNumItems());
        client.printItems();
        System.out.println("Adding 3 elements:");
        client.addItem("1");
        client.addItem("2");
        client.addItem("3");
        System.out.println(client.getNumItems());
        client.printItems();
        System.out.println("Trying to remove 4 not exist: ");
        client.removeItem("4");
        System.out.println(client.getNumItems());
        client.printItems();
        System.out.println("Remove 1: ");
        client.removeItem("1");
        System.out.println(client.getNumItems());
        client.printItems();
        System.out.println("Remove 2:");
        client.removeItem("2");
        System.out.println(client.getNumItems());
        client.printItems();
        System.out.println("Remove 3:");
        client.removeItem("3");
        System.out.println(client.getNumItems());
        client.printItems();
        System.out.println("Trying to remove 1 again in empty string:");
        client.removeItem("1");
        System.out.println(client.getNumItems());
        client.printItems();



    
}
}
