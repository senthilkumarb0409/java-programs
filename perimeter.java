


import java.util.*;
class perimeter{
  public static void main(String args[]){
  
    //Perimeter of rectangle

    Scanner length = new Scanner(System.in); 
    System.out.println("Enter the length of rectangle:");
    int l=length.nextInt();
    Scanner width = new Scanner(System.in);
    System.out.println("Enter the breadth of rectangle:");
    int b=width.nextInt();
    System.out.println("Perimeter of rectangle="+2*(l+b));
  
    //Perimeter of circle

    Scanner radius = new Scanner(System.in);
    System.out.println("Enter the radius of circle:");
    double r=radius.nextDouble();
    System.out.println("Perimeter of circle="+2*3.14*r);
  }
   
}