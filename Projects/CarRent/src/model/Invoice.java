package model;

public class Invoice {
    private Double basicPayment, tax;

    public Invoice() {}

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasicPayment() + getTax();
    }

    public String toString() {
        return String.format("Fatura: %.2f\nImposto: %.2f\nTotal: %.2f", getBasicPayment(), getTax(), getTotalPayment());
    }
}
