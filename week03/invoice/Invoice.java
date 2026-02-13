package week03.invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;
    
    Invoice (String partNumber, String partDescription, int itemQuantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.pricePerItem = pricePerItem;
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public void setItemQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }
      
}