package org.abbtech.Task2;

public class Task2Lesson3 {
    public static void main(String[] args) {

        task3("aaaasdddd");

    }


    private static void task1() {
        int ind = 0;
        char[] alphabet = new char[20];
        for (char i = 65; i <= 84; i++) { //ASCII de A 65den bashlayir
            alphabet[ind] = i;
            ind++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + "-nin normal arraydeki indeksi " + i);
            System.out.println();
            System.out.println(alphabet[i] + "-nin elifbada sirasi " + (i + 1));
            System.out.println();
            int a = alphabet[i];
            System.out.println(alphabet[i] + " ASCIIdeki indeksi " + a);
            System.out.println();
        }
    }

    private static void task2(String word, String replace, String replaceBy) {
        System.out.println(word.replace(replace, replaceBy));
    }

    private static void task3(String strd) {//successes

        char [] chars = strd.toCharArray(); //[S,U,C,C,E,S,S,E,S]

        int[] ints= new int[strd.length()]; //[4,1,2,2,4,4,2,4]
        String [] strings = new String[strd.length()];
        int count=0;

       for (int i =0;i<chars.length;i++){
           char ch = chars[i];
          for (int j = 0;j<chars.length;j++){
              if (ch==chars[j]){
                  count++;

              }
          }

          ints[i]=count;
          strings[i]=String.valueOf(ch)+String.valueOf(count);
          count=0;


       }
    StringBuffer stringBuffer = new StringBuffer();
       for (int i =0; i<strings.length;i++){//[S4,U1,C2,C2,E2,S4,S4,E2,S4]
           stringBuffer.append(strings[i]);
       }
       String nonduplicateStrings= task4fortask3(String.valueOf(stringBuffer));

      char[] nonduplicateChars= nonduplicateStrings.toCharArray();
      int[] nt=new int[nonduplicateChars.length];
      for (int i =0; i<nonduplicateChars.length;i++){

          if (nonduplicateChars[i]<=57&& nonduplicateChars[i]>=48){
              nt[i]=Integer.valueOf(String.valueOf(nonduplicateChars[i]));//[4,1,2]
          }
      }
       int secondVal = task9fortask3(nt,"2nd");

      for (int i =0; i<strings.length;i++){
          if(strings[i].contains(String.valueOf(secondVal))){
              System.out.println(strings[i]);
              break;
          }
      }




    }


    private static String task4fortask3(String wordToRemoveDuplicates) {//w3resource

        String res="";

        for (int i = 0; i<wordToRemoveDuplicates.length();i++){
            String str = String.valueOf(wordToRemoveDuplicates.charAt(i));
            if (res.contains(str)){
                continue;
            }
            res+=str;
        }

        //System.out.println(res);
        return  res;

    }

    private static void task4(String wordToRemoveDuplicates) {//w3resource

        String res="";

       for (int i = 0; i<wordToRemoveDuplicates.length();i++){
           String str = String.valueOf(wordToRemoveDuplicates.charAt(i));
           if (res.contains(str)){
               continue;
           }
           res+=str;
       }

        System.out.println(res);


    }

    private static void task5 (String wordWillBeCut,int howManyParts){
        //aaaabbbbcccc
        String[] storage = new String[howManyParts];

        int parts = wordWillBeCut.length()/howManyParts;
        int ind =0;
        if (wordWillBeCut.length()%howManyParts!=0){
            System.out.println("beraber hisslere bolunmur ");
        }else{
            for (int i=0;i<wordWillBeCut.length();i=i+parts){

             storage[ind] =  wordWillBeCut.substring(i,i+parts);
                ind++;
            }
            for (String str:storage
            ) {
                System.out.println(str);
            }
        }



    }

    private static void task6 (String enterReverseWord){

        String[] strings=enterReverseWord.split(" ");//[Salam,baki,sheki,qebele]
        StringBuilder stringBuilder = new StringBuilder();                       //[qebele,sheki,baki,salam]
        String temp;

        for (int i =0;i<strings.length/2;i++){
            temp=strings[i];
            strings[i]=strings[strings.length-i-1];
            strings[strings.length-i-1]=temp;



        }

        for (int i =0;i< strings.length;i++){
            stringBuilder.append(strings[i]).append(" ");
        }
        System.out.println(stringBuilder);


    }

    private static void task7 (String digits){
        char[] ch=digits.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        int result=0;
        char temp=' ';
        for (int i =0;i<ch.length;i++){
            if (ch[i]>=49 && ch[i]<=58){//asciideki yerlerine gore

                result+=Integer.valueOf(String.valueOf(ch[i]));
            }
        }

        System.out.println(result);
    }

    private static void task8(String[] strArray,String order){
        int length = strArray.length;
        String temp;

    if (order =="descending"){
    for (int i =0;i<length;i++){
        //{"baki","kopenhagen","haciqabul","goygol","c"};
        for (int j =i;j<length;j++){
            if (strArray[i].length()<strArray[j].length()){
                temp = strArray[i];
                strArray[i]=strArray[j];
                strArray[j]=temp;
            }
        }
    }
        for (String i:strArray
        ) {
            System.out.println(i);
        }

    }else if(order=="ascending") {
    for (int i =0;i<length;i++){
        //{"baki","kopenhagen","haciqabul","goygol","c"};
        for (int j =i;j<length;j++){
            if (strArray[i].length()>strArray[j].length()){
                temp = strArray[i];
                strArray[i]=strArray[j];
                strArray[j]=temp;
            }
        }
    }
        for (String i:strArray
        ) {
            System.out.println(i);
        }
    }else System.out.println("pls write order correctly!@");



    }

    private static void task9(int[] intArray,String whichValue){

        int length=intArray.length;
        int temp;
        for (int i =0;i<length;i++){

            for (int j = i; j<length;j++){
                if (intArray[i]<intArray[j]){
                    temp=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }

        }
        if (whichValue=="max"){
            System.out.println(intArray[0]);
        }else if (whichValue=="min"){
            System.out.println(intArray[length-1]);
        }else System.out.println("please insert the value corretcly (\"max\" or \"min\")");
    }//ascending descendingdeki kimi 1inci index en boyuyudur axrinci en kichiyi

    private static void task10(int[] intArray,int specificValue){
        int length = intArray.length;
        int count=0;
        for (int i=0;i<length;i++){
            if (specificValue==intArray[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    private static int task9fortask3(int[] intArray,String whichValue){

        int length=intArray.length;
        int temp;
        for (int i =0;i<length;i++){

            for (int j = i; j<length;j++){
                if (intArray[i]<intArray[j]){
                    temp=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }

        }
        if (whichValue=="max"){
            //System.out.println(intArray[0]);
            return intArray[0];
        }else if (whichValue=="min"){
            //System.out.println(intArray[length-1]);
            return intArray[length-1];
        }else if(whichValue=="2nd")
            return intArray[1];
        else return 0;
    }

}
