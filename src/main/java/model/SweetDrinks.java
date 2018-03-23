package model;

public class SweetDrinks extends Goods {
    private DateTerm dateTerm;

    public SweetDrinks(int id, String name, int quantity, String description, Double price, DateTerm dateTerm) {
        super(id, name, quantity, description, price);
        this.dateTerm = dateTerm;
    }

    public DateTerm getDateTerm() {
        return dateTerm;
    }

    public void setDateTerm(DateTerm dateTerm) {
        this.dateTerm = dateTerm;
    }
}
