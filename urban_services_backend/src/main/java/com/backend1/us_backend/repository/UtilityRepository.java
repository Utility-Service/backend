package com.backend1.us_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend1.us_backend.entity.Utility;

@Repository
public interface UtilityRepository extends JpaRepository<Utility, Integer> {

    List<Utility> findByType(String typeofservice);

}
