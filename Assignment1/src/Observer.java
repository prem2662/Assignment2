package Assignment1;

import java.nio.channels.Channel;

public interface Observer {

	void sendUpdates();

	void subscriber(Channel ch);

}

