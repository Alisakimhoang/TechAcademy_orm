package entity;

import java.util.Scanner;

import javax.persistence.EntityManager;

import util.DBUtil;

public class BookRunner {

    public static void main(String[] args) {
      
        EntityManager em = DBUtil.createEntityManager();
        
        
        int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input table and in id in format table:id : ");
        String input = sc.nextLine();
        String[] splitString = input.split(":");
        
        /**
         * input: books:10, splitString[books,10]  -> get book with id 10
         * input: chapter:5, splitString[chapter,5] -> get chapter with id 5
         */
        
        
        String table = splitString[0];
        int id = Integer.valueOf(splitString[1]);
        
        if (table.equals("books")) {
            Book book = em.find(Book.class, id);
            System.out.println(book.getTitle());
            System.out.println(book.getPrice());
            
        } else if (table.equals("chapter")) {
            Chapter chapter = em.find(Chapter.class,  id);
            System.out.println(chapter.getTitle());
            System.out.println(chapter.getChapterNum());
    }      
     
        // EntityManagerの利用を終了する
        em.close();
    }

    }
