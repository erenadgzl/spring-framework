package com.springprojects.repo;

/* 
Eren created on 19.07.2020 
*/

import com.springprojects.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
