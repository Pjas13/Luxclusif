package tradeInWebsite.models.condition;

import tradeInWebsite.models.AbstractModel;
import javax.persistence.*;

@Entity
@Table(name = "state")
public class Condition extends AbstractModel {

    @Column(name = "state")
    private String state;

    /*@OneToOne
    private Products products;*/

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
