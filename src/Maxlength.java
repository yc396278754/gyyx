import java.util.HashSet;  
import java.util.Set;  
  
public class Maxlength {  
  
    public static int maxLength(String str){  
        if(str==null||str.equals("")){  
            return 0;  
        }  
        Set<Character> set=new HashSet<Character>();  
        int maxLength=0;  
        int pre=0;  
        int after=0;  
        while(after<str.length()){  
            if(!set.contains(str.charAt(after))){  
                set.add(str.charAt(after));  
                after++;  
            }else{  
                set.clear();
                if((after-pre)>maxLength){  
                    maxLength=after-pre;  
                }  
                pre++;  
                after=pre;  
            }  
        }  
          
        if((after-pre)>maxLength){  
            maxLength=after-pre;  
        }  
        return maxLength;  
    }  
    public static void main(String[] args) { 
    	//初次测试
        String firststr="abcabcbb";
        long firststart=System.currentTimeMillis();
        int firstmaxlength=maxLength(firststr);
        long firstend=System.currentTimeMillis();
        System.out.println("第一次测试最大不重复子串为:"+firstmaxlength+",运算时间为:"+(firstend-firststart)+"毫秒");
        //二次测试
        String secstr="bbbbb";
        long secstart=System.currentTimeMillis();
        int secmaxlength=maxLength(secstr);
        long secend=System.currentTimeMillis();
        System.out.println("第二次测试最大不重复子串为:"+secmaxlength+",运算时间为:"+(secend-secstart)+"毫秒");
      //三次测试
        String thirdstr="begbewrtjh123123145235asfdasfgfgew";
        long thirdstart=System.currentTimeMillis();
        int thirdmaxlength=maxLength(thirdstr);
        long thirdend=System.currentTimeMillis();
        System.out.println("第三次测试最大不重复子串为:"+thirdmaxlength+",运算时间为:"+(thirdend-thirdstart)+"毫秒");  
      //四次测试
        String forstr="hjqowjeknadsfdsdgsdfhwdgwert";
        long forstart=System.currentTimeMillis();
        int formaxlength=maxLength(forstr);
        long forend=System.currentTimeMillis();
        System.out.println("第四次测试最大不重复子串为:"+formaxlength+",运算时间为:"+(forend-forstart)+"毫秒");  
      
  
    }  
}