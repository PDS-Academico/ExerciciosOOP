public class Compare {
    public static int[] Compara(COLOR[] a,COLOR[]b){
        int[] results = new int[2];
        int[] ac = new int[4];//4 cores por enquanto;
        int[] bc = new int[4];

        for(int i =0;i<a.length;i++){
            if(a[i]==b[i]){results[0]++;}
            ac[a[i].index()]++;
            bc[b[i].index()]++;
        }

        for(int i=0;i<4;i++){
            if(ac[i]<bc[i]){results[1]+=ac[i];}
            else{results[1]+=bc[i];}
        }
        results[1]-=results[0];

        return results;
    }
}
