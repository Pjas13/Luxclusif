package tradeInWebsite.models.extraParts;

import tradeInWebsite.models.AbstractModel;
import javax.persistence.*;

@Entity
@Table(name = "extras")
public class ExtraParts extends AbstractModel {

    @Column(name = "extras")
    private String extras;

    /*@ManyToOne
    private Products products;*/

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

}
