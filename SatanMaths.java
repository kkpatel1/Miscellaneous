// After having his demon henchmen thwarted by the cunning mathematician village chiefs of Earth, the devil himself comes down to Earth to get rid of the problem once and for all.

// Confidently he snarls

// " All you people of Earth stand in a large CIRCLE and number yourself starting from 1 to 10^7. I will devour every 666th person and keep going around and around the circle eating up every 666th person and keep doing this till there is only 1 person left. That last person I will spare and he is free to escape. "

// You are the last living descendant of the mathematician village chiefs and need to ensure that you survive so that mathematics will not perish from Earth.

// Which number will you choose to be the last person standing and escape the clutches of Satan?

// Details and assumptions

// Assume all this happened a long time ago and that Earth only had 10^7 inhabitants.
// Satan will start eating from the 666th person.
// You will be able to have a descendant if you survive because weirdly, Satan forgets to put one female in the circle.
// This is an instance of a very famous problem called the Josephus Problem.
// Example

// It there were 9 people and every 5th person was eaten the people eaten would be 5->1->7->4->3->6->9->2 leaving the 8th person alive.

class Node {
    int no;
    boolean status;
    public Node() {
        no=1;
        status=true;
    }
    public Node(int no) {
        this.no = no;
        status=true;
    }
    public Node(int no, boolean status) {
        this.no = no;
        this.status = status;
    }
}
class LinearList {
    int length=(int)Math.pow(10,7);
    Node[] array;
    public LinearList() {
        array = new Node[length+1];
        for(int i=1; i<array.length; i++) {
            array[i] = new Node(i);
        }
    }
    public void display() {
        for(int i=1; i<array.length; i++) {
            if(!array[i].status) continue;
            System.out.println(array[i].no+" "+array[i].status);
        }
    }
    public int delete(int from, int steps) {
        int i = from;
        while(steps>1) {
            if(array[i].status) {
                steps--;
            }
            i=(i+1)%length;
            if(i==0) i=length;
            if(steps==1) {
                while(!array[i].status) {
                    i=(i+1)%length;
                    if(i==0) i=length;
                }
            }
        }
        if(array[i].status) {
            array[i].status=false;
            return i;
        }
        return -1;
    }
    public int deleteR(int from, int steps) {
        int count=0;
        while(from!=-1 && count!=length) {
            count++;
            from=delete(from,steps);
            steps=steps;
            System.out.println(" "+from);    
        }
        return -1;
    }
}
public class SatanMaths {
    static LinearList obj;
    public SatanMaths() {
        obj=new LinearList();
    }
    public static void main(String[] args) {
        SatanMaths test = new SatanMaths();
        obj.deleteR(1,666);

    }
}