package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long>{

}
