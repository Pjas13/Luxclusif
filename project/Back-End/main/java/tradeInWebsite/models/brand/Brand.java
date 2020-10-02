package tradeInWebsite.models.brand;

import tradeInWebsite.models.AbstractModel;
import javax.persistence.*;

@Entity
@Table(name = "brand")
public class Brand extends AbstractModel {

    @Column
    private String brand;

    /*@OneToOne
    private Products products;*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
