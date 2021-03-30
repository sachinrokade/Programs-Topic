import java.util.Date;

public class WebVisit {
	private final String url;
	private final WebVisit previousNode;
	private WebVisit nextNode;
	private final Date timestamp;

	/**
	  *  Constructor for a web visit. Initialize the three instance variables.
	  *  @param u The URL of this visit
	  *  @param pn The WebVisit previous to this one
     * @param nn
	  */
	public WebVisit(String u, WebVisit pn, WebVisit nn) {
		url = u;
		previousNode = pn;
		nextNode = nn;
		timestamp = new Date();
	}

	/**
	  * Return the previous WebVisit
	  * @return the previous WebVisit object
	  */
	public WebVisit getPreviousNode() {
		return previousNode;
	}

	public WebVisit getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(WebVisit next) {
		nextNode = next;
	}

	/**
	  * Return a neatly formatted String to represent this object so that it can be printed out for the user
	  */
	public String toString() {
		return "Web visit: "+url+" (at "+timestamp+")";
	}
}