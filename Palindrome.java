public class Palindrome {
    public static void main(String[] arsg)
    {
        int a = 10;
        int rev = 0;
        int ori = a;
        while(a>0)
        {
            int digit = a%10;
            rev = rev*10 + digit;
            a/=10;
        }
        if(rev==ori)
        {
            System.out.print("It is a Palindrome");
        }
        else
        {
            System.out.print("It is not a Palindrome");
        }
    }
    
}
