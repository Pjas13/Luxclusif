package tradeInWebsite.models.country;

import tradeInWebsite.models.AbstractModel;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country extends AbstractModel {

    @Column(name = "country")
    private String country;

    /*@OneToOne
    private Customer customer;*/

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
