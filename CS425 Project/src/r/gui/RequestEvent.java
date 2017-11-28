package r.gui;

import java.awt.event.ActionListener;
import java.util.EventObject;

public class RequestEvent extends EventObject {
	int type;
	
	public RequestEvent(ActionListener source, int type) {
		super(source);
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}	
}
