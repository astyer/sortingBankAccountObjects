//use implements Comparable for first two projects
public class BankAccount{

    public BankAccount(String nm, double bal)

    {
        name = nm;
        balance = bal;
    }
    /*public int compareTo(Object otherObject)
    {
        BankAccount otherAccount = (BankAccount) otherObject;

        //sort by balance:
        if(balance < otherAccount.balance)
        {
            return -1;
        }
        else if(balance > otherAccount.balance)
        {
            return 1;
        }
        else
        {
            return 0;
        }

        //sort by name:
        char fname = name.charAt(0);
        int fascii = fname;
        char fobname = otherAccount.name.charAt(0);
        int foascii = fobname;

        if(fascii < foascii)
        {
            return -1;
        }
        else if(fascii > foascii)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }*/

    public String name;
    public double balance;

}
