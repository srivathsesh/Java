/* this is my first class in Java*/
public class SimpleLocation {
	// member variables; exist as long as the class is alive
	public double latitutde;
	public double longitude;
	//private double lattitude;
/* Below lines denote methods in a class */
/* constructor method - which is a special method that runs by default when the class is called/used.
 * This is used to create the object SimpleLocation.The way to identify the constructor class is: Note that the
 * method doesn't return anything and is PUBLIC and the METHOD NAME IS SAME AS THE CLASS
 */
	public SimpleLocation (double lat, double lon){
		this.latitutde = lat;
		this.longitude = lon;
		
	}
	// distance method
	public double distance(SimpleLocation other){
		getDist dist = new getDist(this.latitutde,this.longitude,other.latitutde,other.longitude);
		double distancetoloc = dist.getDistance(this.latitutde, this.longitude, other.latitutde, other.longitude);
		return distancetoloc;
	}
}
