public class Xor {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
           System.out.println(" **************");
    }

    static int[] qBit = { 1, 0, 0, 1, 0, 0, 0, 0, 0 };

    public static void mapp(int dBit[], int indx) {
        int j = 0;

        for (int i = indx; i < indx + dBit.length; i++) {
            if (i + dBit.length > qBit.length) {
                // print(qBit);
                break;
            }
            if (qBit[i] == dBit[j++]) {
                qBit[i] = 0;

            } else {
                qBit[i] = 1;

            }

        }
     
print(qBit);
    }

    public static void divideOper(int dBit[]) {
        String str = "";
        int dbitSize = dBit.length;
        int qBitSize = qBit.length;
        int[] dBit0 = { 0, 0, 0, 0 };

        for (int i = 0; i < qBitSize; i++) {
            if (qBit[i] == 1) {
                mapp(dBit, i);
                str = str + "1";

            } else {
                mapp(dBit0, i);
                str = str + "0";

            }

        }
        System.out.println("********\n"+str+"\n *********** ");
        print(qBit);

    }

    public static void main(String args[]) {

      for(int i = 0, p = 5; i<=5 ||p!=0; i++,p--){
        if(i<=5){
        for(int j = 0 ; j<i; j++){
            System.out.print("*");
        }
        System.out.println();
      }else if(p!=0){

        for(int y  = 0; y<=p; y++){
            System.out.println("*");
        }
        System.out.println();

      }
    
    }
    

    }

}
