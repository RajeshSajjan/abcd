
Hi this is rajesh
Answers



public class AngleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double angle=new AngleCalculator().getAngle(1, 3, 5, 4);
		System.out.println("Angle : "+angle);
	}
	
	public double findAngle(float xPos,float yPos, float x1Pos, float y1Pos)
	{
	  double PI=22/7;
	  double angle=Math.atan2(yPos, xPos) * 180 / PI;
	  return angle;
	}
	
	public double getAngle(float xPos,float yPos, float x1Pos, float y1Pos)
	{
	    double dx = xPos - x1Pos;
	    // Minus to correct for coord re-mapping
	    double dy = -yPos - y1Pos;

	    double inRads = Math.atan2(dy,dx);

	    // We need to map to coord system when 0 degree is at 3 O'clock, 270 at 12 O'clock
	    if (inRads < 0)
	        inRads = Math.abs(inRads);
	    else
	        inRads = 2*Math.PI - inRads;

	    return Math.toDegrees(inRads);
	}
	
	

}
