package com.company;



public class measure {

    public measure(){
    } //konstruktor

    public static void graphMeasure(int countUnit, int countScale) {

        markCypher(countScale, 0);

        int i=0;
        while(i<countUnit)
        {
            recursionInterval(countScale-1, countScale);
            markCypher(countScale, i+1);

            i++;
        }

    }



    private static void markCypher(int howManyMark, int number) {

        for(int i=0; i<howManyMark; i++) {

                  System.out.print("--");
        }

          if (number>-1) {

                  System.out.print(" " + number);
        }

            System.out.print("\n");
    }

    private static void mark(int numberMarks) {
        for(int i=0; i<numberMarks;i++) {

            System.out.print("--");

        }
        System.out.print( "\n");
    }

    private static void recursionInterval(int countMark, int howManyMarks) {
        if (countMark>0) {


            recursionInterval(countMark - 1, howManyMarks); mark(countMark);

            recursionInterval(countMark - 1, howManyMarks);
        }
    }

}
