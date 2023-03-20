package bai1_classicList;

public class MyListTest {
    // Tạo lớp MyListTest chứa phương thức main()
    public static void main(String[] args) {
//Tạo đối tượng listInteger chứa danh sách các số nguyên. Hiển thị các phần tử được thêm vào list
// theo vị trí và phần tử vượt quá số phần tử được thêm vào.
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));
        //Hiển thị phần tử ở vị trí -1

        System.out.println("element 6: " + listInteger.get(-1));


    }
}
