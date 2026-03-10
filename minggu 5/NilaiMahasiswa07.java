public class NilaiMahasiswa07 {

    int uts[];
    int uas[];

    NilaiMahasiswa07(int uts[], int uas[]){
        this.uts = uts;
        this.uas = uas;
    }

    int maxUTS(int l, int r){
        if(l == r){
            return uts[l];
        }

        int mid = (l + r) / 2;

        int max1 = maxUTS(l, mid);
        int max2 = maxUTS(mid + 1, r);

        if(max1 > max2){
            return max1;
        } else {
            return max2;
        }
    }

    int minUTS(int l, int r){
        if(l == r){
            return uts[l];
        }

        int mid = (l + r) / 2;

        int min1 = minUTS(l, mid);
        int min2 = minUTS(mid + 1, r);

        if(min1 < min2){
            return min1;
        } else {
            return min2;
        }
    }

    double rataUAS(){
        int total = 0;

        for(int i = 0; i < uas.length; i++){
            total += uas[i];
        }

        return (double) total / uas.length;
    }
}