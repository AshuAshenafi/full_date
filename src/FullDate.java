import java.util.Scanner;

public class FullDate {
    public static void main(String[] args) {
        int mm;
        int dd;
        int yy;

        String month;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (mm): ");
        mm = input.nextInt();
        if(mm < 1 || mm > 12){
            System.out.println("Oops! Number out of range.");
            return;
        }

        System.out.print("Enter day (dd): ");
        dd = input.nextInt();

        System.out.print("Enter year (yy): ");
        yy = input.nextInt();
        yy = 2000 + yy;

        switch (mm){
            case 1:
                month = "January";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 2:
                month = "February";
                if(dd < 1 || dd > 29){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                else if(yy % 4 != 0 && dd == 29){
                    System.out.println("Oops! February will have 29 days only in leap year.");
                    return;
                }
                break;
            case 3:
                month = "March";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 4:
                month = "April";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 5:
                month = "May";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 6:
                month = "June";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 7:
                month = "July";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 8:
                month = "August";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 9:
                month = "September";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 10:
                month = "October";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 11:
                month = "November";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            default:
                month = "December";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;

        }
        System.out.println("It is " + month + " " + dd + ", " + yy);



    }
}
