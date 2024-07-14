package PracticeJava;

import java.util.Date;

public class DateTimeAPp {

	public static void main(String[] args) {
		Date dd=new Date();
		System.out.println(dd.toLocaleString());
		String d=dd.toString();
		System.out.println(d);
		String []sd=d.toString().split(" ");
		String []st=sd[3].toString().split(":");
        System.out.println(st[0]+"\t"+st[1]+"\t"+st[2]);
        
        String sttime="2:13PM";
        String uss[]=sttime.split(":");
        System.out.println(uss[0]+"\t"+uss[1]);
        String ms[]=uss[1].split("[AP]");
        System.out.println(ms[0]+"\t"+ms[1]);
        if((Integer.parseInt(uss[0])>Integer.parseInt(st[0]))) {
        	System.out.println("yes");
        }
        else if((Integer.parseInt(uss[0])==Integer.parseInt(st[0]))&&(Integer.parseInt(ms[0])>=Integer.parseInt(st[1])))
        	{
        		System.out.println("yes");
        }else {
        	System.out.println("no");
        }
        
	}

}
