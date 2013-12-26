package net.jankenpoi.sudokuki.solver;

import static org.junit.Assert.*;
import net.jankenpoi.sudokuki.model.GridModel;

import org.junit.Before;
import org.junit.Test;

public class TestBruteForceGridSolver {

	private BruteForceGridSolver solver;
	
	@Before
	public void setUp() throws Exception {
		solver = new BruteForceGridSolver(new GridModel());
	}

	@Test
	public void TestCancel(){
		solver.cancel();
		
		assertNull("Cancel did not go through",solver.resolve());
	}
	
	@Test
	public void TestResolve(){
		GridSolution gs = solver.resolve();
		
		assertTrue("Model should be solved",gs.isSolved());
		
	}
	
	@Test
	public void TestCopyCurrentFlagsToNextPosition(){
		solver.copyCurrentFlagsToNextPosition();
		
		int[] flags = solver.getCellShadowMemory();
		
		assertEquals("Flags should have been copied over",flags[0],flags[81]);
	}
	
	@Test
	public void TestForwardToNextPosition(){
		assertTrue("Solver starts at index 0",solver.getCurrentIndex() == 0);
		
		solver.forwardToNextPosition();
		assertTrue("Solver should now be at 81",solver.getCurrentIndex() == 81);
	}
	
	@Test
	public void TestBackToPreviousPosition(){
		assertTrue("Solver starts at index 0",solver.getCurrentIndex() == 0);
		
		solver.forwardToNextPosition();solver.forwardToNextPosition();solver.forwardToNextPosition();
		
		solver.backToPreviousPosition();

		assertTrue("Solver should now be at 162",solver.getCurrentIndex() == 162);
		
		assertFalse("Solver can go back more", solver.backToPreviousPosition());

		solver.backToPreviousPosition();solver.backToPreviousPosition();
		
		assertTrue("Solver cannot go back anymore", solver.backToPreviousPosition());

	}

}
