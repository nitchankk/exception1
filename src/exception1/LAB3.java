/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class LAB3 {
   public static void main(String[] args) {
       int[] list = new int[10];
       try{
           System.out.println("Statement 1");
           System.out.println("Statement 2");
           System.out.println("Statement 3");
       }
       catch (Exception e){
       }
       finally{
           System.out.println("Statement 4");
       }
       System.out.println("Statement 5");
    }
}