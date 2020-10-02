package tradeInWebsite.models.photos;

import tradeInWebsite.models.AbstractModel;
import tradeInWebsite.models.products.Products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photos")
public class Photos extends AbstractModel {

    @Column(name = "photoUrl")
    private String photos;

    @ManyToOne
    private Products products;

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
