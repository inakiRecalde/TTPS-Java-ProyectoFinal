package ttps.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>{

}
