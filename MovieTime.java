import java.util.*;

public class MovieTime 
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        Queue movies = new LinkedList();
        Queue snacks = new LinkedList();

        //takes in movies
        for(int y = 0; y<3; y++)
        {
            System.out.print("Enter movie "+ (y+1)+ " of "+ "3: ");
            String mov = s.nextLine();
            movies.offer(mov);

        }
        

        //takes in snacks
        for(int x = 0; x<3; x++)
        {
            System.out.print("Enter snack "+ (x+1)+ " of "+ "3: ");
            String snackk = s.nextLine();
            snacks.offer(snackk);

        }
        // prints out the queues
        System.out.println("Movies to watch: "+movies);
        System.out.println("Snacks available are: "+ snacks);

        //finish a snack

        System.out.println("Press S each time you finish a snack.");
        String ch = s.nextLine();

        while(true)
        {
            if(ch == "S" || ch == "s")
            {
            snacks.poll();
            System.out.println(snacks);
            }
            else if(ch.isEmpty()){
                System.out.print("No more snacks");
                break;
            }else{
                System.out.print("");
                break;
            }
        }

    }
}