class Solution {
    public int myAtoi(String s) {
        long n=0;
        int f=0,p=0,r=0,sign=+1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '&&f==0)
            {
                continue;
            }
            else if((s.charAt(i)=='-'&&p==0))
            {
                sign=-1;
				p=1;
                f=1;
				continue;

            }
            else if((s.charAt(i)=='+'&&p==0))
            {
                
				p=1;
                f=1;
				continue;

            }

            else if(Character.isDigit(s.charAt(i))==true)
            {
                if(s.charAt(i)=='0'&&r==0)
                {
                    r=1;
                    f=1;
			p=1;
                    continue;
                }
				n=n*10+s.charAt(i)-'0';
                //finalS+=s.charAt(i);
				f=1;
			p=1;
            r=1;
				continue;
            }
            else if(Character.isDigit(s.charAt(i))==false)
            {
                i=s.length();
				continue;
            }
			f=1;
			p=1;
            r=1;
        }
        if(finalS=="")
        {
            finalS="0";
        }
        
        //System.out.println(finalS);
        long n=Long.parseLong(finalS);
        n=n*sign;
        int MIN=Integer.MIN_VALUE, MAX=Integer.MAX_VALUE;
        if(n>MAX)
        {
            return MAX;
        }
        if(n<MIN)
        {
            return MIN;
        }
        System.out.println(n);
        //int fi =(int)(n);
    return (int)(n);
    }
    
    }
    //Adding a new comment for dailyPush3
    //Adding a new comment for dailyPush3c2