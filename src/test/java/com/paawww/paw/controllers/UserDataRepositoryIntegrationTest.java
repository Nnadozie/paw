package com.paawww.paw.controllers;

import com.paawww.paw.models.UserDataModel;
import com.paawww.paw.repositories.UserDataRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserDataRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserDataRepository userDataRepository;

    @Test
    public void whenGetUserByName_thenReturnUser() {
        UserDataModel nnadozie = new UserDataModel();
        nnadozie.setName("nnadozie");
        nnadozie.setLastName("Okeke");

        entityManager.persist(nnadozie);
        entityManager.flush();

        UserDataModel found = userDataRepository.findByName(nnadozie.getName());
        
        assertThat(found.getName()).isEqualTo(nnadozie.getName());
        
    }
    
}
