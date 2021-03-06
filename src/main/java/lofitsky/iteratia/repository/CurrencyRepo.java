package lofitsky.iteratia.repository;

import lofitsky.iteratia.model.Currency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для {@link Currency}.
 */

@Repository
public interface CurrencyRepo extends CrudRepository<Currency, Long> {

    Currency findByNumCode(int numCode);
}