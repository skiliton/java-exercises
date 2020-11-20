package com.repeta.iasa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static com.repeta.iasa.Task1.getIntegerFromList;

class Task1Test {

    @Test
    public void Should_ReturnListOfIntegers_When_ListOfIntegersAndStringsIsPassed(){
        assertIterableEquals(Arrays.asList(1,2), getIntegerFromList(Arrays.asList(1,2,"a","b")));
        assertIterableEquals(Arrays.asList(1,2,0,15), getIntegerFromList(Arrays.asList(1,2,"a","b",0,15)));
        assertIterableEquals(Arrays.asList(1,2,231), getIntegerFromList(Arrays.asList(1,2,"a","b","aasf","1","123",231)));
    }
}