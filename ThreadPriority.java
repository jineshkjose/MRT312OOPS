class Multi extends Thread{  
    public void run(){  
    System.out.println("thread is running...");  
    System.out.println(t1.getPriority());  

    }  
    public static void main(String args[]){  
    Multi t1=new Multi();  
    t1.start();  
     }  
    } 