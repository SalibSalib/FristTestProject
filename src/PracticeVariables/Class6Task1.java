package PracticeVariables;

public class Class6Task1 {
    public static void main(String[] args) {
        boolean workday=true;
        int day=1;
        while (workday){
            System.out.println("I need a day off");
            if(day==5){
                workday=false;
                System.out.println("i don't a day off any more");
            }
            day++;
        }

    }
}
