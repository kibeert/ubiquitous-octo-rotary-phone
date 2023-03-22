import java.util.Random;

import javax.swing.text.AbstractDocument.BranchElement;

class Case {
    public static void main(String[] args) {
        int x = rand.nextInt(7) + 1;
        System.out.println(x);
        switch (x) {
            case 1:
                System.out.print("Mondday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("looking forward to next week");
        }

    }
}