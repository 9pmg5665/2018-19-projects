package lab5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
// Connor Berry u1700007
public class TextFileTesterVersion2
{
    public static void main(String[] args)
    {
        System.out.print("How many cars? ");
        char choice;
        List<Car> carList = new ArrayList<>();
        
        int numberOfCars = EasyScanner.nextInt();
        for (int i = 0; i < numberOfCars; i++)
        {
            if (i <= numberOfCars)
            {
                String tempReg;
                String tempMake;
                double tempPrice;
                
                System.out.print("Please enter the registration number: ");
		tempReg = EasyScanner.nextString();
		System.out.print("Please enter the make: ");
		tempMake = EasyScanner.nextString();
		System.out.print("Please enter the price: ");
		tempPrice = EasyScanner.nextDouble();
                carList.add(new Car(tempReg, tempMake, tempPrice));
                //for each car, list the number, make, and price.
	}
        }
        writeList(carList);
 }

// Writes and prints in the file.
static void writeList(List<Car> carListIn)
{
    try(
             //tries to 
            FileWriter carFile = new FileWriter("Cars.txt");
            PrintWriter carWriter = new PrintWriter(carFile);
            
        )
        {
            for (Car item :carListIn)
                
            {
              carWriter.println("Registration: " +item.getRegistration());
              carWriter.println("Make: " +item.getMake());
              carWriter.println("Price:" +item.getPrice());
              carWriter.println();
              
            }        
        }
        catch (IOException e)
        {
         System.out.println("error writing the file");
        } 
     }
}