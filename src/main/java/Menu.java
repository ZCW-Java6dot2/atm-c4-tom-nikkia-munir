public class Menu {

    public Menu(){
        }
    public void verifyExistingUser(){
        System.out.println("Welcome to the C4 ATM!\n" +
                "Press 1 if you already have an account with us. \n" +
                "Press 2 if you are a new user.\nPress 3 to exit");
    }

    public void accountSelection(){
        System.out.println("Please enter your menu selection\n" +
                "1: Checking 2: Savings 3: Investment 4:Exit");
    }

}
