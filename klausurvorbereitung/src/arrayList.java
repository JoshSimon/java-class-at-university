import java.util.ArrayList;

public class arrayList {

    private ArrayList<String> list;

    arrayList(String a, String b){
        this.list =  new ArrayList<>();
        this.list.add(a);
        this.list.add(b);
    }

    public void removeLastString(String c){
        this.list.remove(list.size()-1);
    }

    public void setStringAtCertainPosition(String d, int index){
        if(this.list.size()-1<index){
            System.out.println("The given index is out of bound");
        }
        else {
            this.list.set(index, d);
        }
    }
    public void printArrayList(){
        for(String text: this.list){
            System.out.println("\n" + text);
        }
    }
}