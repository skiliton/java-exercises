package com.repeta.iasa;

public class ExtraTask2 {
    public static String getIPv4Address(long n){
        long firstOctet =  (n & 0b11111111000000000000000000000000)>>24;
        long secondOctet = (n & 0b00000000111111110000000000000000)>>16;
        long thirdOctet =  (n & 0b00000000000000001111111100000000)>>8;
        long fourthOctet =  n & 0b00000000000000000000000011111111;
        return String.format("%1$d.%2$d.%3$d.%4$d",firstOctet,secondOctet,thirdOctet,fourthOctet);
    }
}
