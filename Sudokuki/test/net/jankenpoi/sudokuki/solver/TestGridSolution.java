package net.jankenpoi.sudokuki.solver;

import static org.junit.Assert.*;
import net.jankenpoi.sudokuki.model.GridModel;

import org.junit.Before;
import org.junit.Test;

public class TestGridSolution {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestIsSolved(){
		GridSolution gs1 = new GridSolution(true, null);
		assertTrue("Boolean incorrect",gs1.isSolved());
		
		GridSolution gs2 = new GridSolution(false, null);
		assertFalse("Boolean incorrect",gs2.isSolved());
	}
	
	@Test
	public void TestGetSolutionGrid(){
		GridModel gm = new GridModel();
		GridSolution gs = new GridSolution(true, gm);
		
		assertSame("GridModel lost",gm,gs.getSolutionGrid());
	}
}
