package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.model.Sponsor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorJpaRepository extends JpaRepository<Sponsor, Integer> {

}

/*
 * You can use the following import statements
 *
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here