package itmo.java.basics.lesson6.ex1_2;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Person oleg = new Client("Олег", "Иванов");
        Client bob = new Client("Bob", "Marley", "VTB24");
        Person mike = new BankEmployee("Mike", "Tyson", "Alfa-Bank");
        BankEmployee john = new BankEmployee("John", "Smith");
        Scanner sc = new Scanner(System.in);
        int hours;

        oleg.displayInfo();
        //System.out.println("Может войти в банк " + oleg.hoursToLeaveBank());
        bob.displayInfo();
        System.out.print("Может войти в банк " + bob.hoursToEnterBank());
        mike.displayInfo();
        //System.out.println("Может войти в банк " + mike.hoursToLeaveBank());
        //В объекте mike он видит поле класса BankEmployee, но при этом не видит методов этого класса!
        john.displayInfo();
        System.out.println("Введите часы (от 0 до 23): ");
        hours = sc.nextInt();
        System.out.print(mike.getName() + " может находиться в банке " + john.isAllowedToStayAtBank(hours));
    }
}
