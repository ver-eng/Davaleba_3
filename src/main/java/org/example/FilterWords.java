package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterWords {
    public static void main(String[] args) {

        List<String> words=new ArrayList<>();

        words.add("1ფკსჯდნ");
        words.add("1ოკსჯდნ");
        words.add("  კსჯდნ");
        words.add("ასდფს");
        words.add("ოკსნჯფდს");
        words.add("ტსკდფჯნს");
        words.add("ჰჰ");
        words.add(".გეჯრნეკდ");
        words.add(".ეჯრნეკდ");
        words.add("რექწდსდს");

        for(String word:words){
            if(Character.isLetter(word.charAt(0)) &
                    !(word.startsWith("ა")||
                            word.startsWith("ე")||
                            word.startsWith("ი")||
                            word.startsWith("ო")||
                            word.startsWith("უ"))) {
                System.out.println(word);
            }


//        for(int i=0;i<words.size();i++){
//
//            if(Character.isLetter(words.get(i).charAt(0)) &
//                    !(words.get(i).startsWith("ა")||
//                    words.get(i).startsWith("ე")||
//                    words.get(i).startsWith("ი")||
//                    words.get(i).startsWith("ო")||
//                    words.get(i).startsWith("უ"))){
//                System.out.println(words.get(i));
//            }
//
//        }


        };

    }

}
