/**
 * Mohammed Lateef,1086818
 * 25 October, 2022
 * Program  name: Write an application to pre sell movie tickets to multiple buyersfor a theatre with limited capacity
 */



import java.util.Scanner;

public class TicketSeller {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Mohammed Lateef Ticket Seller");
        System.out.println("--------------------------------------------------------------");
        System.out.println("This movie theatre has a seating capacity of 80 seats.");
        System.out.println("Buyers may pre-purchase up to 20 movie tickets.");
        System.out.println("--------------------------------------------------------------");

        //Declare variables

        final double regular_price = 12.75;
        final double discounted_price = 10.8375;

        int available_tickets = 80;
        int regular_tickets = 0;
        double regular_ticket_price = 0.0;
        double discounted_ticket_price = 0.0;
        double total_amount = 0.0; 
        int buyer_count = 0;
        double total_sales = 0.0;

        while(available_tickets > 0){
            buyer_count++;
            System.out.printf("Number of available tickets is %d", available_tickets);
            System.out.printf("\nBuyer %d: How many tickets do you want to purchase? ", buyer_count);
        
     
         //Validate the data type and checks the condition
         while (!input.hasNextInt()){
            System.out.print("Error: Invalid data type. Try again: ");
            input.next();
        }

        int ticket_buy = input.nextInt();
        while (ticket_buy > available_tickets) {
            System.out.print("Error: your request exceeds available tickets, re-enter:");
            ticket_buy = input.nextInt();
        } 

        while (ticket_buy > 20 ) {
            System.out.print("Error: you may only purchase up to 20 tickets, re-enter: ");
            ticket_buy = input.nextInt();
        }

        while(ticket_buy == 0){
            System.out.print("Error: you must purchase at least 1 ticket, re-enter: ");
            ticket_buy = input.nextInt();
        }

        while(ticket_buy < 0){
            System.out.print("Error: you entered a negative number, re-enter: ");
            ticket_buy = input.nextInt();
        }

    System.out.printf("Buyer %d: How many discount tickets do you want to purchase? ", buyer_count);
    
     //Validate the data type and checks the condition
    while (!input.hasNextInt()){
    System.out.print("Error: Invalid data type. Try again: ");
    input.next();
    }
    
    int discount_tickets = input.nextInt(); 
    while (discount_tickets > ticket_buy) {
    System.out.printf("Error: you may only puchase up to %d dicounted tickets, re-enter:" , ticket_buy);
    discount_tickets = input.nextInt();
    } 
    
    while(discount_tickets < 0){
    System.out.print("Error: you entered a negative number, re-enter: ");
    discount_tickets = input.nextInt();
    }
    
    //Calculations of the report
    regular_tickets = ticket_buy - discount_tickets;
    regular_ticket_price = regular_tickets * regular_price;
    discounted_ticket_price = discount_tickets * discounted_price;
    total_amount = regular_ticket_price + discounted_ticket_price;
    total_sales += total_amount;

    System.out.printf("Buyer %d: Your total ticket purchase is $%.2f\n\n", buyer_count,total_amount);
    available_tickets -= ticket_buy;
    
    }
    System.out.println("--------------------------------------------------------------");
    System.out.printf("Ticket seller report:");
    System.out.printf("number of ticket buyer",buyer_count);
    System.out.printf("total tickets sales:",total_sales);

    input.close(); //close the input
    
}

}