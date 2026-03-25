import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        try{

            boolean isRunning = true;
            
            while ( isRunning) {

                ArrayList<String> list = new ArrayList<>();
                System.out.println("""
                ENTER A TO ADD TASK.
                ENTER V TO VIEW TASK.
                ENTER U TO UPDATE TASK.

                ENTER D TO DALETE TASK.
                ENTER DALL TO DALETE ALL TASK.(CANNOT RECOVER AGAIN.)
                ENTER E TO EXIT PROGRAM.
                """);


                System.out.print("ENTER CHOICE:");
                choice=sc.next();

                boolean isValide=utils.InputValidator.isString(choice);
                if( isValide){
                service.TaskService.handleTask(choice, sc, list);
                }

            }
        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("EXCEPTION HANDLED.");
        }

    }
}
