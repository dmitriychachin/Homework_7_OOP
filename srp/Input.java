package Homework_7.srp;

public class Input {
    private double image;
    private double real;

    public Input(Actions a){
        double real = a.getReal();
        double image = a.getImage();
        this.real = real;
        this.image = image;
    }

    public void print () {// вывод
        if(image > 0){
            System.out.println(real + " + " + image + "i");
        }else if(image < 0){
            System.out.println(real + "" + image + "i");
        }else{
            System.out.println(real);
        }
    }
}
