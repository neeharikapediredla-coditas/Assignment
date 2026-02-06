class sortcolors {
    public static void sort(String[] colors) {
        int low = 0, mid = 0, high = colors.length - 1;
        while (mid <= high) {
            if (colors[mid].equals("red")) {
                swap(colors, low, mid);
                low++;
                mid++;
            } else if (colors[mid].equals("white")) {
                mid++;
            } else {
                swap(colors, low, high);
                high--;
            }
        }
    }
    static void swap(String [] a,int i,int j)
    {
        String temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String [] args)
    {
        String[] colors={"blue","red","blue","white","white","red"};
        sort(colors);
        for(String s:colors)
            System.out.print(s+" ");

    }
}