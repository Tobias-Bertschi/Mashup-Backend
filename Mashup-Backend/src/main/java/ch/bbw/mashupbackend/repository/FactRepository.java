package ch.bbw.mashupbackend.repository;

import ch.bbw.mashupbackend.model.Fact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FactRepository extends CrudRepository<Fact, Long> {

}
