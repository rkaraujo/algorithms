package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateIpAddressTest {

    private ValidateIpAddress validateIpAddress = new ValidateIpAddress();

    @Test
    public void validIPAddress_1() {
        assertEquals("IPv4", validateIpAddress.validIPAddress("172.16.254.1"));
    }

    @Test
    public void validIPAddress_2() {
        assertEquals("IPv6", validateIpAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

    @Test
    public void validIPAddress_3() {
        assertEquals("Neither", validateIpAddress.validIPAddress("256.256.256.256"));
    }

    @Test
    public void validIPAddress_4() {
        assertEquals("Neither", validateIpAddress.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
    }

    @Test
    public void validIPAddress_5() {
        assertEquals("Neither", validateIpAddress.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void validIPAddress_6() {
        assertEquals("Neither", validateIpAddress.validIPAddress("02001:zzzz:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void validIPAddress_7() {
        assertEquals("Neither", validateIpAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }

    @Test
    public void validIPAddress_8() {
        assertEquals("Neither", validateIpAddress.validIPAddress("01.01.01.01"));
    }

    @Test
    public void validIPAddress_9() {
        assertEquals("Neither", validateIpAddress.validIPAddress("0.0.0.-0"));
    }

}