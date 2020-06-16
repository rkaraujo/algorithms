package software.renato.algo;

/*
Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;

Besides, leading zeros in the IPv4 is invalid. For example, the address 172.16.254.01 is invalid.

IPv6 addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits. The groups are separated by colons (":"). For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a valid one. Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters in the address to upper-case ones, so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading zeros and using upper cases).

However, we don't replace a consecutive group of zero value with a single empty group using two consecutive colons (::) to pursue simplicity. For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.

Besides, extra leading zeros in the IPv6 is also invalid. For example, the address 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.

Note: You may assume there is no extra space or special characters in the input string.

Example 1:
Input: "172.16.254.1"

Output: "IPv4"

Explanation: This is a valid IPv4 address, return "IPv4".

Example 2:
Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"

Output: "IPv6"

Explanation: This is a valid IPv6 address, return "IPv6".

Example 3:
Input: "256.256.256.256"

Output: "Neither"

Explanation: This is neither a IPv4 address nor a IPv6 address.
 */
public class ValidateIpAddress {

    private static final String NEITHER = "Neither";
    private static final String IPV4 = "IPv4";
    private static final String IPV6 = "IPv6";

    public String validIPAddress(String IP) {
        if (IP == null) {
            return NEITHER;
        }
        
        if (IP.contains(".") && isValidIpv4(IP)) {
            return IPV4;
        }

        if (IP.contains(":") && isValidIpv6(IP)) {
            return IPV6;
        }
        
        return NEITHER;
    }

    private boolean isValidIpv4(String ip) {
        try {
            String[] ipSplitted = ip.split("\\.", -1);
            if (ipSplitted.length != 4) {
                return false;
            }
            for (String strNumber : ipSplitted) {
                if (strNumber.isEmpty() || strNumber.length() > 3) {
                    return false;
                }
                boolean hasLeadingZero = strNumber.length() > 1 && strNumber.startsWith("0");
                if (hasLeadingZero) {
                    return false;
                }
                boolean hasNegativeSymbol = strNumber.startsWith("-");
                if (hasNegativeSymbol) {
                    return false;
                }
                Integer number = Integer.valueOf(strNumber);
                if (number < 0 || number > 255) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidIpv6(String ip) {
        try {
            String[] ipSplitted = ip.split(":", -1);
            if (ipSplitted.length != 8) {
                return false;
            }
            for (String strNumber : ipSplitted) {
                if (strNumber.isEmpty() || strNumber.length() > 4) {
                    return false;
                }
                boolean hasNegativeSymbol = strNumber.startsWith("-");
                if (hasNegativeSymbol) {
                    return false;
                }
                int number = Integer.parseInt(strNumber, 16);
                if (number < 0) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
