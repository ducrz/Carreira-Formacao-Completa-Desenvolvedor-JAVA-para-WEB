package unidade5;

public class ThreadApp {
public static void main(String[] args) {
//objeto tipo anônimo que implementa Runnable
Runnable r = new Runnable(){
public void run(){
for (int i = 0; i <= 1000; i++){
System.out.println(i);
}
}
};
new Thread(r).start();
}
}