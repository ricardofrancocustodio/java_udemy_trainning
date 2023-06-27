package JavaUdemyTrainning.Composition.PostAndComment;

import java.util.Scanner;

public class PostAndCommentsRun {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digit the title of Post: ");
        String title = scanner.nextLine();

        System.out.print("Digit the post date: ");
        String date =  scanner.nextLine();

        System.out.print("Digit the content of the Post: ");
        String content = scanner.nextLine();

        System.out.print("Digit the like qty: ");
        Integer likeQty = scanner.nextInt();

        Comment comment = new Comment();

        Post post = new Post(date, title, content, likeQty);
        comment.getCommentsPost(post);

        System.out.println("-------------");
        System.out.println(post);
        System.out.println("Comments:");
        for (String el: comment.getCommentsPost(post)){
            System.out.println(el);
        }

        System.out.println("-----------------");

        scanner.close();

    }

}
