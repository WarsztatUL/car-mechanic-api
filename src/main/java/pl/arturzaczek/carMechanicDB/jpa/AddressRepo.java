package pl.arturzaczek.carMechanicDB.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.arturzaczek.carMechanicDB.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}
