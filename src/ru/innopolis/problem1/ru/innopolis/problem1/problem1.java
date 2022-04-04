package ru.innopolis.problem1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.toUpperCase().equals("A")) {
            carWorkshop.setWorkshop(message -> System.out.println("we Should assembles it"));
        } else if (next.toUpperCase().equals("D")) {
            carWorkshop.setWorkshop(message ->System.out.println("we Should disassembles it"));
        }
    }
}

class Workshop{
    private Operation operation = new Operation();
    public void setOperation(Operation operat){this.operation = operat;}
    public void operate(){this.operation.operate();}
}

interface Operation{
    void operate();
}

class AsCars implements Operation{

    @Override
    public void operate() {

    }
}

class DisCars implements Operation{

    @Override
    public void operate() {

    }
}

