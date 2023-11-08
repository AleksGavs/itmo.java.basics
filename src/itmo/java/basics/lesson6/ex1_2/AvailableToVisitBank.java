package itmo.java.basics.lesson6.ex1_2;

public interface AvailableToVisitBank {

    String hoursToEnterBank();

    String hoursToLeaveBank();

    boolean isAllowedToStayAtBank(int hours);
}
