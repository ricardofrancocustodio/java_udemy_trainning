package JavaUdemyTrainning.Composition.PostAndComment;

public class Post {

    private String moment;
    private String title;
    private String content;
    private Integer likes;


    public Post(){}

    public Post(String moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes= likes;

    }

    public String getMoment() {
        return moment;
    }


    @Override
    public String toString() {

        return title + '\n' +
                likes + " likes - " +
                moment + '\n' +
                content + '\n' ;
    }


}
