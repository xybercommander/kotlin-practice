class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()


    fun show() {
        if(lives > 0) {
            println("$name is alive")
        }else{
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            level: $level
            lives: $lives
            score: $score
            weapon: ${weapon}

        """
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
        // code to save inventory goes here
    }

    fun dropLoot(item: Loot) : Boolean {
        if(inventory.contains(item)){
            inventory.remove(item)
            return true
        }else{
            return false
        }
    }

    fun dropLoot(name: String) : Boolean {
        println("$name will be dropped")
        return inventory.removeIf {it.name == name}
    }

    fun showInventory () {
        println("${name}'s Inventory: ")
        println()
        for(item in inventory){
            println(item)
            println()
        }
        println("=========================")
    }

}