//made by Pranav Veerubhotla
class Driver
{
    public static void main(String[]args)
    {
        PiggyBank bank = new PiggyBank();
        bank.deposit(0,0,1,6);
        System.out.print("There are " +bank.getQuarters());
        System.out.println(" Quarters in your account");
        System.out.println("the current value of your bank account is $" + bank.calculate());
        
    }
}