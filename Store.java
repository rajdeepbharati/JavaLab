import java.util.Scanner;

class CustomerMonth {
    String accountNumber;
    int initialBalance; // balance at the beginning of the month
    int totalCharges;
    int totalCredits;
    int allowedCreditLimit;

    int newBalance;

    CustomerMonth(int iB, int tCh, int tCr, int aCrLim) {
        accountNumber = generateAccountNumber();
        initialBalance = iB;
        totalCharges = tCh;
        totalCredits = tCr;
        allowedCreditLimit = aCrLim;
    }

    int getInitialBalance() {
        return initialBalance;
    }

    void setInitialBalance(int iB) {
        initialBalance = iB;
    }

    int getTotalCharges() {
        return totalCharges;
    }

    void setTotalCharges(int tCh) {
        totalCharges = tCh;
    }

    int getTotalCredits() {
        return totalCredits;
    }

    void setTotalCredits(int tCr) {
        totalCredits = tCr;
    }

    int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    void setAllowedCreditLimit(int aCrLim) {
        allowedCreditLimit = aCrLim;
    }

    /**
     * Helper method: generates a 20-character random alphanumeric string
     */
    String generateAccountNumber() {
        int n = 20;
        // choose a random character from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    int getNewBalance() {
        System.out.println("New Balance: $" + newBalance);
        return newBalance;
    }

    void setNewBalance() {
        newBalance = initialBalance + totalCharges - totalCredits;
        if (newBalance > allowedCreditLimit) {
            System.out.println("Credit limit exceeded!!!");
        }
    }

    void printData() {
        System.out.println("Account No: " + accountNumber + "\nInitial Balance: $" + initialBalance
                + "\nTotal Charges: $" + totalCharges + "\nTotal Credits: $" + totalCredits + "\nCredit Limit: $"
                + allowedCreditLimit);
    }
}

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        int iB = sc.nextInt();
        System.out.print("Enter total charges: ");
        int tCh = sc.nextInt();
        System.out.print("Enter total credits: ");
        int tCr = sc.nextInt();
        System.out.print("Enter allowed credit limit: ");
        int aCrLim = sc.nextInt();

        CustomerMonth cm = new CustomerMonth(iB, tCh, tCr, aCrLim);
        cm.printData();
        cm.setNewBalance();
        cm.getNewBalance();
        sc.close();
    }
}
