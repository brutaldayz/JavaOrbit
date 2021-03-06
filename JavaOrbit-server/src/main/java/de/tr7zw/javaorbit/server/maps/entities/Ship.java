package de.tr7zw.javaorbit.server.maps.entities;

import de.tr7zw.javaorbit.server.enums.ShipType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Ship {

	@Getter @Setter private ShipType type = ShipType.PHOENIX;
	@Getter @Setter private int hp = 10000;
	@Getter @Setter private int maxHp = 10000;
	@Getter @Setter private int shield = 10000;
	@Getter @Setter private int maxShield = 10000;
	@Getter @Setter private int speed = 400;
	@Getter @Setter private float shieldStrength = 0.8f;
	@Getter @Setter private String droneFormationString = "3/2-25-25,3/4-25-25-25-25,3/2-25-25";
	
	public abstract int getDps();

}
