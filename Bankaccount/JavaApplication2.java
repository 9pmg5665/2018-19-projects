




/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

 
import java.util.ArrayList;
 
/**
*
* @author thiag
*/
public class JavaApplication2 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<BankAccount> arrayBank = new ArrayList<>();
      
      arrayBank.add(new BankAccount("1500", "Comodos"));
      arrayBank.add(new BankAccount("2500", "Honorius"));
      arrayBank.add(new BankAccount("3500", "Tiberius"));
      System.out.println(arrayBank.get(0));
      System.out.println(arrayBank.get(1));
      System.out.println(arrayBank.get(2));
    }
}


