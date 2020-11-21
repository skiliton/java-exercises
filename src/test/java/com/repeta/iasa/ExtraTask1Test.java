package com.repeta.iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.repeta.iasa.ExtraTask1.nextBigger;

class ExtraTask1Test {

    @Test
    public void Should_ReturnBiggerNumberThatConsistFromDigitsOfNumberThatIsPassed_When_NonnegativeNumberIsPassed(){
        assertEquals(21,nextBigger(12));
        assertEquals(531,nextBigger(513));
        assertEquals(2071,nextBigger(2017));
        assertEquals(-1,nextBigger(9));
        assertEquals(-1,nextBigger(111));
        assertEquals(-1,nextBigger(531));
    }

}