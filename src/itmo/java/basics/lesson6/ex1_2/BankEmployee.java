package itmo.java.basics.lesson6.ex1_2;

public class BankEmployee extends Person implements AvailableToVisitBank {
    public BankEmployee(String name, String surname) {
        super(name, surname);
    }

    @Override
    void displayInfo() {
        System.out.printf("\nИмя работника: %s %s, название банка: %s.", super.getName(), super.getSurname(), bankName);
    }

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String hoursToEnterBank() {
        return "c 08.00 до 09-00 и с 13-00 до 14-00";
    }

    @Override
    public String hoursToLeaveBank() {
        return "c 13.00 до 14-00 и после 18-00";
    }

    @Override
    public boolean isAllowedToStayAtBank(int hours) {
        return hours > 8 && hours < 19;
    }
}
