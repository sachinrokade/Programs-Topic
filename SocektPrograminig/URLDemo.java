package SocektPrograminig;

import java.net.InetAddress;
import java.net.URL;  
public class URLDemo{  
public static void main(String[] args){  
try{  
URL url=new URL("https://github.com/sachinrokade");  

InetAddress ip=InetAddress.getByName("www.github.com"); 
System.out.println("Protocol: "+url.getProtocol());  
System.out.println("Host Name: "+url.getHost());  
System.out.println("Port Number: "+url.getPort());  
System.out.println("File Name: "+url.getFile());  


System.out.println("Inet Add Host Name: "+ip.getHostName());  
System.out.println("Inet Add IP Address: "+ip.getHostAddress()); 

/*
URLConnection urlcon=url.openConnection();  
InputStream stream=urlcon.getInputStream();  
int i;  
while((i=stream.read())!=-1){  
System.out.print((char)i);  
}  */ 
 
}catch(Exception e){System.out.println(e);}  
}  
}    