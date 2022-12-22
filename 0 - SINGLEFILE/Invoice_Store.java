class Invoice {
    private String partNumber;
    private String partDescription;
    private int    qtyOfItem;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int qtyOfItem, double pricePerItem) {
        this.partNumber      = partNumber;
        this.partDescription = partDescription;
        this.qtyOfItem       = qtyOfItem;
        this.pricePerItem    = pricePerItem;          
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQtyOfItem() {
        return qtyOfItem;
    }
    public void setQtyOfItem(int qtyOfItem) {
        this.qtyOfItem = qtyOfItem;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void SetPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public double getInvoiceAmount() {
        if (qtyOfItem <= 0) {
            qtyOfItem = 0;
        }
        if (pricePerItem <= 0) {
            pricePerItem = 0;
        }
        return qtyOfItem * pricePerItem;
     }
}

public class Invoice_Store {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("ABC123", "HAMMER", 10, 35.5);
        System.out.println("Part Number     : " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity        : " + invoice.getQtyOfItem());
        System.out.println("Price Per Item  : " + invoice.getPricePerItem());
        System.out.println("Invoice Amount  : " + invoice.getInvoiceAmount());
    }
}