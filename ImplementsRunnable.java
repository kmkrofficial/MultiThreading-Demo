import java.text.SimpleDateFormat;  
import java.util.Date;

class someThread2 implements Runnable {
  public void run() {
    System.out.println("Inside Thread....");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date; 
    date = new Date();  
    System.out.println(formatter.format(date)); 
    try {
      Thread.sleep(5000);
    } catch (Exception e) 
    {
      e.printStackTrace();
    }
    date = new Date();  
    System.out.println(formatter.format(date)); 
  }
}

class ImplementsRunnable {
  public static void main(String[] args) {
    System.out.println("Inside Main Function...");
    Thread t1 = new Thread(new someThread2());
    Thread t2 = new Thread(new someThread2());
    t1.start();
    t2.start();
  }
}