enum class LootType {
    POTION, RING, ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): String {
        return """
            Item: $name
            Value: $value
        """
    }

}