package Class6;

public class Whileloop6 {
    public static void main(String[] args) {
        boolean condition=true;
        int number=0;
        while (condition){
            System.out.println("Hello world");
            if(number>3) {
                condition = false;
            }
            number++;
        }
        int number2=2;
        while (number2<10){

            if(number2%2==0){
                System.out.println("Even "+number);
            }
            number2++;
        }
    }
}
