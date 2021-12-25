package com.mrp.system.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrp.system.BillJournal;
import com.mrp.system.BycleBuild;
import com.mrp.system.HandInventory;

@RestController
public class ByclePlanningController {


	@GetMapping("/mrpBycle/{quanity}")
	@ResponseBody
	public  String getBomForBycle(@PathVariable  Integer quanity) throws JsonMappingException, JsonProcessingException {

		List<BycleBuild> bycleBuilds = BycleBuild.getBycleBuild();

		List<HandInventory> handInventories = HandInventory.getHandInventories();

		List<BillJournal> billJournals = new ArrayList<BillJournal>();

		bycleBuilds.forEach(bycleBuild -> {

			int totalQuanity = bycleBuild.getRatio() * quanity;

			Optional<HandInventory> findFirst = handInventories.stream().filter(handInventory -> {
				return bycleBuild.getProduct().equalsIgnoreCase(handInventory.getProductType());
			}).findFirst();

			HandInventory handInventory = findFirst.get();

			Integer quanityNeedsToPurchase = totalQuanity - handInventory.getStock();

			BillJournal billJournal = new BillJournal(handInventory.getProductType(), totalQuanity,
					quanityNeedsToPurchase);
			billJournals.add(billJournal);

		});

		String writeValueAsString = new ObjectMapper().writeValueAsString(billJournals);
		
		return writeValueAsString;

	}

}
