package furuma_resort.controller;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        DO_WHILE:
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("NumberFormatException");
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
            } while (true);
            switch (choice) {
                case 1:
                    showEmployeeManagement();
                    break;
                case 2:
                    showCustomerManagement();
                    break;
                case 3:
                    showFacilityManagement();
                    break;
                case 4:
                    showBookingManagement();
                    break;
                case 5:
                    showPromotionManagement();
                    break;
                case 6:
                    break DO_WHILE;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }

    private void showPromotionManagement() {
        DO_WHILE:
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("NumberFormatException");
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
            } while (true);
            switch (choice) {
                case 1:
                    //method;
                    break;
                case 2:
                    //method;
                    break;
                case 3:
                    break DO_WHILE;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }

    private void showBookingManagement() {
        DO_WHILE:
        do {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("NumberFormatException");
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
            } while (true);
            switch (choice) {
                case 1:
                    //method;
                    break;
                case 2:
                    //method;
                    break;
                case 3:
                    //method;
                    break;
                case 4:
                    //method;
                    break;
                case 5:
                    //method;
                    break;
                case 6:
                    break DO_WHILE;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }

    private void showFacilityManagement() {
        DO_WHILE:
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("NumberFormatException");
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
            } while (true);
            switch (choice) {
                case 1:
                    //method;
                    break;
                case 2:
                    //method;
                    break;
                case 3:
                    //method;
                    break;
                case 4:
                    break DO_WHILE;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }

    private void showCustomerManagement() {
        DO_WHILE:
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("NumberFormatException");
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
            } while (true);
            switch (choice) {
                case 1:
                    //method;
                    break;
                case 2:
                    //method;
                    break;
                case 3:
                    //method;
                    break;
                case 4:
                    break DO_WHILE;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }

    private void showEmployeeManagement() {
        DO_WHILE:
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            int choice;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("NumberFormatException");
                } catch (Exception exception) {
                    System.out.println("Exception");
                }
            } while (true);
            switch (choice) {
                case 1:
                    //method;
                    break;
                case 2:
                    //method;
                    break;
                case 3:
                    //method;
                    break;
                case 4:
                    break DO_WHILE;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }
}
