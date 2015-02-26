/* Copyright (c) 2014 Peter Rimshnick
 * See the file license.txt for copying permission.
 */
package pmr.threes;

public interface Move {
	
	public State[] findEndStatesForSearch();

	public State[] findEndStatesForSim();
	

}