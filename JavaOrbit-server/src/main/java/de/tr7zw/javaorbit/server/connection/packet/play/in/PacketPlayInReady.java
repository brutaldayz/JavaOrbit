package de.tr7zw.javaorbit.server.connection.packet.play.in;

import de.tr7zw.javaorbit.server.connection.packet.PacketPlayIn;
import de.tr7zw.javaorbit.server.player.Player;

public class PacketPlayInReady extends PacketPlayIn{

	public PacketPlayInReady(String data) {
		super(data);
	}

	@Override
	public void onRecieve(Player player) {
		
	}

}
