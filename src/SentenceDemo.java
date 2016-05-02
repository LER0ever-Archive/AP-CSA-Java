import java.util.ArrayList;
import java.util.List;

/**
 * Created by L.E.R on 5/2/16.
 * Manjaro Linux 15.12 Kernel 4.4.8
 * KDE Plasma Desktop 5.6
 * IntelliJ IDEA 15.0.3
 * Java SE 1.8
 * */

public class SentenceDemo {
    private String Sentence;
    public List<Integer> getBlankPositions(){
        List<Integer> PosList = new ArrayList<Integer>();
        for (int i=0;i<Sentence.length();i++){
            if (Sentence.substring(i,i+1).equals(" "))
                PosList.add(i);
        }
        return PosList;
    }

    public int countWords(){
        return getBlankPositions().size()+1;
    }
    // Elegant getWords
    public String[] getWords()
    {
        List<Integer> PosList = getBlankPositions();
        String s = Sentence; s+=" ";
        String[] Words = new String[countWords()];
        PosList.add(0,-1); PosList.add(Sentence.length()+1);
        for (int i=0;i<PosList.size()-1;i++){
            Words[i] = s.substring(PosList.get(i)+1,PosList.get(i+1));
        }
        return Words;
    }
    // Test Case
    public void testSentence(){
        System.out.println("Testing Sentence Demo");
        System.out.println("Sentence to \"A Quick Brown Fox Jumps over a lazy dog!!\"");
        Sentence = "A Quick Brown Fox Jumps over a lazy dog!!";
        String[] strlist = getWords();
        for (int i =0;i<strlist.length;i++) System.out.print(strlist[i] + " ");
        System.out.println();
    }

}
