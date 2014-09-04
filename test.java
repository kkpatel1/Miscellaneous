class Matrix{

void display()
{

    int a[]={1,6,3,4,0,12,2,5};
    int l=a.length;
    for(int i=0;i<l;i++){
        switch(i)
        {
            case 0:a[i]=a[i+1];
            case 2:a[i]=a[i+2];
            case 6:a[i++]=a[i];
            break;
            case 7:a[i]=a[i-1];
            default:a[i]=a[i++];
        }}
        System.out.print("{");
        for(int i=0;i<l;i++)
        System.out.print(a[i]+",");

        System.out.println("}");
    }

    public static void main(String args[])
    {
        new Matrix().display();
    }
}