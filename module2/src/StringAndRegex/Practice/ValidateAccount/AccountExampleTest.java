package StringAndRegex.Practice.ValidateAccount;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] inValidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.valiDate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account : inValidAccount) {
            boolean isValid = accountExample.valiDate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}
