package it.feio.android.omninotes.async.bus;

import android.util.Log;
import it.feio.android.omninotes.utils.Constants;


/**
 * Created by fede on 18/04/15.
 */
public class NavigationUpdatedEvent {

	public final Object navigationItem;


	public NavigationUpdatedEvent(Object navigationItem) {
		Log.d(Constants.TAG, this.getClass().getName());
		this.navigationItem = navigationItem;
	}
}
