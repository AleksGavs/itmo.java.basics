package itmo.java.basics.lesson6.ex1_2;

public class Client extends Person implements AvailableToVisitBank {
    public Client(String name, String surname) {

        super(name, surname);
    }

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    private String bankName;

    public String getBankName() {

        return bankName;
    }

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }

    @Override
    void displayInfo() {
        System.out.printf("\nИмя клиента: %s %s, название банка: %s.", super.getName(), super.getSurname(), bankName);
    }

    @Override
    public String hoursToEnterBank() {

        return "c 09.00 до 13-00 и с 14-00 до 18-00";
    }

    @Override
    public String hoursToLeaveBank() {

        return "c 09.00 до 13-00 и с 14-00 до 18-00";
    }

    @Override
    public boolean isAllowedToStayAtBank(int hours) {

        return hours > 9 && hours != 13 && hours < 18;
    }
}
