import com.sun.javafx.fxml.expression.Expression;

/**
 * Created by OovEver on 2017/10/2.
 */
public class LeetCode468 {
    public static String validIPAddress(String IP) {
        if (IP.contains(".")&&isValidIpv4(IP)) {
            return "IPv4";
        } else if (IP.contains(":")&&isValidIpv6(IP)) {
            return "IPv6";
        } else return "Neither";
    }
    private static boolean isValidIpv4(String ip) {
        if (ip.length() < 7) {
            return false;
        }
        if (ip.charAt(0) == '.') {
            return false;
        }
        if (ip.charAt(ip.length() - 1) == '.') {
            return false;
        }
        String[] tokes = ip.split("\\.");
        if (tokes.length != 4) {
            return false;
        }
        for (String token : tokes) {
            if (!isValidIpv4Token(token)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidIpv4Token(String token) {
        if (token.startsWith("0") && token.length() > 1) {
            return false;
        }
        try {
            int parsedInt = Integer.parseInt(token);
            if (parsedInt < 0 || parsedInt > 255) {
                return false;
            }
            if (parsedInt == 0 && token.charAt(0) != '0') {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    private static boolean isValidIpv6(String ip) {
        if (ip.length() < 15) {
            return false;
        }
        if (ip.charAt(0) == ':') {
            return false;
        }
        if (ip.charAt(ip.length() - 1) == ':') {
            return false;
        }
        String[] tokes = ip.split(":");
        if (tokes.length != 8) {
            return false;
        }
        for (String toke : tokes) {
            if (!isValidIpv6Token(toke)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidIpv6Token(String token) {
        if (token.length() > 4 || token.length() == 0) {
            return false;
        }
        char[] chars = token.toCharArray();
        for (char c : chars) {
            boolean isdigits = c >= 48 && c <= 57;
            boolean isUppercase = c >= 65 && c <= 70;
            boolean isLowercase = c >= 97 && c <= 102;
            if (!(isdigits || isUppercase || isLowercase)) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String test = "1e1.4.5.6";
        System.out.println(test.contains("."));
        System.out.println(validIPAddress(test));

    }

}
