package Homework_7.srp;

public class Actions {

    private double real;
    private double image;

    public Actions(Complex a, Complex b){
    }

    public Complex add (Complex a, Complex b) {// Добавить комплексные числа
        double real = a.getReal();
        double image = a.getImage();
        double real2 = b.getReal();
        double image2 = b.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }
    
    public Complex sub (Complex a, Complex b) {// Вычитаем комплексные числа
        double real = a.getReal();
        double image = a.getImage();
        double real2 = b.getReal();
        double image2 = b.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }
    
    public Complex mul (Complex a, Complex b) {// умножить комплексные числа
        double real = a.getReal();
        double image = a.getImage();
        double real2 = b.getReal();
        double image2 = b.getImage();
        double newReal = real*real2 - image*image2;
        double newImage = image*real2 + real*image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }
    
    public Complex div (Complex a, Complex b) {// Делим комплексные числа
        double real = a.getReal();
        double image = a.getImage();
        double real2 = b.getReal();
        double image2 = b.getImage();
        double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
        double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
        Complex result = new Complex(newReal,newImage);
        return result;
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
