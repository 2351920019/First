import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lianjie3 {
    public static void main(String[] args) throws Exception {
    	String dir1 = "C:\\Users\\admin\\Desktop\\input1.txt";
    	String dir2 = "C:\\Users\\admin\\Desktop\\input2.txt";
    	File file1 = new File(dir1);
    	File file2 = new File(dir2);
    	BufferedReader br = new BufferedReader(new FileReader(file1));
    	BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
    	String line;
    	while ((line=br.readLine())!=null) {
    		for(int i=0;i<line.length();i++)
    	   if(line.charAt(i)!=','||line.charAt(i)!='.'||line.charAt(i)!='£»'||line.charAt(i)!=';'||line.charAt(i)!='¡±'||line.charAt(i)!='¡°'||line.charAt(i)!='¡®'||line.charAt(i)!='¡¯'||line.charAt(i)!='-'||line.charAt(i)!='?'||line.charAt(i)!='!'||line.charAt(i)!='	'||line.charAt(i)!='¡¯'||line.charAt(i)!='£¬'||line.charAt(i)!='¡£') {
    		writer.write(line.charAt(i));
    		}
    	}
    
    	lianjie me=new lianjie();
    	me.sss();
    	writer.flush();
    	writer.close();
    	br.close();
    }
    
    
}
