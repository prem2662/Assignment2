package Assignment1;

import java.nio.channels.Channel;

public interface Subject {

	void subscriber(Channel ch);

     void sendUpdate();

	void updates(String name);

}