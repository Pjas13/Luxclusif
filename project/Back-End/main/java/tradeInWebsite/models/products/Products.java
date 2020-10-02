package tradeInWebsite.models.products;

import tradeInWebsite.models.AbstractModel;
import tradeInWebsite.models.customer.Customer;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products extends AbstractModel {

    @Column(name = "value")
    private Integer value;

    @Column(name = "additionalNotes")
    private String additionalNotes;

    /*@OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "products",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )*/
    @Column(name = "brand")
    private String brand;

    /*@OneToOne(
            cascade = CascadeType.ALL,
            mappedBy ="products",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )*/
    @Column(name = "state")
    private String state;

    /*@OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "products",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )*/
    @Column(name = "extras")
    private String[] extraParts;

    /*@OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "products",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )*/
    @Column(name = "size")
    private String size;

    /*@OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "products",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )*/
    @Column(name = "photos")
    private String[] Photos;

    @ManyToOne
    private Customer customer;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String[] getExtraParts() {
        return extraParts;
    }

    public void setExtraParts(String[] extraParts) {
        this.extraParts = extraParts;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
