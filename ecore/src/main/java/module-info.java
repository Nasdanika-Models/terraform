import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.terraform.ecore.ECoreGenTerraformProcessorsCapabilityFactory;

module org.nasdanika.models.terraform.ecore {
		
	requires transitive org.nasdanika.models.terraform;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.terraform.ecore;
	opens org.nasdanika.models.terraform.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenTerraformProcessorsCapabilityFactory; 		
	
}
