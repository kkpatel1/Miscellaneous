// You are the village chief. Your village has 1000 residents including yourself. One day the ferocious EVEN DEMON attacks your village and snarls,

// "All you 1000 villagers stand in a large CIRCLE, numbering yourself from 1 to 1000. Starting from number 1, I will eat every second villager and keep going around and around the circle eating up every second villager and keep doing this till there is only 1 villager left. That last villager I will spare and he is free to escape."

// Since you are the village chief, you have the right to choose where you wish to stand.

// In the original circle of 1000 villagers which number will you choose to stand at to be the last villager standing and escape the clutches of the EVEN DEMON?
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
    int length=(int)Math.pow(10,3);
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
public class EscapeEvenDemon {
    static LinearList obj;
    public EscapeEvenDemon() {
        obj=new LinearList();
    }
    public static void main(String[] args) {
        EscapeEvenDemon test = new EscapeEvenDemon();
        obj.deleteR(1,2);

    }
}