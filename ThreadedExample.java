import java.text.SimpleDateFormat;  
import java.util.Date;

class someThread extends Thread {

  int count;
  someThread(int num) {
    this.count = num;
  }

  public void run() {
    System.out.println("Inside Thread....");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date; 
    date = new Date();  
    System.out.println(formatter.format(date)+" Thread Count: "+count); 
    try {
      Thread.sleep(5000);
    } catch (Exception e) 
    {
      e.printStackTrace();
    }
    date = new Date();  
    System.out.println(formatter.format(date)+" Thread Count: "+count); 
  }
}

class ThreadedExample {
  public static void main(String[] args) {
    System.out.println("Inside Main Function...");
    someThread t1 = new someThread(1);
    someThread t2 = new someThread(2);
    t1.start();
    t2.start();
  }
}