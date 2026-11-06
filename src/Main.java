import java.util.Scanner;
void main() {
    boolean accountLocked = false;
    Scanner input = new Scanner(System.in);
    System.out.println("Hvad er dit brugernavn?");
    String username = input.nextLine();
    System.out.println("Hvad er dit password?");
    String password = input.nextLine();
    boolean correctLogin = username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("letmein123");

    if (correctLogin && !accountLocked) {
        System.out.println("Enter security level (1-4):");
        int securityLevel = input.nextInt();
        switch(securityLevel) {
            case 1: if (securityLevel == 1) {
                System.out.println("Adgang til offentlige dokumenter");
                break;
            }
            case 2: if (securityLevel == 2) {
                System.out.println("Adgang til klassificerede dokumenter");
                break;
            }
            case 3: if (securityLevel == 3) {
                System.out.println("Adgang til TOP SECRET-filer");
                break;
            }
            case 4: if (securityLevel == 4) {
                System.out.println("Adgang til KOST SECRET-filer");
                break;
            }
            default:
                System.out.println("Ukendt sikkerhedsniveau");
        }
    }


}
