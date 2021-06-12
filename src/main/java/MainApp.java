import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message: ");
        String str = in.nextLine();

        System.out.println("1) " + str);

        System.out.println("2) " + StringUtils.upperCase(str));

    }
}
