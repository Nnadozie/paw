package com.paawww.paw.repositories;

import com.paawww.paw.models.UserDataModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserDataModel, Integer>{
   public UserDataModel getUserByName(String firstName, String LastName); 
}