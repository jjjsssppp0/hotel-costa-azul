package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cibertec.model.HabitacionEntity;

public interface HabitacionRepository extends JpaRepository<HabitacionEntity, Integer> {
}
