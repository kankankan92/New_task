package ru.kourilenko;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2};
        int[] b = {-1, 3, 5, -2, 4};
//        System.out.println(Main.summArray(a));
 /*       System.out.println(a[Main.equilibrium(a)]);
        System.out.println(b[Main.equilibrium(b)]);
        System.out.println(Main.equilibrium(new int[]{}));
        System.out.println(Main.equilibrium(new int[]{0}));
        System.out.println(Main.equilibrium(new int[]{0,-2,2}));
        System.out.println(Main.equilibrium(new int[]{-2,2,2}));*/
        System.out.println(Main.equilibrium(new int[]{1,1,1,1}));

    }

    private static int equilibrium(int[] a) {
        if (a.length == 0){
            System.err.println("Пустой массив!");
            return -1;
        }

        int i = 0;
        int summ1 = 0;
        int summ2 = summArray(a)-a[i];
        while (summ1 != summ2){
            summ1 = summ1 + a[i];
            i++;
            if (i == a.length){
                System.err.println("Дошли до конца! Эквилибриум не нашли((");
                return -1;
            }
            summ2 = summ2 -a[i];
        }

        return i;
    }

    private static int summArray(int[] a){
        int summ = 0;

        for (int i = 0; i<a.length; i++){
            summ = summ + a[i];
        }
        return summ;
    }





}