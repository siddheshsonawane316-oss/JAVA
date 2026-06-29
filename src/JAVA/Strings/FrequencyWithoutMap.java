package JAVA.Strings;
//Find frequency of each character without using map
public class FrequencyWithoutMap {
    static void main() {
        String str="wefgwadggd";
        // Array to store frequency of ASCII characters
        int freq[]=new int[128];

        // Count the frequency of each character
        for(int i=0;i<str.length();i++){
            freq[(int) str.charAt(i)]+=1;
        }

        // Traverse the frequency array
        for(int i=0;i<freq.length;i++){

            // Print only those characters whose frequency is greater than 0
            if(freq[i]>0) {
              System.out.println( "Character:"+(char) i+" Frequency:"+freq[i]);
          }
        }
    }

}
