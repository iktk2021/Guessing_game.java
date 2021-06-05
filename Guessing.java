//importing stuff
import java.util.Scanner;
import java.util.Random;
class Guessing_number{
    public static void main(String[] args) {
        System.out.print("Welcome to the guessing game. You have to guess the answer.(To begin the game press enter)");
        // variables
        int rating=0;
        Scanner takingtheinput=new Scanner(System.in);
        takingtheinput.nextLine();
        Random rand=new Random();
        int num=rand.nextInt();
        boolean guess=false;
        // main game
        while (guess==false){ 
         System.out.println("enter a number to guess (press 5 to get a hint)");
         int numeber_guess=takingtheinput.nextInt();
         if(numeber_guess==5){
          if (num/2==0){
            System.out.println("This number can be divided 2");
          }else{
            System.out.println("This number cannot be divided 2");
          }
        }
          if (numeber_guess> num){
          System.out.println("Too high");
         }else if(numeber_guess<num){
           System.out.println("Too low");
         }else if(numeber_guess==num){

          System.out.println("You got it");
          guess=true;
         }else{
           System.out.println("invalid guess");
         }
       

      }
      System.out.println("Hope you liked this game");
      System.out.println("What will your rating be for this game? ");
      rating=takingtheinput.nextInt();
      System.out.println("Thanks for your rating");
      takingtheinput.close();
    }
  }
  
