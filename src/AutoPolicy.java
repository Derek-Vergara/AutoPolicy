
public class AutoPolicy {

    private int accountNumber; //Policy Account number
    private String makeAndModel;//Car make anbd model
    private String state;//two-letter abreviattioon of the state

    //Constructor 
    public AutoPolicy(int accountNumber,String makeAndModel, String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    //Sets the accountNumber 
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    // Returns the accountNUmber
    public int getAccountNumber()
    {
        return accountNumber;
    }

    //sets the makeAndModel
    public void setMakeAndModel(String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }

    //Returns the makeAndModel
    public String getMakeAndModel()
    {
        return makeAndModel;
    }

    //Sets the state
    public void setState(String state)
    {
        this.state= state;
    }

    //returns the state
    public String getState()
    {
        return state;
    }
    //Predicate method returns wheter the state has no-fault insurance
    public boolean isNoFaultState()
    {
        boolean noFaultState;

        switch(getState())
        {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }



}//End of class
