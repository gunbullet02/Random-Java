import java.util.*;

public class HashTable {
    public static void main(String args[]){
    // Hashtable = a data structure that stores unique keys to values ex. <Integer, String>
    // Each key/value pair is known as an Entry
    // Fast insertion, look up, deletion of key/value pairs
    // Not ideal for small data sets, great with large data sets

    // hashing = takes a key and computes an integer (formula will vary based on key & data type)
    // in a hashtable, we use the hash % capacity to calculate an index number

    // key.hashCode() % capacity = index

    // bucket = an indexed stroage location for one or more Entries
    // can store multiple Entries in case of a collision (linked similarily a LinkedList)

    // collision = hash function generates the same index for more than one key
    // less collisions = more effiencey 

    // Runtime complexity : Best Case O(1)
    // Worst Case O(n)

    Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
    	table.put(123, "Patrick");
    	table.put(321, "Sandy");
    	table.put(555, "Squidward");
    	table.put(777, "Gary");
    	  	
    	for(Integer key : table.keySet()) {
    		System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
    	}
    }
}
