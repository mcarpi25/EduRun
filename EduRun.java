import java.util.Scanner;
public class EduRun {
    public static void main(String [] args){

        wordSpell();
        

    }

    public static void wordSpell(){
        Scanner myObj = new Scanner(System.in);
        String word;

        System.out.println("Enter word");
        word=myObj.nextLine();

        System.out.println("Word is: " + word);
        
        int wordCount=word.length();

        String[] spelling= new String[wordCount];


        for(int k=0; k<wordCount; k++){
            spelling[k] = String.valueOf(word.charAt(k));
        }

        String fullWord="";
        int i=0;
        
        while(i<wordCount){
            
            String spellWordLetter = spellWord();
            if(i<wordCount-1 && spellWordLetter.charAt(0)==spelling[i].charAt(0)){
                fullWord= fullWord + spelling[i];
                System.out.println("Correct!, \"" + fullWord + "\": What's the next letter?");
                i++;
            }else if(spellWordLetter.charAt(0)==spelling[i].charAt(0)){
                fullWord +=spelling[i];
                System.out.println("Amazing! You finished spelling: " + fullWord);
                i++;
            
            }else{
                System.out.println("Try again!");
            }
        }


    }

    public static String spellWord(){
        Scanner myOj = new Scanner(System.in);
        String letter;

        System.out.println("Enter letter");

        letter=myOj.nextLine();

        return letter;

        


    }
}