package comensales;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filosofo comensales[];
		 comensales = new filosofo[5];
		 tenedor mesa[];
		 mesa = new tenedor[5];
		 int i,izq,der;
		 for(i=0;i<5;i++){
		 mesa[i] = new tenedor(i);
		 }
		 for(i= 0;i<5;i++){
		 izq = i-1;
		 if(izq<0) izq = 4;
		 der = i;
		 comensales[i] = new filosofo(i,mesa[izq],mesa[der],mesa);
		 }


	}

}
