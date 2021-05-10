
public class carInfo {
    
    private String carModel;
    private String carRegNum;
    private double rentPrice;
    private String pickUpLocation;
    private boolean availability;
    private String startDate;
    private String endDate;
    private String category;
    
    
    
    public carInfo (String carModel,String carRegNum, double rentPrice, String category)        
    {
        this.carModel= carModel;
        this.carRegNum = carRegNum;
        this.rentPrice = rentPrice;
        this.startDate = null;       
        this.endDate = null;        
        this.pickUpLocation = null;  
        this.category = category;
        this.availability=true;
    }

    public void setCarModel (String newCarModel)
    {
        carModel = newCarModel;
    }
    
    public String getCarModel ()
    {
        return carModel;
    }
    
    public void setCarRegNum (String newCarRegNum)
    {
        carRegNum = newCarRegNum;
    }
    
    public String getCarRegNum ()
    {
        return carRegNum;
    }
    
    public void setRentPrice (double newRentPrice)
    {
        rentPrice = newRentPrice;
    }
    
    public double getRentPrice ()
    {
        return rentPrice;
    }
    
     public void setpickUpLocation (String newPickUpLocation)
    {
        pickUpLocation = newPickUpLocation;
    }
    
    public String getPickUpLocation ()
    {
        return pickUpLocation;
    }
    
    public boolean getAvailability ()
    {
        return availability;
    }
    
    public void setAvailability(boolean newAvailability)
    {
        availability=newAvailability;
    }
    
    public void setStartDate (String newStartDate)
    {
        startDate = newStartDate;
    }
    
    public String getStartDate()
    {
        return startDate;
    }
    
    public void setEndDate (String newEndDate)
    {
        endDate = newEndDate;
    }
    
     public String getEndDate()
    {
        return endDate;
    }
     
     public String getCategory ()
     {
         return category;
     }

    
}
