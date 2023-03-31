package hotel;
import java.util.*;
import java.io.*;

public class HotelBooking 
{
    public static void main(String[] args)
    {
       
        Scanner scn = new Scanner(System.in);

        //emptying the csv file 
        try 
        {
            new FileWriter(/*change this file path*/
                "D:\\VS_Code\\Java\\HotelBooking\\bookings.csv", false).close();
        } catch (IOException ioe) 
        {
            System.out.println(ioe);
        }

        File csv = null;
        FileWriter fw = null;
        StringBuilder sb = null;
        WriterClass wc = null;
        try
        {
            csv = new File(/*change this file path*/
                "D:\\VS_Code\\Java\\HotelBooking\\bookings.csv");
            fw = new FileWriter(csv,true);
            sb = new StringBuilder();

            sb.append("userName");
            sb.append(",");
            sb.append("dateOfBooking");
            sb.append(",");
            sb.append("checkInDate");
            sb.append(",");
            sb.append("numberOfDays");
            sb.append(",");
            sb.append("packageId");
            sb.append(",");
            sb.append("contactId");
            sb.append(",");
            sb.append("optForFood");
            sb.append(",");
            sb.append("optForAC");
            sb.append("\r\n");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

            
        int repeat = 1;
        do
        {
            String userName = "userName";
            String checkInDate = "DD-MM-YYYY";
            int numberOfDays = 0;
            int packageId = 0;
            String contactId = "911";
            String optForFood = "N";
            String optForAC = "N";
            String dateOfBooking = "DD_MM-YYYY";
            
            //printing available packages
            System.out.println("Available Packages: ");
            System.out.println("1. Bronze - INR 800");
            System.out.println("2. Silver - INR 1000");
            System.out.println("3. Gold - INR 1500");

            //taking B/S/G choice here
            for(boolean repchopack = true;repchopack == true;)
            {
                System.out.print("Choice: ");
                int chopack = scn.nextInt();
                scn.nextLine();

                PlanPlus pp = new PlanPlus(packageId, numberOfDays, optForFood, optForAC);

                switch(chopack)
                {
                    case 1://Bronze
                    {
                        pp.getPlanDetails(1);
                        System.out.println();
                        System.out.println("Full Name: ");
                        userName = scn.nextLine();
                        System.out.println("Check-in date DD-MM-YYYY: ");
                        checkInDate = scn.nextLine();
                        System.out.println("Number of Days of Booking: ");
                        numberOfDays = scn.nextInt();
                        packageId = 1;
                        scn.nextLine();
                        System.out.println("Enter contact number:");
                        contactId = scn.nextLine();
                        optForFood = "N";
                        optForAC = "N";
                        System.out.println("Enter Date of Booking DD-MM-YYYY:");
                        dateOfBooking = scn.nextLine();

                        // for writing into csv
                        try 
                        {
                            wc = new WriterClass(userName, checkInDate, numberOfDays, packageId, contactId, optForFood,
                                    optForAC, dateOfBooking);
                            wc.AppendIt(sb);
                        } 
                        catch (Exception e) 
                        {
                            System.out.println(e);
                        }
                        repchopack = false;
                        break;
                    }
                    case 2://Silver
                    {
                        pp.getPlanDetails(2);
                        System.out.println();
                        System.out.println("Full Name: ");
                        userName = scn.nextLine();
                        System.out.println("Check-in date DD-MM-YYYY: ");
                        checkInDate = scn.nextLine();
                        System.out.println("Number of Days of Booking: ");
                        numberOfDays = scn.nextInt();
                        scn.nextLine();
                        packageId = 2;
                        System.out.println("Enter contact number:");
                        contactId = scn.nextLine();
                        int optchoF;
                        for(boolean optchoFrep = true; optchoFrep == true;)
                        {
                            System.out.println("Opt for Food?(1 for Yes/0 for No): ");
                            optchoF = scn.nextInt();
                            switch(optchoF)
                            {
                                case 1:
                                {
                                    optForFood = "Y";
                                    optchoFrep = false;
                                    break;
                                }
                                case 0:
                                {
                                    optForFood = "N";
                                    optchoFrep = false;
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Enter a valid choice!");
                                    break;
                                }
                            }
                        }
                        optForAC = "N";
                        System.out.println("Enter Date of Booking DD-MM-YYYY:");
                        scn.nextLine();
                        dateOfBooking = scn.nextLine();

                        // for writing into csv
                        try 
                        {
                            wc = new WriterClass(userName, checkInDate, numberOfDays, packageId, contactId, optForFood,
                                    optForAC, dateOfBooking);
                            wc.AppendIt(sb);
                        } 
                        catch (Exception e) 
                        {
                            System.out.println(e);
                        }

                        repchopack = false;
                        break;
                    }
                    case 3://Gold
                    {
                        pp.getPlanDetails(3);
                        System.out.println();
                        System.out.println("Full Name: ");
                        userName = scn.nextLine();
                        System.out.println("Check-in date DD-MM-YYYY: ");
                        checkInDate = scn.nextLine();
                        System.out.println("Number of Days of Booking: ");
                        numberOfDays = scn.nextInt();
                        scn.nextLine();
                        packageId = 3;
                        System.out.println("Enter contact number:");
                        contactId = scn.nextLine();
                        int optchoF;
                        int optchoA;
                    
                        for(boolean optchoFrep = true; optchoFrep == true;)
                        {
                            System.out.println("Opt for Food?(1 for Yes/0 for No): ");
                            optchoF = scn.nextInt();
                            switch(optchoF)
                            {
                                case 1:
                                {
                                    optForFood = "Y";
                                    optchoFrep = false;
                                    break;
                                }
                                case 0:
                                {
                                    optForFood = "N";
                                    optchoFrep = false;
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Enter a valid choice!");
                                    break;
                                }
                            }
                        }
                        for(boolean optchoArep = true; optchoArep == true;)
                        {
                            System.out.println("Opt for AC?(1 for Yes/0 for No): ");
                            optchoA = scn.nextInt();
                            switch(optchoA)
                            {
                                case 1:
                                {
                                    optForAC = "Y";
                                    optchoArep = false;
                                    break;
                                }
                                case 0:
                                {
                                    optForAC = "N";
                                    optchoArep = false;
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Enter a valid choice!");
                                    break;
                                }
                            }
                        }
                        System.out.println("Enter Date of Booking DD-MM-YYYY:");
                        scn.nextLine();
                        dateOfBooking = scn.nextLine();
                        // for writing into csv
                        try 
                        {
                            wc = new WriterClass(userName, checkInDate, numberOfDays, packageId, contactId, optForFood,
                                    optForAC, dateOfBooking);
                            wc.AppendIt(sb);
                        } 
                        catch (Exception e) 
                        {
                            System.out.println(e);
                        }
                        repchopack = false;
                        break;
                    }
                    default:
                    {
                        System.out.println("Enter a valid package choice!!");
                    }
                }
            }

            
            
            
            

            
            
            
            Plan pl = new Plan(packageId, numberOfDays, optForFood, optForAC);
            float totalPrice = pl.totalPrice;

            //printing Booking Confirmation
            System.out.println("BOOKING CONFIRMATION");
            System.out.println("Name: "+ userName);
            System.out.println("Check-in Date: "+checkInDate);
            System.out.println("Number of Days: "+numberOfDays);
            switch(packageId)
            {
                case 1:
                {
                    System.out.println("Package: Bronze");
                    break;
                }
                case 2:
                {
                    System.out.println("Package: Silver");
                    break;
                }
                case 3:
                {
                    System.out.println("Package: Gold");
                    break;
                }
            }
            System.out.println("Opt for dining plan?: "+optForFood);
            System.out.println("Opt for AC?: "+optForAC);
            System.out.println("Total Price to Pay: "+totalPrice);

            System.out.println("Do you want to do more bookings?(1 for Yes/0 for No):");
            repeat = scn.nextInt();
            scn.nextLine();
        }
        while(repeat == 1);

        wc.Pendown(sb, fw);
        scn.close();
    }    
}
