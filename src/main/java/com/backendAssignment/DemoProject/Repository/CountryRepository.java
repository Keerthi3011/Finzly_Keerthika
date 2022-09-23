package com.backendAssignment.DemoProject.Repository;

import com.backendAssignment.DemoProject.Entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>
{

}
