package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockReceededException extends Exception {

    public BeerStockReceededException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to decrement informed is receeds 0", id));
    }
}
