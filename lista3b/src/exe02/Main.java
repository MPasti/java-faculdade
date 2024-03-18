package exe02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(123,"Matheus","499.751.874-30");
        Flight f1 = new Flight(1001,"Franca", "São Paulo");
        Reservation r1 = new Reservation(12345,new Date(),p1,f1);
        System.out.println(r1.toString());
    }
}
