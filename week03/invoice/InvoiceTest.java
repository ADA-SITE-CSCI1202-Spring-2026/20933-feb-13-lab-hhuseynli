package week03.invoice;
import week03.invoice.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        // Make a valid object (Constructor is working)
        Invoice valid = new Invoice("A48", "Bearings", 4, 0.25);
        
        System.out.printf("\nParts %s are %s bought %d times with a price of $%.2f per item. This costs $%.2f in total.\n",
         valid.getPartNumber(), valid.getPartDescription(), valid.getItemQuantity(), valid.getPricePerItem(), valid.getInvoiceAmount());
        
         // Test for non-zero inputs
        Invoice invalid = new Invoice("B12", "Large bearings", -12, -0.01);
              
        System.out.printf("\nParts %s are %s bought %d times with a price of $%.2f per item. This costs $%.2f in total.\n",
         invalid.getPartNumber(), invalid.getPartDescription(), invalid.getItemQuantity(), invalid.getPricePerItem(), invalid.getInvoiceAmount());
        
        invalid.setItemQuantity(10);
        invalid.setPricePerItem(5.423);
        invalid.setPartNumber("VP00");
        invalid.setPartDescription("Valid Parts");

        System.out.printf("\nParts %s are %s bought %d times with a price of $%.2f per item. This costs $%.2f in total.\n\n",
         invalid.getPartNumber(), invalid.getPartDescription(), invalid.getItemQuantity(), invalid.getPricePerItem(), invalid.getInvoiceAmount());

    }
}
