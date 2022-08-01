class java6 {
public static void main(String[] args) {
     int a[][]={{12,34,45},{1,3,5},{123,54,567},{125,890,67}};
    for (int i=0;i<a.length;i++)
    {
        for (int j=0;j<a[i].length; j++) {
            System.out.print("a["+i+"]["+j+"]:"+a[i][j]+"\t");
        }
        System.out.println();
    }


}
}    