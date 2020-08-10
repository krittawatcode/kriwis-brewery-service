package kriwis.springframework.kriwisbreweryservice.web.repository;

import kriwis.springframework.kriwisbreweryservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;


public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}