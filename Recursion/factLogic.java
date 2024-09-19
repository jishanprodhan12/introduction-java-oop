
package Recursion;
public class factLogic {
static int fact(int n)    {
    if(n<=1)
        return 1;
    else 
        return (n*fact(n-1));
    }

}
