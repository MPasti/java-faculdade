package exe02;

import java.util.Date;

public class Reservation {
    private int id;
    private Date date;
    Passenger passenger;
    Flight flight;

    public Reservation() {
    }

    public Reservation(int id, Date date, Passenger passenger, Flight flight) {
        this.setId(id);
        this.setDate(date);
        this.setPassenger(passenger);
        this.setFlight(flight);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
}

