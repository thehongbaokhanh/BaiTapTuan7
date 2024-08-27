package PartternAndMatcher;

import java.util.regex.Pattern;

public class Matches {
//    matches(): Kiểm tra toàn bộ chuỗi có khớp với mẫu Regex hay không.
//    Phương thức này trả về true nếu chuỗi khớp hoàn toàn với mẫu, ngược lại trả về false.

    public static void main(String[] args) {
        // Kiểm tra chuỗi "aaaab" có khớp với mẫu "a*b" không
        boolean result = Pattern.matches("a*b", "aaaab");
        System.out.println("Chuỗi có khớp với mẫu: " + result);
    }
}