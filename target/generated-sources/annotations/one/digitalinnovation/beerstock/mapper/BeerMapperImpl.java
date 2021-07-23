package one.digitalinnovation.beerstock.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.dto.BeerDTO.BeerDTOBuilder;
import one.digitalinnovation.beerstock.entity.Beer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-23T19:26:30-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.2 (AdoptOpenJDK)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        if ( beerDTO.getFabricationDate() != null ) {
            beer.setFabricationDate( LocalDate.parse( beerDTO.getFabricationDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        beer.setId( beerDTO.getId() );
        beer.setName( beerDTO.getName() );
        beer.setBrand( beerDTO.getBrand() );
        if ( beerDTO.getMax() != null ) {
            beer.setMax( beerDTO.getMax() );
        }
        if ( beerDTO.getQuantity() != null ) {
            beer.setQuantity( beerDTO.getQuantity() );
        }
        beer.setType( beerDTO.getType() );
        beer.setStrength( beerDTO.getStrength() );

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTOBuilder beerDTO = BeerDTO.builder();

        beerDTO.id( beer.getId() );
        beerDTO.name( beer.getName() );
        beerDTO.brand( beer.getBrand() );
        beerDTO.max( beer.getMax() );
        beerDTO.quantity( beer.getQuantity() );
        beerDTO.type( beer.getType() );
        if ( beer.getFabricationDate() != null ) {
            beerDTO.fabricationDate( DateTimeFormatter.ISO_LOCAL_DATE.format( beer.getFabricationDate() ) );
        }
        beerDTO.strength( beer.getStrength() );

        return beerDTO.build();
    }
}
