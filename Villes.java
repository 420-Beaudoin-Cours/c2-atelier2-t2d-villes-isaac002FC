public class Villes {

    public static void afficherTab(int[][] tab){

        for (int i=0; i<tab.length;i++){

            for (int j=0; j<tab[0].length; j++){

                System.out.print(tab[i][j] + " ");

            }

            System.out.println();
        }


    }

    public static int sommeUneLigne(int[][] tab, int iLigne){

        int sommeResultat = 0;

        for (int i=0;i<tab[iLigne].length;i++){

            sommeResultat += tab[iLigne][i];

        }

        return sommeResultat;

    }

    public static double moyenneUneLigne(int[][] tab, int iLigne){

        double somme = sommeUneLigne(tab, iLigne);

        if(tab[iLigne].length > 0)
            return somme/tab[iLigne].length;
        else
            return -1;

    }

    public static double moyenneUneCol(int[][] tab, int iCol){

        double somme = 0;

        for (int i=0;i<tab.length;i++){

            somme += tab[i][iCol];

        }

        if(tab.length > 0)
            return somme/tab.length;
        else
            return -1;

    }

    public static int maxLigne(int[][] tab, int iLigne){

        int iMax = 0;

        for (int i=0; i<tab[iLigne].length; i++){

            if(tab[iLigne][i] > tab[iLigne][iMax])

                iMax = i;

        }

        return tab[iLigne][iMax];
    }

    public static int minLigne(int[][] tab, int iLigne){

        int iMin = 0;

        for (int i=0; i<tab[iLigne].length; i++){

            if(tab[iLigne][i] < tab[iLigne][iMin])

                iMin = i;

        }

        return tab[iLigne][iMin];
    }

}
