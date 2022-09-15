package com.collection8;

import java.util.Comparator;

public class ProductionFacilityOnItem implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		return o2.getTotalproduction_perday()-(o1.getTotalproduction_perday());
	}

}
