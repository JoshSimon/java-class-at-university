/**
 * collections are containers for objects
 *
 * traditionally arrays were used to represent "lists", but the main
 * disadvantages are
 *  - you need to know their size beforehand
 *  - you cannot easily access them
 *
 *  the 'Collection' is actually only an INTERFACE with basic operations like 'add(...)' and 'size()'
 *  but it also has an ITERATOR
 *
 *  iterators are used to run "for each" loops over the collection
 *
 *  overview of the interface inheritance
 *
 *                      Collection                            Map
 *                     /     |    \                            |
 *                   Set    List  Queue                   Sorted Map
 *                    |
 *               Sorted Set
 *
 *
 */

import java.util.*;

public class collections {

    private String[] arrayOfString =  new String[10];
    private ArrayList<String> arrayList = new ArrayList<>(); // the generic is already set as String, so no generic type needs to be provided;
    private LinkedList<String> linkedList = new LinkedList<>();




    collections(String a, String b){
        this.arrayOfString[0] = a; this.arrayOfString[1] = b; // the position within the array has to be set
        this.arrayList.add(2,b); this.arrayList.add(a); // the position can be set or the element is just added to the end
        this.linkedList.add(b); // this.linkedList(2,a) ! the linkedList has no index
        this.linkedList.addFirst(a);
    }


    /**
     * Looping through collections and maps
     *
     * only collections have an iterator which makes it possible to see if there is a
     * next element within the collection
     *
     * maps have to be converted to sets of keys, or key-values to make an iterator accessible
     *
     */

    // while loop with iterator
    public void iterateThroughAndPrint_(Collection co){
        Iterator iterator = co.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // for loop with for each
    public void iterateThroughAndPrint(Collection co){
        for(Object iterator : co){
            System.out.println(iterator);
        }
    }


    // while loop for map with provided generics
    public void iterateThroughAndPrint_(Map<Integer,String> map){
        // entrySet makes a set out of key-value pairs
        // because a set inherits from a collection, it has an iterator
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> element  = iterator.next();
        }
    }

    // for each version for all maps
    public void iterateThroughAndPrint(Map map) {
        for (Object key : map.keySet()) {
            System.out.println("k: " + key + " v: " + map.get(key));
        }
    }

    /**
     * expensive and cheap list actions
     * 'ArrayList' vs 'LinkedList'
     */

}