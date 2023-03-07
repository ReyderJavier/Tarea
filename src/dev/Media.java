package dev;
import java.util.Scanner;
public class Media {
	public class main_class {
	    public static void main(String[] args){
	      int sum = 0, inputNum;
	      int counter;
	      float mean;
	      Scanner NumScanner = new Scanner(System.in);
	      
	      System.out.println("Cuantos numeros desea calcular:");

	      counter = NumScanner.nextInt();
	      
	      System.out.println(" Ingresa " + counter + " números:");
	      
	      for(int x = 1; x<=counter ;x++){          
	          inputNum = NumScanner.nextInt();
	          sum = sum + inputNum;
	          System.out.println();
	      }
	      
	      mean = sum / counter;
	      System.out.println("La media aritmética es: " + mean);
	      NumScanner.close();
	    }
	    
	}

}
