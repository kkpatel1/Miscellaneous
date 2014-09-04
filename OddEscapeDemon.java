// You are the village chief. Your village has 1000 residents including yourself. One day the ferocious ODD DEMON attacks your village and snarls,

// "All you 1000 villagers stand in a line. Starting from number 1, I will eat every odd numbered villager. After the first round, I will again start from the beginning and eat up the people who now are odd numbered in the line and keep doing this till there is only 1 villager left. That last villager I will spare and he is free to escape."

// Since you are the village chief, you have the right to choose where you wish to stand.
// In the original line up of 1000 villagers which number will you choose to stand at to be the last villager standing and escape the clutches of the ODD DEMON?

public class OddEscapeDemon {
    static int[] array;
    static void initialise() {
        array = new int[1000];
        for(int i=0; i<array.length; i++) {
            array[i]=i+1;
        }
    }
    static int mainFunction() {
        while(array.length>1) {   
            int count=0;
            for(int i=0; i<array.length; i++) {
                if(i%2 ==0) {
                    count++;
                    array[i]=0;
                }
            }
            int[] temp = new int[array.length-count];
            int tempCount=0;
            for(int i=0; i<array.length; i++) {
                if(array[i]!=0) {
                    temp[tempCount++] = array[i];
                }
            }
            array=new int[temp.length];
            array=temp;
        }
        return array[0];
    }
    public static void main(String[] args) {
        initialise();
        System.out.println(mainFunction());
    }
}