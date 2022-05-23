public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to ZBD airport :)");

        String rules = "ABROAD RULES \n"
                        + "1- You haven't any ban \n"
                        + "2- You have to payment visa paymnet \n"
                        + "3- You have country visa that you wanna go";
        String massege = "You have to follow all the rules!";

        while(true){
            System.out.println(massege);
            System.out.println("------------------");
            System.out.println(rules);
            System.out.println("------------------");

            passanger passanger = new passanger();

            System.out.println("The payment is checked...");

            Thread.sleep(3000);

            if(passanger.abroad_payment_control() == false){
                System.out.println(massege);
                continue;
            }
            System.out.println("Political ban is checked...");

            Thread.sleep(3000);

            if(passanger.political_ban_control()== false){
                System.out.println(massege);
                continue;
            }
            System.out.println("Visa status is checked...");

            Thread.sleep(3000);

            if(passanger.visa_status_control()== false){
                System.out.println(massege);
                continue;
            }
            System.out.println("Your transactions are complete. You can go abroad. have a good journey.");
            break;

        }



    }
}
