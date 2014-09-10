package cc150bench;

public class DetourCalculator {
	public static class Point {
		private double longitude, latitude;
		
		public Point(double lon, double lat) {
			this.longitude = lon;
			this.latitude = lat;
		}
		// getter/setter
	}
	
	/*
	 * calculate distance between two points - assume the world is a 2D-plane 
	 */
	public static double calcDistance(Point source, Point dest) {
		return Math.sqrt(Math.pow((dest.latitude - source.latitude), 2) + Math.pow((dest.longitude - dest.longitude), 2));
	}
	
	/*
	 * get the shorter detour between A->C->D->B and C->A->B->D
	 */
	public static double getShorterDetour(Point A, Point B, Point C, Point D) {
		// A-C and B-D are same for both drivers, the difference lies in C-D and A-B 
		return calcDistance(A, C) + calcDistance(B, D) + Math.min(calcDistance(A, B), calcDistance(C, D));
	}
}
