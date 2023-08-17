package org.example;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.entity.Organization;
import org.example.entity.Volunteer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Organization organization = Organization.builder()
                .name("Div")
                .mail("divacademy@mail.ru")
                .fax("1234")
                .volunteerList(List.of(
                        Volunteer.builder()
                                .name("Nihat")
                                .salary(2000.0)
                                .age(19)
                                .surname("Quliyev")
                                .build(),
                        Volunteer.builder()
                                .name("Khadija")
                                .salary(2000.1)
                                .surname("Madnayeva")
                                .age(19)
                                .build(),
                        Volunteer.builder()
                                .name("Elcin")
                                .salary(2000.0)
                                .surname("Huseynli")
                                .age(19)
                                .build()))
                .build();




        entityTransaction.begin();

        entityManager.persist(organization);

        entityTransaction.commit();
    }
}
