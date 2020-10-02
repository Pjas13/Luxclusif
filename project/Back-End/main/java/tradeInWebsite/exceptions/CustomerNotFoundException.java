package tradeInWebsite.exceptions;


import tradeInWebsite.erros.ErrorMessage;

public class CustomerNotFoundException extends TradeInWebsiteException {


    public CustomerNotFoundException() {
        super(ErrorMessage.CUSTOMER_NOT_FOUND);
    }
}
