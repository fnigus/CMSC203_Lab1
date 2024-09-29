import java.util.Scanner;

public class MovieDriver_Task2 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String continueInput;

		        do {
		            Movie movie = new Movie();
		            
		            System.out.println("Enter the title of the movie: ");
		            String title = scanner.nextLine();
		            movie.setTitle(title);
		            
		            System.out.println("Enter the rating of the movie: ");
		            String rating = scanner.nextLine();
		            movie.setRating(rating);
		            
		            System.out.println("Enter the number of tickets sold for the movie: ");
		            int ticketsSold = scanner.nextInt();
		            movie.setSoldTickets(ticketsSold);
		            
		            System.out.println(movie.toString());
		            
		            scanner.nextLine();
		            
		            System.out.println("Do you want to enter another movie? (y or n)");
		            continueInput = scanner.nextLine();
		        } while (continueInput.equalsIgnoreCase("y"));
		        
		        scanner.close();
		        
		        System.out.print("Goodbye");
		    }

}

