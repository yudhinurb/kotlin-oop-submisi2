class LandTransport(override var weight: Float, override var speed: Float, override var capacity: String, var transportation_mode: String, var vehicle_type: String): Transport {
    override fun ship() {
        println("Shipping is done via $transportation_mode by $vehicle_type")
    }
    override fun toString(): String {
        return "\n====== Land Transport ======\n" +
                "Weight\t: $weight\n" +
                "Speed\t: $speed\n" +
                "Capacity: $capacity\n" +
                "Mode\t: $transportation_mode\n" +
                "Type\t: $vehicle_type\n"
    }
}