package collection.array;

public class MyArrayListV3BadMain {
    // 안좋은 예 : List를 Object로 받기 떄문에 아무 데이터나 입력 가능
    // 추가로 Object를 반환하기 떄문에 다운캐스팅을 해야하며 타입 안정성이 떨어지는 단점이 있음
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력하기를 기대
        // 그러나 Object를 매개변수로 받기 때문에, 모든 타입을 저장 가능함
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); // 문자를 입력할 경우
        System.out.println("numberList = " + numberList);

        //Object를 반환하므로 다운캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // ClassCastException 발생, 문자를 Integer로 개스팅
        Integer num3 = (Integer) numberList.get(2);

    }
}
