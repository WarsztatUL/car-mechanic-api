package pl.arturzaczek.carMechanicDB.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.arturzaczek.carMechanicDB.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
}
