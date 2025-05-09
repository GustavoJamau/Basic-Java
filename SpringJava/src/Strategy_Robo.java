public class Strategy_Robo {
	
	private Strategy_Comportamento comportamento;

	public void setComportamento(Strategy_Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}