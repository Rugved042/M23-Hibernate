package com.cg.service;

import com.cg.entities.Placement;

public interface PlacementService {
    public Placement addPlacement(Placement placement);
    public Placement updatePlacement(Placement placement);
    public Placement searchPlacement(int place_id);
    public Placement deletePlacement(int place_id);

}