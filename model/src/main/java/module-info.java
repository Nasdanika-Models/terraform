import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.terraform.util.TerraformEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.terraform {
	
	exports org.nasdanika.models.terraform;
	exports org.nasdanika.models.terraform.impl;
	exports org.nasdanika.models.terraform.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with TerraformEPackageResourceSetCapabilityFactory;
	
}