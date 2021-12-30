package ro.unibuc.springlab8example1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.springlab8example1.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByAddress(String name);

}
