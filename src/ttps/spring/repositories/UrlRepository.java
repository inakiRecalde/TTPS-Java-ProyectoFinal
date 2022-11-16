package ttps.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long>{

}
