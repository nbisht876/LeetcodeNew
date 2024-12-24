public class RomanInteger {
	
}
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {if(i!=s.length()-1){
                if(s.charAt(i+1)=='V')
                {
                    sum=sum+4;
                    i++;
                    continue;
                }
                else if(s.charAt(i+1)=='X')
                {
                    sum=sum+9;
                    i++;
                    continue;
                }}
                
                    sum=sum+1;
                
            }
            else if(s.charAt(i)=='X')
            {if(i!=s.length()-1){
                if(s.charAt(i+1)=='L')
                {
                    sum=sum+40;
                    i++;
                    continue;
                }
                else if(s.charAt(i+1)=='C')
                {
                    sum=sum+90;
                    i++;
                    continue;
                }}
                
                    sum=sum+10;
                
            }
            else if(s.charAt(i)=='C')
            {if(i!=s.length()-1){
                if(s.charAt(i+1)=='D')
                {
                    sum=sum+400;
                    i++;
                    continue;
                }
                else if(s.charAt(i+1)=='M')
                {
                    sum=sum+900;
                    i++;
                    continue;
                }}
                
        
                sum=sum+100;
                }
            
            else if(s.charAt(i)=='V')
            {
                sum+=5;
            }
            else if(s.charAt(i)=='L')
            {
                sum+=50;
            }
            else if(s.charAt(i)=='D')
            {
                sum+=500;
            }
            else if(s.charAt(i)=='M')
            {
                sum+=1000;
            }
        }
        return sum;
    }
}