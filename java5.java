// class arraydemo 
// {
// public static void main(String[] args) {
//     int a[]={56,67,78,90,345,46};
//     for(int i=0;i<a.length;i++) {
//         System.out.println("a["+i+"]=+"+a[i]);
//     }
// }}
class arraydemo
{
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int i=0;i<matrix.length;i++)
        for (int j=0; j<matrix[i].length;j++)
        {
            matrix[i][j]=(int)(Math.random()*1000);
        }
        double[][] x;
        System.out.println(matrix);
    }
}
// int [][] array={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
// array.length
// Ragged array
