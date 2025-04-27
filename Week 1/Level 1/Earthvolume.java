public class Earthvolume 
{
public static void main(String[] args) 
{
double radiusKm = 6378;
double kmToMiles = 0.621371;
double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
double radiusMiles = radiusKm * kmToMiles;
double volumeMi3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
System.out.println("Volume of Earth in cubic kilometers: " + volumeKm3 + " km^3");
System.out.println("Volume of Earth in cubic miles: " + volumeMi3 + " mi^3");
}
}
