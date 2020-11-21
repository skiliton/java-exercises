package com.repeta.iasa;

public class ExtraTask1 {

    public static int nextBigger(int num){
        int[] digits = extractDigits(num);

        for (int i=digits.length-1;i>0;i--){
            if(digits[i-1]<digits[i]){
                int temp = digits[i-1];
                digits[i-1]=digits[i];
                digits[i]=temp;
                break;
            }
        }

        int biggerNum = concatDigits(digits);
        return (biggerNum>num ? biggerNum : -1);
    }

    private static int[] extractDigits(int num) {
        return String
            .valueOf(num)
            .chars()
            .map(Character::getNumericValue)
            .toArray()
        ;
    }

    private static int concatDigits(int[] digits){
        int res = 0;
        for(int i=0; i<digits.length;i++){
            res+=digits[i]*Math.pow(10,digits.length-1-i);
        }
        return res;
    }

}
