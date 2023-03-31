package hotel;
import java.io.*;


public class WriterClass extends Cells
{

    public WriterClass(String userName, String checkInDate, int numberOfDays, int packageId, String contactId,
            String optForFood, String optForAC, String dateOfBooking) 
    {
        super(userName, checkInDate, numberOfDays, packageId, contactId, optForFood, optForAC, dateOfBooking);
    }
      
    public void AppendIt(StringBuilder sb)
    {
        sb.append(userName);
        sb.append(",");
        sb.append(dateOfBooking);
        sb.append(",");
        sb.append(checkInDate);
        sb.append(",");
        sb.append(numberOfDays);
        sb.append(",");
        sb.append(packageId);
        sb.append(",");
        sb.append(contactId);
        sb.append(",");
        sb.append(optForFood);
        sb.append(",");
        sb.append(optForAC);
        sb.append("\r\n");
    }
    
    public void Pendown(StringBuilder sb, FileWriter fw)
    {
        for(boolean check = true;check == true;)    
        {    
            try 
            {
                fw.write(sb.toString());
                fw.flush();
                fw.close();
                check = false;
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}
