package comensales;
import java.util.Random;
public class filosofo implements Runnable {

	int id;
	Thread t;
	tenedor derecho;
	tenedor izquierdo;
	int espera;
	Random r;
	tenedor mesa[];
	filosofo(int id,tenedor derecho, tenedor izquierdo,tenedor mesa[]){
	 this.id = id;
	 this.derecho = derecho;
	 this.izquierdo = izquierdo;
	 
	 this.mesa = mesa;
	 r = new Random();
	 t = new Thread(this);
	 t.start();

	}
	public void run(){
	 for(int i =0;i<1;i++){
	 synchronized(this.derecho){
	 synchronized(this.izquierdo){
	 comer();
	 }
	 }
	 pensar();
	 }
	 System.out.println("Filosofo "+id+" termino ");
	}
	void comer(){
	 System.out.println("\tFilosofo "+id+ " comienza a comer tomar tenedores "+ this.izquierdo.id+"y"+this.derecho.id);
	 derecho.tomar(id);
	 izquierdo.tomar(id);
	 espera = r.nextInt(5000);
	 System.out.println("\tFilosofo "+id+ " comiendo...");
	 try{
	 Thread.sleep(espera);
	 }catch(InterruptedException e){
	 }
	 derecho.soltar();
	 izquierdo.soltar();
	 System.out.println("\tFilosofo "+id+ " termino comenzara a pensar ");
	}
	void pensar(){
	 espera = (r.nextInt(5000));
	 try{
	 System.out.println("\tFilosofo " + id+ " piensa....");
	 Thread.sleep(espera);
	 }catch(InterruptedException e){
	 }
	}
}
