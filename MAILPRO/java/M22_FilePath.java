package MAILPRO;

import java.util.Stack;

/**
 * 
 * 
"./"과 "../" 이 포함된 파일 경로를 "./"과 "../"이 없는 유닉스 파일 경로로 바꾸시오.
"./"는 현재의 위치를 뜻하고, "../"는 상위 디렉토리를 뜻합니다.
Given a file path containing "./" and "../", convert the path to a unix standard file path that does not contain "./" and "../".

input: "/usr/bin/../"
output: "/usr/"

input: "/usr/./bin/./test/../"
output: "/usr/bin/"
 */
public class M22_FilePath {

    public static void main(String[] args) {
        System.out.println(solution("/usr/bin/../"));
        System.out.println(solution("/usr/./bin/./test/../"));
    }

    public static String solution(String str) {
        String[] arr = str.split("/");
        Stack<String> stack = new Stack<>();
        StringBuffer ret = new StringBuffer();
        for (String string : arr) {
            if(string.equals("..")) {
                if(stack.size() > 1) stack.pop();
            } else if(string.equals(".") || string.equals("")) {
            } else {
                stack.push(string);
            }
        }
        ret.append("/");
        stack.forEach(r -> {
            ret.append(r + "/");
        });
        return ret.toString().trim();
    }
    
}