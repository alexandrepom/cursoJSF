/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gonzaga.cursojsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alexandre
 */
public class JPAUtil {
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("CursoJSF");
    
    public static EntityManager getEntityManager(){
        return EMF.createEntityManager();
    }
}
