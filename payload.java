import java.io.*;

class Main {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
      try
      {
         runtime.exec("shutdown -s -t 5");
      }
      catch(IOException e)
      {
         System.out.println("Exception: " +e);
      }
  }
}