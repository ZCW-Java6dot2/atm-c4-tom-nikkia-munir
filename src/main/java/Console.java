import java.util.HashMap;
import java.util.Scanner;

public class Console {


    //public void () {
    UserWarehouse UW = new UserWarehouse();
    HashMap<String,Integer> userList = UW.getAccounts();
    HashMap<String,User> objList = UW.getObjectList();
    Menu menu = new Menu();

    public Console() {
    }

    public void verifyUser() {
        boolean exit = false;
        while (exit == false) {
        menu.verifyExistingUser();
        Scanner option = new Scanner(System.in);
        int selection = option.nextInt();
            switch (selection) {
                case 1:
                    verifyUserCheck();
                    break;
                case 2:
                    createUser();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect input");
                    //verifyUser();
                    break;
            }
        }
    }
    public void createUser(){
        System.out.println("Please enter full name");
        Scanner name = new Scanner(System.in);
        String fullName = name.nextLine();
        User newUser = UW.createNewUser(fullName);
        System.out.println(newUser.toString());
    }

    public void verifyUserCheck() {
        System.out.println("Enter full name");
        Scanner name = new Scanner(System.in);
        String fullName = name.nextLine();
        if (userList.containsKey(fullName)) {
            System.out.println("Enter password");
            Scanner pass = new Scanner(System.in);
            Integer password = pass.nextInt();
            if (userList.get(fullName).equals(password)) {
                accountSelectionMenu(objList.get(fullName));
            } else {
                System.out.println("Incorrect password");
                verifyUserCheck();
            }
        } else {
            System.out.println("Incorrect user name");
            verifyUserCheck();
        }
    }

    public void accountSelectionMenu(User currentUser) {
        boolean quit = false;
        while (quit == false) {
        User current = currentUser;
        menu.accountSelection();
        Scanner option = new Scanner(System.in);
        int selection = option.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Checking");
                    checkAcctMenu(current);
                    break;
                case 2:
                    System.out.println("Savings");
                    //acctMenu();
                    break;
                case 3:
                    System.out.println("Investment");
                    //acctMenu();
                    break;
                case 4:
                    //print transaction history
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Incorrect input");
                    verifyUser();
            }
        }
        verifyUser();
    }
    public void checkAcctMenu(User current){
        boolean back = false;
        while (back == false){
        menu.acctMenu();
        Scanner option = new Scanner(System.in);
        int selection = option.nextInt();
            switch(selection){
                case 1:

                    //withdraw
                    break;
                case 2:
                    //deposit
                    break;
                case 3:
                    System.out.println(current.getCheckingBalance());
                    break;
                case 4:
                    //transfer to my acct
                    break;
                case 5:
                    //close account
                    break;
                case 6:
                    //transfer to outside acct
                    break;
                case 7:
                    back = true;
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;


            }

        }

    }
}

