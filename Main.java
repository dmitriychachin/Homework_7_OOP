package Homework_7;

import Homework_7.srp.Complex;
import Homework_7.srp.Actions;
import Homework_7.srp.Input;

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(0, 0);
        Complex complex2 = new Complex(0, 0);
        Actions result = new Actions(complex1, complex2);
        Input input = new Input(result);
        result.add(complex1,complex2);
        input.print();
        result.sub(complex1, complex2);
        input.print();
        result.mul(complex1, complex2);
        input.print();
        result.div(complex1, complex2);
        input.print();
    }

}
