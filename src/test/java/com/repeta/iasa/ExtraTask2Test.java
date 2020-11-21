package com.repeta.iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.repeta.iasa.ExtraTask2.getIPv4Address;

class ExtraTask2Test {

    @Test
    public void Should_ReturnIPv4AddressDerivedFromPassedNumber_When_NonNegativeNumberIsPassed(){
        assertEquals("128.32.10.1",getIPv4Address(2149583361L));
        assertEquals("0.0.0.32",getIPv4Address(32L));
        assertEquals("0.0.0.0",getIPv4Address(0L));
    }

}