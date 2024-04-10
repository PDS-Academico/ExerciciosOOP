public class capici {
    public static boolean capicua(int n){
        int invert =0;
        int nro = n;
        while(nro%10 != 0){ 
            invert=invert*10;
            invert = invert + (nro % 10);
            nro = nro / 10;
        }
        return invert == n;
    }
}
