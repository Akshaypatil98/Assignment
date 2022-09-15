package com.collection8;

import java.util.Comparator;

public class ProductionFacilityOnDate implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		return o1.getProd_date().compareTo(o2.getProd_date());
	}
	
}
