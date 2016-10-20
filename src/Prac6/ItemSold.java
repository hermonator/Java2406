package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class ItemSold {

    protected int invoiceNumber;
    protected String description;
    protected double price;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }
}
