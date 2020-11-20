package com.repeta.iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.repeta.iasa.Task2.firstNonRepeatingLetter;

class Task2Test {

    @Test
    public void Should_ReturnTheFirstCharThatIsNotRepeatedInTheString_When_StringIsPassed(){
        assertEquals("t",firstNonRepeatingLetter("stress"));
        assertEquals("T",firstNonRepeatingLetter("sTreSS"));
        assertEquals("",firstNonRepeatingLetter("SSTTBB"));

    }

}