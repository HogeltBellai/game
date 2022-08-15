package ru.hogeltbellai.game;

import org.bukkit.plugin.java.JavaPlugin;

import ru.hogeltbellai.utils.database.MySQL;

public class GameMain extends JavaPlugin {
	
	public void onEnable() {
		MySQL mysql = new MySQL();
		mysql.createTables("users", "id int PRIMARY KEY AUTO_INCREMENT, UUID varchar(36), name VARCHAR(16), exp int, level int, coins int, chests int");	}
	
	public void onDisable() {
		
	}
}
