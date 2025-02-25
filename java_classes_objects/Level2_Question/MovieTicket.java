package Level2_Question;


// Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
// Book a ticket (assign seat and update price).
// Display ticket details.
// Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.


public class MovieTicket {

    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked;

    // Method to Book the Ticket
    public void bookedTicket(String movieName, String seatNumber, double price){
        if(!this.booked){
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
            System.out.println("Ticket is booked");
        }else{
            System.out.println("Ticket is allready booked");
        }
    }

        


    public static void main(String[] args) {
        // Create the m1 object
        MovieTicket m1 = new MovieTicket();
        m1.bookedTicket("Pk", "B1", 300);
        m1.bookedTicket("nmbkj", "B1", 1000000);
    }
}
