package EJ.Fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class emeraldFluid extends Fluid {

	 public emeraldFluid(){
		 super("EmeraldFluid");
		 setDensity(10); // How tick the fluid is, affects movement inside the liquid.
		 setViscosity(1000); // How fast the fluid flows.
		 FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
	 }
	 
	 
	
		 
	 
}

