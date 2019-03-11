package com.example.springbootexperiments.com.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Transactional
@Repository@Getter@Setter
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress(){
        User user = new User("ss");
        em.persist(user);
        Address address1 = new Address("433");
        em.persist(address1);
        Address address2 = new Address("434");
        em.persist(address2);
        address1.setUser(user);
        address2.setUser(user);
    }
}
