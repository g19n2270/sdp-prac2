package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }
    public static boolean task5(List<Integer> perfect){
        List<Integer> num2 = new ArrayList<Integer>();
        int length = perfect.size();
        for (int i= 0; i<length; i++ ){
            num2.add(perfect.get(i));

        }
        Collections.sort(perfect);
        for (int i=0; i < length; i++){
            if (perfect.get(i) != num2.get(i)){
                return false;
            }
            else{
                return true;
            }
            
        }

    }

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

