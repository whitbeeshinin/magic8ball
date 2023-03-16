import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("**** Dude, welcome to the surfer bro edition of the Magic 8 Ball! *** \n Ask the all knowing ball a yes or no question, but hurry, surf's about to be up and it has waves to catch");
        String userQuestion = input.nextLine();

        int randomNumber = new Random().nextInt(4);

        if(randomNumber == 0){
            System.out.println("Outlook is gnarly brah, ask again manana.");
        } else if (randomNumber == 1){
            System.out.println("Super stoked you'd ask me that my dude. The answer is...totally!!");
        } else if (randomNumber == 2){
            System.out.println("Righteous question, bro! Outlook is epic. Hang ten my friend.");
        } else if (randomNumber == 3){
            System.out.println("Whoa dude, that question is mega heavy. Maybe ask your shrink?");
        }



        // 3. Make a variable and initialize it to a random number.
        //
        //    // Get random a number from: [0, 1, 2, 3]
        //    int randNumber = new Random().nextInt(4);


        // 4. If the random number is 0

        // Tell the user "Yes"


        // 5. If the random number is 1

        // Tell the user "No"


        // 6. If the random number is 2

        // Tell the user a custom response


        // 7. If the random number is 3

        // Tell the user a custom response
    }
}


