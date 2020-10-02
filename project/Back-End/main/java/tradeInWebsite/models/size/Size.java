package tradeInWebsite.models.size;

import tradeInWebsite.models.AbstractModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "size")
public class Size extends AbstractModel {

    @Column(name = "size")
    private String size;

    /*@OneToOne
    private Products products;*/

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
