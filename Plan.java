package hotel;
public class Plan 
{
    public int planID;
    public String planName;
    public float planPerDayPrice;
    public float totalPrice;
    public void getPlanDetails(int planID){

    }
    public Plan(int planID,int noOfDays, String optForFood, String optForAC) 
    {
        this.planID = planID;
        switch(planID)
        {
            case 1://Bronze
            {
                planPerDayPrice = 800;
                this.totalPrice = planPerDayPrice*noOfDays;
                break;
            }
            case 2://Silver
            {
                planPerDayPrice = 1000;
                this.totalPrice = planPerDayPrice*noOfDays;
                switch(optForFood)
                {
                    case "Y":
                    {
                        this.totalPrice += this.planPerDayPrice*0.2;
                        break;
                    }
                    case "N":
                    {
                        break;
                    }
                }
                
                break;
            }
            case 3://Gold
            {
                planPerDayPrice = 1500;
                this.totalPrice = planPerDayPrice*noOfDays;
                float temptot=this.totalPrice;
                switch(optForFood)
                {
                    case "Y":
                    {
                        temptot += this.totalPrice*0.2;
                        break;
                    }
                    case "N":
                    {
                        break;
                    }
                }
                switch(optForAC)
                {
                    case "Y":
                    {
                        temptot += this.totalPrice*0.1;
                        break;
                    }
                    case "N":
                    {
                        break;
                    }
                }
                this.totalPrice = temptot;

                break;
            }
        }
    }

    
}
