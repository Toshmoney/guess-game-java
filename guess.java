import java.util.Scanner;
public class guess {

    public static void main(String[] args) {
        int guessCount = 0;
        int guessLimit = 3;
        boolean guessRight = false;
        String myPassword = "Toshmoney";
        while(guessLimit > guessCount && !guessRight){
            Scanner guessObj = new Scanner(System.in);
            System.out.println("Can you guess my secret word?: ");
            String guessedWord = guessObj.nextLine();

            if(guessedWord.equals(myPassword)){
                guessRight = true;
                System.out.println("Congrats! You guessed right");
                break;
            }else{
                System.out.println("Sorry, You guessed wrong.. try again!");
                guessLimit --;
                if(guessLimit > guessCount){
                    System.out.println("You have " + guessLimit + " attempts remaining");
                }
            }
        }
        
        if(!guessRight){
            System.out.println("Sorry you've runned out of attempts, refresh to start again!");
        }
    }

}