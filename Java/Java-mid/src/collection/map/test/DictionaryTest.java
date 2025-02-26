package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        while (true) {
            System.out.println("==단어 입력 단계==");

            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String inputKey = scanner.nextLine();
            if(inputKey.equals("q")) break;

            System.out.print("한글 뜻을 입력하세요: ");
            String inputValue = scanner.nextLine();

            dictionary.put(inputKey,inputValue);
        }

        while (true) {
            System.out.println("==단어 검색 단계==");
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");

            String inputKey = scanner.nextLine();
            if(inputKey.equals("q")) break;

            if(dictionary.containsKey(inputKey)){
                System.out.println(inputKey + "의 뜻: " + dictionary.get(inputKey));
            } else {
                System.out.println(inputKey + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
