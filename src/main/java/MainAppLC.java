import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class MainAppLC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message: ");
        System.out.println("3) " + StringUtils.lowerCase(in.nextLine()));

    }
}
