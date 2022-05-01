package exercicioexception;

public class ContatoNaoExisteNaAgendaException extends Exception {
    
    /**
	 * @author ariadne
	 */
	private static final long serialVersionUID = 1L;
	private String nomeContato;

    public ContatoNaoExisteNaAgendaException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda!";
    }
    
    
}
