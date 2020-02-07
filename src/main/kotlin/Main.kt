fun main(args: Array<String>) {
//    val p1 = Player("Xyber", 8, 4)
//    val p2 = Player("Xtrm", 5, 2, 1000)
//
//    var axe = Weapon("Axe", 10)
//    var sword = Weapon("Sword", 12)
//    var spear = Weapon("Spear", 15)
//
//    p1.weapon = axe
//    p2.weapon = sword
//
//    p1.weapon = p2.weapon
//    p2.weapon = spear
//
//    p1.show()
//    println()
//    p2.show()
//    println()
//
//    println(p1)
//    println()
//    println(p2)
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    p1.getLoot(redPotion)
//
//    val chestArmour = Loot("+3 Chest Armour", LootType.ARMOR, 50.0)
//    p1.getLoot(chestArmour)
//
//    p1.getLoot(Loot("+2 Ring of Protection", LootType.RING, 60.0))
////    p1.inventory.add(Loot("+2 Ring of Protection", LootType.RING, 60.0))
//
//    p1.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
////    p1.inventory.add(Loot("Invisibility Potion", LootType.POTION, 35.95))
//
//    p1.dropLoot("Red Potion")
//
//    p1.showInventory()

    var num: Int = 0

    fun show() {
        println(num)
    }


    var flag: Boolean = true
    while(flag){
        show()

        var input: String = readLine()!!
        when {
            input == "+" -> num++
            input == "-" -> num--
            (input == "r" || input == "R") -> num = 0
            else -> flag = false
        }
    }
}