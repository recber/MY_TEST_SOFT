
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulik-sy
 */
public class ArryySortTest {
  public static void main (String args[]) {
    int n ;
    int FirstNumber ;
    int SecondNumber ;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите размер массива");
    n = in.nextInt();
    System.out.println("Введите первое число");
    FirstNumber = in.nextInt();
    System.out.println("Введите второе число");
    SecondNumber = in.nextInt();
    for (int i = 1; i < n+1; i++){
        /*int[ ] arr = new int [i] ;*/
     if ((i%FirstNumber)==0 & (i%SecondNumber)==0){
          System.out.print(i + " ");
        }
      }
    }
  }
    
