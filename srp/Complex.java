package Homework_7.srp;

import java.util.Scanner;
 
public class Complex {// множественный класс
    double real; // реальная часть
    double image; // мнимая часть
   
    public Complex (double newReal, double newImage) {// Конструктор без параметров
       try (Scanner input = new Scanner(System.in)) {
        double real = input.nextDouble();
           double image = input.nextDouble();
           ComplexSet(real,image);
    }
   }

    private void ComplexSet (double real, double image) {// для конструкторов без аргументов
       this.real = real;
       this.image = image;
   }

   public double getReal() {
       return real;
   }

   public void setReal(double real) {
       this.real = real;
   }

   public double getImage() {
       return image;
   }

   public void setImage(double image) {
       this.image = image;
   }
}

