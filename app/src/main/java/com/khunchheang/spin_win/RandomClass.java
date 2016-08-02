package com.khunchheang.spin_win;

import java.util.Random;

/**
 * Created by Touch on 7/13/2016.
 */
public class RandomClass extends Random {
    public String randomNumber(){
        Random random=new Random();
        int number=random.nextInt(37-0)+0;
        String num=String.valueOf(number);
        return num;
    }

}
