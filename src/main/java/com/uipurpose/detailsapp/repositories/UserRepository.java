package com.uipurpose.detailsapp.repositories;

import com.uipurpose.detailsapp.entities.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDetails,Long> {

}
