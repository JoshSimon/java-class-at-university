/**
 * call by value vs. call by reference
 *
 * immutable data types are relatively small and have a fixed size of internal
 * memory which they get assigned
 * when handling primitive data types, each time a copy is created and put
 * somewhere in the memory
 *
 * INSTEAD with mutable data types, like any object
 * the reference (pointer) to the internal memory is handed over
 * if changes are applied to that memory entry, the changes affect
 * every other occurance of that certain variable (its reference)
 */


public class call_by_value_reference {
    call_by_value_reference(){}

    public String makeChanges(int a, String b) {
        a++;
        b = b + "test";
        System.out.println("Applied changes" + b);
        return b;
    }
}

