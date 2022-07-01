package com.adrian.springrestdocsexample.web.mapper;

import com.adrian.springrestdocsexample.domain.Beer;
import com.adrian.springrestdocsexample.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDTOToBeer(BeerDTO beerDto);

    BeerDTO beerToBeerDTO(Beer beer);
}
