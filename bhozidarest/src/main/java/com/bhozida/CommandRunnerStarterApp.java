package com.bhozida;

import java.util.HashSet;
import java.util.Set;

import com.bhozida.model.Cost;
import com.bhozida.model.Idea;
import com.bhozida.service.CostService;
import com.bhozida.service.IdeaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunnerStarterApp implements CommandLineRunner {
    @Autowired
    private  CostService costService;
    @Autowired
    private  IdeaService ideaService;

    @Override
    public void run(String... args) throws Exception {

		Set<Cost> setCost = new HashSet<Cost>();

		Cost cost = new Cost("WORKING_CAPITAL","Sugar","KG",100.00,10.00);
		cost = costService.addUpdate(cost);
		Cost cost1 = new Cost("CAPITAL","Salt","KG",10.00,9.00);
		cost1 = costService.addUpdate(cost1);
		Cost cost2 = new Cost("CAPITAL","Oil","KG",11.00,1.00);
		cost2 = costService.addUpdate(cost2);

		setCost.add(cost);
		setCost.add(cost1);
		setCost.add(cost2);
	
		Idea idea = new Idea("Sell potatoes","/images/idea/idea.jpg", "RETAIL","VERY_SMALL","Back yard sales",
		 "Buy from local market and sell at home", "Everyone wants to eat",
			"Water,cash, and stall", "No Support",setCost);
	
        idea = ideaService.addUpdate(idea);
        
        System.out.println(idea.toString());

    }
}


