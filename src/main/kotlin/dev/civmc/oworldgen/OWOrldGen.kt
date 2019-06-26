package dev.civmc.oworldgen

import org.bukkit.plugin.java.JavaPlugin

class OWOrldGen: JavaPlugin() {
	companion object {
		private var instanceStorage: OWOrldGen? = null

		internal val instance: OWOrldGen
			get() = instanceStorage!!
	}
	
	override fun onEnable() {
		instanceStorage = this
	}
}
