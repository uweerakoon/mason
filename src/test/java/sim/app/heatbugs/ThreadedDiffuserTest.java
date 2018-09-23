package sim.app.heatbugs;

import org.junit.BeforeClass;
import org.junit.Test;

import sim.field.grid.DoubleGrid2D;
import junit.framework.TestCase;

public class ThreadedDiffuserTest extends TestCase {
  
  private static final int WIDTH = 4;
  private static final int LENGTH = 4;

  private static HeatBugs heatBugs = new HeatBugs(System.currentTimeMillis());
  private static ThreadedDiffuser threadedDiffuser = new ThreadedDiffuser(2);
  private static DoubleGrid2D valgrid = new DoubleGrid2D(WIDTH, LENGTH);
  private static DoubleGrid2D valgrid2 = new DoubleGrid2D(WIDTH, LENGTH);
  
  private static final int DIFFUSER_ONE_START = 0;
  private static final int DIFFUSER_ONE_END = WIDTH / 2 * (0 + 1);
  private static final int DIFFUSER_TWO_START = WIDTH / 2 * 1;
  private static final int DIFFUSER_TWO_END = WIDTH;
  
  
  @Test
  public void testDiffuse(){
    heatBugs.valgrid = valgrid;
    heatBugs.valgrid2 = valgrid2;
    threadedDiffuser.diffuse(heatBugs, DIFFUSER_ONE_START, DIFFUSER_ONE_END);
  }

}
