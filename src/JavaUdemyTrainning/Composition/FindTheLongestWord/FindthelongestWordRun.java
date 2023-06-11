package JavaUdemyTrainning.Composition.FindTheLongestWord;

public class FindthelongestWordRun {

    public static void main(String[] args) {
        FindthelongestWord findthelongestWord = new FindthelongestWord();
        String str = "this is a sample sentence with some paralelepipedo anticonstitucionalissimamente";
        String result = findthelongestWord.findTheLongestWord(str);

        System.out.println("-----------------");
        System.out.println("Given a phrase: '"+ str +"'");
        System.out.println("The longest word is '"+ result + "'");

    }
}
