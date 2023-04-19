package dev;

import java.util.List;

import dev.domain.Language;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class AppMethode {
    public void create_language(String lang){
        System.out.println("Cree langue en cour !");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mainPersistence");
        System.out.println("Entity Manager Factory Fait !");
        EntityManager em = entityManagerFactory.createEntityManager();

        //code
        Language langueObjet = new Language();
        langueObjet.setLanguage_wording(lang);

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(langueObjet);
        et.commit();
        em.close();
    }
}
