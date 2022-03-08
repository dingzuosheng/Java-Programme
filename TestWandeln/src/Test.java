import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test {

	public static String text2String(File file) {
		StringBuilder result = new StringBuilder();
        try{
        	//构造一个BufferedReader类来读取文件
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
          //使用readLine方法，一次读一行
            while((s = br.readLine())!=null){
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
	}
	public static void splitValue(String message) {
		String[] s1 = message.split(",");//去掉 ，分成两部分
		String[] part1 = s1[0].split(":");//去掉： 分成两部分，此为第一部分
		String id = part1[1];
		System.out.println("----------------");
		System.out.println("Id: "+id);		
		String[] part2 = s1[1].split(":");//去掉：分成两部分，此为第二部分
		String[] part3 = part2[1].split("}");//		
		String payload = part3[0];		
		System.out.println("Payload: "+payload);
		System.out.println("----------------");
		
	}
	public static String byte2String(byte[] strbyte) {
		String res = new String(strbyte);
		return res;
	}
	public static byte[] string2byte(String str) {
		byte[] strbyte = str.getBytes();
		return strbyte;
	}
	public static void main(String[] args) {
		File file1 = new File("F:/Users/pub.txt");
		File file2 = new File("F:/Users/pub.json");
		
       // System.out.println(text2String(file1));
       // System.out.println(text2String(file2));
        
      //  splitValue(text2String(file1));
		String s1 = "Hello";
		byte[] b1 = string2byte(s1);
		String s2 = byte2String(b1);
		System.out.println(s2);
	}

}
