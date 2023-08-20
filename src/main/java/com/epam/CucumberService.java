package com.epam;

import org.springframework.stereotype.Service;

@Service
public class CucumberService {
    String result="";
    public String isEvenOrOdd(int num)
    {
        if(num%2==0)
        {
            result="even";
        }
        else if(num%2!=0)
        {
            result="odd";
        }
        return result;
    }

}
