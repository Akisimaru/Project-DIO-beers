package one.digitalinnovation.beerstock.mapper;

import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    @Mapping(target = "fabricationDate", source = "fabricationDate", dateFormat = "dd-MM-yyyy")
    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
