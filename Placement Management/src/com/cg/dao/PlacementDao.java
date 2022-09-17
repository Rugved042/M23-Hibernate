package com.cg.dao;

import com.cg.entities.Placement;

public interface PlacementDao {

    public Placement addPlacement(Placement placement);
    public Placement updatePlacement(Placement placement);
    public Placement searchPlacement(int place_id);
    public Placement deletePlacement(int place_id);

    public abstract void beginTransaction();
    public abstract void commitTransaction();
}