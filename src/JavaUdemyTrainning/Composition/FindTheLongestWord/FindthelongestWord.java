package JavaUdemyTrainning.Composition.FindTheLongestWord;

public class FindthelongestWord {

    private String _phrase;

    public String findTheLongestWord(String phrase){
        this._phrase = phrase;

        String[] word =  _phrase.split(" ", -2);
        int maxValue = word[0].length();
        int position= 0;

        for(int i=0; i<word.length; i++){
            if(word[i].length() > maxValue){
                maxValue = word[i].length();
                position = i;
            }
        }

            return word[position];
    }

}
