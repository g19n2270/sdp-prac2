package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public ArrayList<Integer> Task2(ArrayList<Integer> arr)
    {
        if(arr.isEmpty()) //if we get an empty list inform user that it is empty
        {
            System.out.println("empty list");
        }else{

            String s = " ";
            for(int i=0;i < arr.size();i++)//iterate through string and remove the arr character or remove empty strings
            {
                if(arr.get(i) == 0)
                {
                    arr.remove(i);
                    if(arr.isEmpty())//if you've removed the last/only element stop
                    {
                        break;
                    }  
                }else{
                    s= String.valueOf(arr.get(i));

                    if (s.length() < 2)//remove element from list
                    {
                        arr.remove(i);
    
                        if(arr.isEmpty())//if you've removed the last/only element stop
                        {
                            break;
                        }
                    }else{//remove arr character
                        s = s.substring(1);
                        arr.set(i, Integer.parseInt(s));//convert element back to integer and replace already exisitng element 
                    } 
                }
 
            }
        }
        return arr;
    }
}
