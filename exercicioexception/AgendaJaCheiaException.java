package exercicioexception;

public class AgendaJaCheiaException extends Exception {

	    /**
	 *  @author ariadne
	 */
	private static final long serialVersionUID = 1L;

		@Override
	    public String getMessage() {
	       return "Agenda já está cheia";
	    }
	 

}
