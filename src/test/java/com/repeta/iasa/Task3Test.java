package com.repeta.iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.repeta.iasa.Task3.digitalRoot;

class Task3Test {

    @Test
    public void Should_ReturnDigitalRootOfNumber_When_NonNegativeValueIsPassed(){
        assertEquals(7,digitalRoot(16));
        //assertEquals(6,digitalRoot(924));
        //assertEquals(6,digitalRoot(132189));
        //assertEquals(2,digitalRoot(493193));
    }

}