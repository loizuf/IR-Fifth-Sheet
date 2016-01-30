package _fifthWork;

import java.util.ArrayList;

import _fifthGiven.Document;

public class Index {
	
	ArrayList<Document> collection;

	// TASK 1 start
	// indexes all the terms so we can use them
	public Index(ArrayList<Document> collection) {
		this.collection = collection;
	}

	private float getPTQuotient(String term) {
		return 0.0f;
	}
	
	private float getUTQuotient(String term) {
		return 0.0f;
	}
	
	public ArrayList<Integer> probSearch(String query, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		return result;
	}
}
