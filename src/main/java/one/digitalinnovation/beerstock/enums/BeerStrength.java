package one.digitalinnovation.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerStrength {

    STRONG("Strong"),
    MEDIUM("Medium"),
    WEAK("Weak");

    private final String description;
}
