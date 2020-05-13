package queue;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author connor berry
 */
public class DeadlyQUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ppl = 10;
	int k = 3;
        int curr = 0;
	
	ArrayList<Integer> queue = new ArrayList<>();
	
	for(int i = 1; i <= ppl; i++) {
		queue.add(i);
	}
        
        //program starts at 1, skips the next k(3) people (2,3,4) and kills the next person (5) and repeats.
        
        System.out.print("Killers Queue"+queue);
        System.out.println();
        System.out.println();
        
        do {
        	curr = curr + k + 1; //+1 to make next person be executed
            
            while(queue.size() - 1 < curr) {
                curr = curr - queue.size();
            }
            
            queue.remove(curr);
            System.out.println(queue);
            curr--;
        
        }while(queue.size() > 1);
        
        
        System.out.println("Escapee(Avoids execution) = " + queue.get(0));
        

        
        
    }
    
}
