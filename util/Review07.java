package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;

import entity.Person;


public class Review07 {

    public static void main(String[] args) {
        
//idはキーボード入力
        System.out.print("検索キーワードを入力してください: ");
        String input = keyIn();
        int id = Integer.parseInt(input);
        
        // EntityManagerのオブジェクトを生成
        EntityManager em = DBUtil.createEntityManager();
        
     // 1件取得して名前を表示する
        Person person = em.find(Person.class, id); 
        
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // EntityManagerの利用を終了する
        em.close();
    }
    
    /*
     * キーボードから入力された値をStringで返す
     *         引数：なし
     *         戻り値
     */
    private static String keyIn() {
        String line = null;
        try {
            BufferedReader key = new BufferedReader(new InputStreamReader(
                    System.in));
            line = key.readLine();
        } catch (IOException e) {

        }
        return line;
    }

}
