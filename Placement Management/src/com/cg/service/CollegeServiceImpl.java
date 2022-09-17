package com.cg.service;

import com.cg.dao.CollegeDao;
import com.cg.dao.CollegeDaoImpl;
import com.cg.entities.College;
import com.cg.entities.Placement;

public class CollegeServiceImpl implements CollegeService
{

private CollegeDao dao;
	
	public CollegeServiceImpl() {
		super();
		dao=new CollegeDaoImpl();
	}
	@Override
	public College addCollege(College college) {
		dao.beingTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	
	@Override
	public College updateCertificate(College college) {
		dao.beingTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCertificate(int college_id) {
		College college=dao.searchCollege(college_id);
		return college;
	}

	@Override
	public College deleteCertificate(int college_id) {
		College college=dao.deleteCollege(college_id);
		return college;
	}
	@Override
	public boolean shedulePlacement(Placement placement) {
		dao.beingTransaction();
		boolean res=((CollegeServiceImpl) dao).shedulePlacement(placement);
		dao.commitTransaction();
		return res;
	}

}