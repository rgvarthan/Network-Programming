import java.net.*;
import java.io.*;
class Client
{
  public static void main(String args[])throws Exception
  {
    Socket s1=new Socket ("localhost",2000);
    System.out.println("Connection Established");
    DataInputStream cmd=new DataInputStream(System.in);
    DataInputStream dis=new DataInputStream(s1.getInputStream());
    DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
    System.out.println("Enter message:");
    while(true)
    {
      String msg=cmd.readLine();
      if(msg.equals("exit"))
        break;
      else
      {
        dos.writeBytes(msg+"\n");
        String echo=dis.readLine();
        System.out.println(echo);
      }
    }
  }
}
