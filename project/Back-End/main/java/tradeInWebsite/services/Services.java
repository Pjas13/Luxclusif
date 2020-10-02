package tradeInWebsite.services;

import tradeInWebsite.exceptions.TradeInWebsiteException;
import tradeInWebsite.models.AbstractModel;

import java.util.List;

public interface Services <T extends AbstractModel> {

    List<T> findAll();

    T findById(Long id);

    T save(T t);

    void delete(Long id) throws TradeInWebsiteException;
}
