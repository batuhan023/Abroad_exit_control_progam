import java.util.Scanner;

public class passanger implements visa_rules {

    private int payment;
    private boolean political_ban;
    private boolean visa_status;

    public passanger(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter payment amount :");
        this.payment = input.nextInt();
        input.nextLine();

        System.out.println("Do you have any political ban? (yes or no)");
        String answer = input.nextLine();
        if(answer.equals("yes")){
            this.political_ban = true;
        }else{
            this.political_ban = false;
        }

        System.out.println("Do you have a visa? (yes or no)");
        String answer2 = input.nextLine();
        if(answer2.equals("yes")){
            this.visa_status = true;
        }else{
            this.visa_status = false;
        }



    }

    @Override
    public boolean abroad_payment_control() {
        if(this.payment<115){
            System.out.println("Please, make full payment!");
            return false;
        }else{
            System.out.println("Abroad visa payment is okay.");
            return true;
        }
    }

    @Override
    public boolean political_ban_control() {
        if(this.political_ban== true){
            System.out.println("You have a political ban. You can't go abroad!");
            return false;
        }else{
            System.out.println("You haven't a ban.");
            return true;
        }
    }

    @Override
    public boolean visa_status_control() {
        if(this.visa_status==true){
            System.out.println("Visa stuff is okay");
            return true;
        }else{
            System.out.println("You haven't a visa!");
            return false;
        }
    }
}
