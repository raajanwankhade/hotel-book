package hotel;
public class Cells 
{
    public String userName;
    public String checkInDate;
    public int numberOfDays;
    public int packageId;
    public String contactId;
    public String optForFood;
    public String optForAC;
    public String dateOfBooking;

    public Cells(String userName,
                        String checkInDate,
                        int numberOfDays,
                        int packageId,
                        String contactId,
                        String optForFood,
                        String optForAC,
                        String dateOfBooking)
    {
        this.userName = userName;
        this.checkInDate = checkInDate;
        this.numberOfDays = numberOfDays;
        this.packageId = packageId;
        this.contactId = contactId;
        this.optForFood = optForFood;
        this.optForAC = optForAC;
        this.dateOfBooking = dateOfBooking;
    }
}
