import java.util.*;
public class BA_Comparator implements Comparator{

    public int compare(Object obj1, Object obj2)
    {
        BankAccount firstAccount = (BankAccount) obj1;
        BankAccount secondAccount = (BankAccount) obj2;

        if(firstAccount.balance < secondAccount.balance)
        {
            return -1;
        }
        else if(firstAccount.balance > secondAccount.balance)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}