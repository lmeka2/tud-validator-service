package ie.tud.msc.tudvalidatorservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import ie.tud.msc.tudvalidatorservice.data.dto.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
