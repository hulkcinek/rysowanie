public class Main {

        /*
        W srodku ma byc romb.
        Na wejsciu mamy otrzymac liczbe n = jaka jest szerokosc figury (prostokata)
        Oraz liczbe k ktora mowi ile razy figura ma byc wydrukowana.
        **********
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        * ********
        * ^ w tym przypadku k = 2 i w srodku maja byc dwa romby stykajace sie wierzcholkami
        *
        * *****
        *   *
        *  * *
        * *   *
        **
        * *
        *  *
        *   *
        *   *
        *  *
        * *
        *
        *
        * *****
        *
        * ******
        *   **
        *  *  *
        * *
        **
        * *
        *
         */


        /*

        Do dokonczenia to,
        Do dokonczenia literki,
        Do wrzucenia na GIT:
            literki
            ONP,
            to


         */
    public static void main(String[] args) {

        int k, n;
        k = 1;
        n = 13;
        for (int i = 0; i < n; i++) {  //  y
            for (int j = 0; j < n; j++) {   //  x
                if (j+i == n/2+1){          //lewy gorny bok
                    System.out.print("* ");
                }else if (j-i == n/2-1){        //prawy gorny bok
                    System.out.print("* ");
                }else if (i-j==n/2-1) {         //lewy dolnt bok
                    System.out.print("* ");
                }else if (j+i==n+(n/2-2)){      //prawy dolny bok
                    System.out.print("* ");
                }else if (i==0 ||j==0 || i==n-1 || j==n-1) {   //obramowanie figury
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
