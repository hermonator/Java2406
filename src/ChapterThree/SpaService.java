package ChapterThree;

/**
 * Created by Jesse Hermon on 5/08/2016.
 */
public class SpaService {
    private String serviceDescription;
    private double price;

    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
}
