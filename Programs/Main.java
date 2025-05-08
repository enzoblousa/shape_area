package Programs;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.Enums.Color;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        List<Shape> list = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            System.out.print("Rectangle or Circle (c/r)? ");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (shape == 'r') {
                System.out.print("Widht:");
                double w = sc.nextDouble();
                System.out.print("Height: ");
                double h = sc.nextDouble();
                list.add(new Rectangle(color,w,h));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
        System.out.println("Shape areas");
        for (Shape obj : list) {
            System.out.println(String.format("%.2f", obj.area()));
        }
        sc.close();
    }
}