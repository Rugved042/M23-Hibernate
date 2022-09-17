package com.cg.service;

import com.cg.entities.College;
import com.cg.entities.Placement;

public interface CollegeService 
{
	College addCollege(College college);
	College updateCertificate(College college);
	College searchCertificate(int college_id);
	College deleteCertificate(int college_id);
	boolean shedulePlacement(Placement placement);
	

}