package com.repeta.iasa;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static com.repeta.iasa.Task4.*;

class Task4Test {

    private static int countNumberOfPairs(int[] numbers,int target,String version){
        switch (version){
            case "stream": return countNumberOfPairs_Stream(numbers,target);
            case "forloop": return countNumberOfPairs_ForLoop(numbers,target);
            default: return -1;
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"stream","forloop"})
    public void Should_ReturnTotalCountOfPairsTheSumOfWhichGiveTarget_When_ArrayOfAnyNumbersAndAnyTargetNumberIsPassed(String version){
        assertEquals(1,countNumberOfPairs(new int[]{1,2},3,version));
        assertEquals(0,countNumberOfPairs(new int[]{1,21,5,1},4,version));
        assertEquals(4,countNumberOfPairs(new int[]{1,3,6,2,2,0,4,5},5,version));
    }
}