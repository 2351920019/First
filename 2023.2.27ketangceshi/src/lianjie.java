import java.io.*;
import java.util.*;
 
 
 
 
public class lianjie {
 
    public  void sss()throws FileNotFoundException, IOException  {
        // TODO �Զ����ɵķ������
 
        File file=new File("C:\\Users\\admin\\Desktop\\input1.txt");
        File file2=new File("C:\\Users\\admin\\Desktop\\output4018.txt");
 
         
        if(!file.exists())
        {
            System.out.println("�ļ������ڣ�");
        }
        else if(file.exists() && file.length() == 0) { 
            System.out.println("�ļ�Ϊ�գ�"); 
        } //�ж��Ƿ��ļ�Ϊ��
        else
        {
            BufferedReader br=new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\output4018.txt")) ;
             
 
            String s;
            int i,j;
            ArrayList<ArrayList<String>> listall=new ArrayList();
            String key;
            s=br.readLine();
            //���ı��ļ��е�������Ϣ��Ϊ�ַ���
            String []s1=s.split(" ");//�Կո�Ϊ�ָ��ÿ������
            if(s1.length==1)
                System.out.println("������Ϊ1");
            else
            {
                     

            
           for(j=0;j<s1.length;j++)
           {
               ArrayList<String> list=new ArrayList<String>();
               key=s1[j].substring(s1[j].length()-1);
               list.add(s1[j]);
              
               for(i=1;i<s1.length;i++)
                {
                   
               if(key.equals(s1[i].substring(0, 1)))
               {
                   list.add(s1[i]);
                   key=s1[i].substring(s1[i].length()-1);
               }
               else
                   continue;
                }
               listall.add(list);
           }
           int max=0;
           int count=0;
            
           for(i=0;i<listall.size();i++)
           {
               if(max<listall.get(i).size())
               {
                   max=listall.get(i).size();
                   count=i;
               }
           }
         
           for(i=0;i<listall.get(count).size();i++)
           {
               System.out.print(listall.get(count).get(i)+"  ");
               bw.write(listall.get(count).get(i));
               bw.write(" ");
           }
           System.out.println();
           System.out.println("����"+i);
            br.close();
            bw.close();
            }
        }
        }
         
    }