mport java.io.*;
import  java.util.*

class UserMainCode
{

    public int addLastDigits(int input1,int input2){
        int sum=0;

        if((input1<10&&input1>0)&&(input2<10&&input2>0))
            sum=input1+input2;
        else if(input1<0&&input2<0)
        {
            input1=0-input1;
            input2=0-input2;
            input1=input1%10;
            input2=input2%10;
             sum=input1+input2;
        }
        else if(input1<0||input2<0)
        {
            input1=input1%10;
            input2=input2%10;
             sum=input1-input2;
            sum=sum%10;
        }
        else
        {
            while((input1 >10)||(input2 >10))
            {
              input1=input1%10;
              input2=input2%10;
              sum=input1+input2;
            }
        }

        System.out.print(sum);
        return sum;
    }
}
