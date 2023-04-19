package Aeroporto;

public class Avioes {
	private String  modelo;
	private int num_voo;
	
	public Avioes() {
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNum_voo() {
		return num_voo;
	}

	public void setNum_voo(int num_voo) {
		this.num_voo = num_voo;
	}
	
	boolean levantarVoo(boolean voo) {
		if(voo == true)
			return true;
		
		return false;
		
	}
	boolean descerVoo(boolean voo) {
		if(voo == true)
			return true;
		
		return false;
	}
	

}
