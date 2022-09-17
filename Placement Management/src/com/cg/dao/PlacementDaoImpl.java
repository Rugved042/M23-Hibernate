package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Placement;

public class PlacementDaoImpl implements PlacementDao
{
    //  Step 1: Start JPA LifeCycle
    private EntityManager em;
    public PlacementDaoImpl (){
    	em =JPAUtil.getEntityManager();
    }

    @Override
    public Placement addPlacement(Placement placement) {
    	em.persist(placement);
        return placement;

    }

    @Override
    public Placement updatePlacement(Placement placement) {
    	em.merge(placement);
        return placement;
    }

    @Override
    public Placement searchPlacement(int place_id) {
        return em.find(Placement.class,place_id);
    }

    @Override
    public Placement deletePlacement(int place_id) {
        Placement placement=em.find(Placement.class,place_id);
        em.remove(placement);
        return placement;
    }

    @Override
    public void beginTransaction() {
    	em.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
    	em.getTransaction().commit();
    }
}