public class Solution {
    public static int solution(String[] order) {
        int totalPrice = 0;
        int americanoPrice = 4500;
        int cafeLattePrice = 5000;

        for (String menu : order) {
            if (menu.equals("iceamericano") || menu.equals("americanoice") || menu.equals("hotamericano") || menu.equals("americanohot")) {
                totalPrice += americanoPrice;
            } else if (menu.equals("icecafelatte") || menu.equals("cafelatteice") || menu.equals("hotcafelatte") || menu.equals("cafelattehot")) {
                totalPrice += cafeLattePrice;
            } else if (menu.equals("americano")) {
                totalPrice += americanoPrice;
            } else if (menu.equals("cafelatte")) {
                totalPrice += cafeLattePrice;
            } else if (menu.equals("anything")) {
                totalPrice += americanoPrice;
            }
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        int result = solution(order);
        System.out.println(result);
    }
}
