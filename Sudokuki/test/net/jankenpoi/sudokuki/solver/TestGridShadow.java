package net.jankenpoi.sudokuki.solver;

import static org.junit.Assert.*;
import net.jankenpoi.sudokuki.model.GridModel;

import org.junit.Before;
import org.junit.Test;

public class TestGridShadow {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestPopFirstCellWithMinPossValues(){
		GridShadow gs = new GridShadow(new int[81 * 81], 0, true);
		
		assertEquals("Expect -1",gs.popFirstCellWithMinPossValues()[0],-1);
		assertEquals("Expect -1",gs.popFirstCellWithMinPossValues()[1],-1);
	}
	
	@Test
	public void TestPopFirstValueForCell(){
		GridShadow gs = new GridShadow(new int[81 * 81], 0, true);
		
		assertEquals("Position 5,5 should be 1",gs.popFirstValueForCell(5, 5),1);
	}

}
