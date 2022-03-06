class AirTransport(override var weight: Float, override var speed: Float, override var capacity: String, var aircraft_type: String, var airline_name: String): Transport {
    override fun ship() {
        println("Shipping is done via $aircraft_type by $airline_name")
    }
    override fun toString(): String {
        return "\n====== Air Transport ======\n" +
                "Weight\t: $weight\n" +
                "Speed\t: $speed\n" +
                "Capacity: $capacity\n" +
                "Type\t: $aircraft_type\n" +
                "Name\t: $airline_name\n"
    }
}