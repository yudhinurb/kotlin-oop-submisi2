fun main() {
    var truk = LandTransport(400.0F, 25.0F,"Small", "Road", "Truck")
    truk.load()
    truk.ship()
    truk.unload()
    println(truk.toString())

    var lion = AirTransport(2500.0F, 400.0F,"Large", "Boeing 737", "Lion")
    lion.load()
    lion.ship()
    lion.unload()
    println(lion.toString())

    var truckTransportation = Transportation(truk)
    truckTransportation.printTransport()

    var lionTransportation = Transportation(lion)
    lionTransportation.printTransport()

}