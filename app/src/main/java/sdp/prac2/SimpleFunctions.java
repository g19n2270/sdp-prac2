package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    
    public Task3(String s) {
        
        int count=0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }else {
            count --;
            }
            //number of left bracket is greater than right
            if(count<0) return false;
        }
        //check all opening bracket have a corresponding closing bracket
        return count==0;
            }
}
