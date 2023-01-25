import java.util.Scanner;

import java.util.*;
public class Furniture{
       int width;
       int height;
       int item;
       void display(String items){
        System.out.println(item +"width" +width+ "Height" +height);
       }
       public static void main (String[] args) {
        Chair neelkamal = new Chair();
        neelkamal.foo();
    }
}
class Chair extends Furniture{
    void foo() {
    width = 10;
    height = 20;
    display("Chair");
    }
}
class Table extends Furniture{
    void foo() {
        width = 30;
        height = 50;
        display("Table");
    }
}
class Almirah extends Furniture{
    void foo() {
        width = 100;
        height = 200;
        display("Almirah");
    }
}
