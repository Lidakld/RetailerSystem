package r.gui;

import java.util.EventListener;

public interface RequestListener extends EventListener {
	public void RequestEventOccured(RequestEvent rq);
}
