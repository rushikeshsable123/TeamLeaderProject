package com.service;

import java.util.List;

import com.model.Enqury;

public interface EnquryService {

	public Enqury saveEnqury(Enqury e);

	public Enqury updatedata(Enqury e,int customerID);

	public void deletedata(int customerID);

	public List<Enqury> getAlldata();

	public Enqury singledata(int customerID);

	public void deleteAllData(Enqury e);

}
