package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Enqury;
import com.service.EnquryService;

@RestController
public class EnquryController {

	@Autowired
	EnquryService erc;
	
	@PostMapping("/saveEnquiry")
	public Enqury saveenqury(@RequestBody Enqury e)
	{
		 Enqury en=erc.saveEnqury(e);
		
		return en;
	}
	@PutMapping("/update/{customerID}")
	public Enqury putMethodName(@PathVariable int customerID,@RequestBody Enqury e )
	{
		
		Enqury h=erc.updatedata(e, customerID)	;
		return h;
	}
	@DeleteMapping("/delete/{customerID}")
	public void deletedata(@PathVariable int customerID)
	{
		erc.deletedata(customerID);
		
	}
	@GetMapping("/getdata")
	public List<Enqury> getAlldata()
	{
		List<Enqury> list=erc.getAlldata();
		return list;
		
	}
	@GetMapping("/getsingledata/{customerID}")
	public Enqury singledata(@PathVariable int customerID)
	{
		return erc.singledata(customerID);
		
	}
	
	@DeleteMapping("/deleteAllData")
	public void deleteAllData(@RequestBody Enqury e)
	{
		erc.deleteAllData(e);
	}
	
}
