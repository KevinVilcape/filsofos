package comensales;

public class tenedor {

	int id;
	boolean tomado;
	int quien;
	tenedor(int id){
	 this.id = id;
	 tomado = false;
	 quien = 10;
	}
	void tomar(int quien){
	 this.quien = quien;
	 tomado = true;
	}
	void soltar(){
	 quien = 10;
	 tomado = false;
	}

}
