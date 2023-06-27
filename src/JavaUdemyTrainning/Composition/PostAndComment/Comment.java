package JavaUdemyTrainning.Composition.PostAndComment;

import java.util.ArrayList;
import java.util.List;

public class Comment {

   public Comment(){}

   public List<String> getCommentsPost(Post post){
      List<String> commentList =  new ArrayList<>();

      if (post.getMoment().equals("21/06/2018 13:05:44")){
         commentList.add("Have a nice trip");
         commentList.add("Wow, that's awesome!");

      }else{
         commentList.add("Good night");
         commentList.add("May the Force be with you");

      }

      return commentList;
   }


}
