package Homework_7;

import Homework_7.srp.Complex;
import Homework_7.srp.Actions;
import Homework_7.srp.Input;

public class Main {
    public static void main(String[] args) {
        Actions result = new Actions(new Complex(0, 0));
        Input input = new Input(result);
        input.print();
    }

}
