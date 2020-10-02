package tradeInWebsite.dto.productdto;

import org.springframework.stereotype.Component;
import tradeInWebsite.dto.Dto;

@Component
public class ProductsDto implements Dto {

    private Long id;
    private String Brand;
    private String size;
    private Integer value;
    private String[] extraParts;
    private String additionalNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String[] getExtraParts() {
        return extraParts;
    }

    public void setExtraParts(String[] extraParts) {
        this.extraParts = extraParts;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return "ProductsDto{" +
                "id=" + id +
                ", Brand='" + Brand + '\'' +
                ", size='" + size + '\'' +
                ", value=" + value +
                ", extraParts='" + extraParts + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }
}
