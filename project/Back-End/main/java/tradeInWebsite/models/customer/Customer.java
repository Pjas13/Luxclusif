package tradeInWebsite.models.customer;

import tradeInWebsite.models.AbstractModel;
import tradeInWebsite.models.products.Products;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends AbstractModel {

    @Column(name = "firstName")
    @NotNull
    @NotBlank
    private String firstName;

    @Column(name = "lastName")
    @NotBlank
    @NotNull
    private String lastName;

    @Column(name = "email", unique = true)
    @NotBlank
    @NotNull
    private String email;

    @Column(name = "mobilePhone", unique = true)
    @NotBlank
    @NotNull
    private String mobilePhone;


    /*@OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )*/
    @Column(name = "country")
    private String country;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "customer",
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Products> productsList = new ArrayList<>();

    public void addProduct(Products products){
        productsList.add(products);
        products.setCustomer(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}