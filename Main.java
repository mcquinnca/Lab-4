import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r= new Random();
    int randomNum =r.nextInt(50) + 1;
    int testNum = randomNum;
    System.out.println("The Random Number is: " + randomNum);
    for (int i = randomNum; i > 0; i--){
      randomNum--;
      System.out.println(randomNum);
    }
    if (testNum < 5){
      System.out.println("Ahoy mateys!");
    }
    else if (testNum > 25 && testNum < 42){
      System.out.println("Cannonball!");
    }
    else{
      System.out.println("Blast off!");
    }
    
  }

}