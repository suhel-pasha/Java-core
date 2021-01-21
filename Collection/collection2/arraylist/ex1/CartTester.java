package com.xworkz.java_programs.collection.collection2.arraylist.ex1;

import java.util.ArrayList;
import java.util.Collection;

public class CartTester {

	public static void main(String[] args) {
		
		ShoppingCartDTO cartDTO1 = new ShoppingCartDTO();
		
		cartDTO1.setItemNameString("Shirt");
		cartDTO1.setPrice(1000);
		cartDTO1.setQuantity(1);
		
		ShoppingCartDTO cartDTO2 = new ShoppingCartDTO();
		
		cartDTO2.setItemNameString("Shoe");
		cartDTO2.setPrice(1500);
		cartDTO2.setPrice(1);
		
		Collection<ShoppingCartDTO> cartDTOs = new ArrayList<ShoppingCartDTO>();
		
		cartDTOs.add(cartDTO1);
		cartDTOs.add(cartDTO2);
		// checking if any of the dtos contain the shoe as thier item name
          int count = 0;
		for (ShoppingCartDTO shoppingCartDTO : cartDTOs) {
			if(shoppingCartDTO.getItemNameString().equals("Shoe")) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("The item 'Shoe' exists");
		}
		else {
			System.out.println("The item 'Shoe' does not exist");
		}
		

	}

}
