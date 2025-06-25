package com.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.model.Enqury;
import com.repo.EnquryRepository;
import com.service.EnquryService;

@Service
public class EnquryServiceIMPL implements EnquryService {

	@Autowired
	EnquryRepository er;

	@Override
	public Enqury saveEnqury(Enqury e) {

		
		return er.save(e);
	}

	@Override
	public Enqury updatedata(Enqury e,int customerID) {
Optional<Enqury> g=er.findById(customerID);

		Enqury h=er.save(e);
return h;

	}

	@Override
	public void deletedata(int customerID) {
		
		er.deleteById(customerID);
	}

	@Override
	public List<Enqury> getAlldata() {

		return (List<Enqury>)er.findAll();
	}

	@Override
	public Enqury singledata(int customerID) {

		List<Enqury> enqurylist=er.findAll();
		for(Enqury enq: enqurylist)
		{
			if(enq.getCustomerID()==(customerID))
			{
				return enq;
			}
		}
		return null;
	}

	@Override
	public void deleteAllData(Enqury e) {
		
		er.deleteAll();
	}
	
	
}
