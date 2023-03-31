package hotel;
public class PlanPlus extends Plan
{
    public PlanPlus(int planID,int noOfDays, String optForFood, String optForAC)
    {
        super(planID, noOfDays, optForFood, optForAC);
        }
    
    
    public void getPlanDetails(int planID)
    {
        switch(planID)
        {
            case 1://Bronze
            {
                System.out.println("Bronze Package:");
                System.out.println("Per Day Price = INR 800");
                System.out.println("Note: Food and AC cannot be included in package.");
                break;
            }
            case 2://Silver
            {
                System.out.println("Silver Package:");
                System.out.println("Per Day Price = INR 1000");
                System.out.println("Note: If opted for food, additional 20% charges are applicable.");
                System.out.println("AC isn't available in the package.");
                break;
            }
            case 3://Gold
            {
                System.out.println("Gold Package:");
                System.out.println("Per Day Price = INR 1500");
                System.out.println("Note: If opted for food, additional 20% charges are applicable.");
                System.out.println("If opted for AC, additional 10% charges are applicable.");
                break;
            }
        }
    }
}
