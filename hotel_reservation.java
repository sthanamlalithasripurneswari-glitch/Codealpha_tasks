import java.util.Scanner;
import java.util.Stack;
class HotelReservation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t\t--- Hotel Room Reservation--- ");
        System.out.print("\nEnter your Name:");
        String s=sc.nextLine();
        System.out.print("Enter your Mobile number:");
        String m=sc.nextLine();
        System.out.print("Enter number of guests:");
        int n=sc.nextInt();
        sc.nextLine();
        Stack<Integer> standardroom=new Stack<>();
        Stack<Integer> deluxeroom=new Stack<>();
        Stack<Integer> suiteroom=new Stack<>();
        for(int i=101;i<=105;i++)
        standardroom.push(i);
        for(int i=201;i<=205;i++)
        deluxeroom.push(i);
        for(int i=301;i<=305;i++)
        suiteroom.push(i);
        System.out.println("Types of rooms present in our hotel");
        System.out.println("1.Standard Room");
        System.out.println("2.Deluxe Room");
        System.out.println("3.Suite Room");
        System.out.print("Which room would you like to take:");
        String room=sc.nextLine();
        room=room.toLowerCase();
        switch(room)
        {
            case "standard":{
                System.out.println("Thankyou for choosing the Standard room....");
                System.out.println("The cost of the room is 2.5K");
                System.out.println("Availible rooms: "+standardroom);
                break;
                }
            case "deluxe":{
                System.out.println("Thankyou for choosing the Deluxe room....");
                System.out.println("The cost of the room is 3.5K");
                System.out.println("Availible rooms: "+deluxeroom);
                break;
                }
            case "suite":{
                System.out.println("Thankyou for choosing the Suite room....");
                System.out.println("The cost of the room is 4.5K");
                System.out.println("Availible rooms: "+suiteroom);
                break;
                }
        }
        System.out.print("Enter the room number your are willing to take ");
        int t=sc.nextInt();
        sc.nextLine();
        if(standardroom.contains(t))
        {
            standardroom.removeElement(t);
            System.out.println("Room booked successfully");
        }
        else if(deluxeroom.contains(t))
        {
            deluxeroom.removeElement(t);
            System.out.println("Room booked successfully");
        }
       else if(suiteroom.contains(t))
        {
            suiteroom.removeElement(t);
            System.out.println("Room booked successfully");
        }
        else{
        System.out.println("Room is unavailible");
        System.exit(0);
        }
        System.out.print("please enter your id proof:");
        String str=sc.nextLine();
        System.out.println("Do you want to confirm this room (yes/no)");
        String ch=sc.nextLine();
        ch=ch.toLowerCase();
        if(ch.equals("yes"))
        System.out.println("---Thank you for booking in this hotel---- ");
        else
        {
            System.out.println("Please enter the room number");
            int sk=sc.nextInt();
            if(sk>=101 && sk<=105)
            standardroom.push(sk);
            else if(sk>=201&&sk<=205)
            deluxeroom.push(sk);
            else if(sk>=301&&sk<=305)
            suiteroom.push(sk);
            System.out.println("Availible rooms");
            System.out.println(standardroom);
            System.out.println(deluxeroom);
            System.out.println(suiteroom);
            System.exit(0);
        }
    System.out.println("Name: "+s);
    System.out.println("Type of the room: "+room);
    System.out.print("Payment Details: ");
    if(room.equals("standard"))
     System.out.println("2.5k");
    else if(room.equals("deluxe"))
    System.out.println("3.5k");
    else
    System.out.println("4.5k");
    System.out.println("Room number: "+t);
    }
}