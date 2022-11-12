package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Url;

public interface UrlRepository extends JpaRepository<Url, Long>{

}
