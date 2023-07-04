fun main(){
    var artist = Artist("jayz","Canada","hiphop", instruments = listOf("guitar","piano",))
    println(artist.artistDetail())

    var perform = Performance("sautisol","Kenya","bongo", instruments = listOf("guitar","piano"),"2 hours")
    println(perform.scheduling())
    println(perform.playInstrument("guitar"))

    var stage = Stage("Bridget blue","Kenya","gospel", instruments = listOf("piano","harp","violin",),100,"Nakuru")
    println(stage.performance())
}

open class Artist(var name:String, var country:String, var musicType:String, var instruments:List<String>){
    fun artistDetail(){
        println("name:$name, country:$country, musicType:$musicType, instruments:${instruments.joinToString()}")

    }
}


class Performance(name: String, country: String, musicType: String, instruments: List<String>, var stageTime:String):Artist(name,country,musicType,instruments){
    fun scheduling(){
        println("name:$name, musicType:$musicType, time:$stageTime")
    }

    fun playInstrument(instrument:String){
        if (instruments.contains(instrument)){
            println("$name is playing $instrument")
        }
        else{
            println("$name is not playing $instrument")
        }
    }
}


class Stage(name: String, country: String, musicType: String, instruments: List<String>, var capacity:Int,var location:String):Artist(name,country,musicType,instruments){
    fun performance(){
        println("name:$name, country:$country, musictype:$musicType, capacity:$capacity, place:$location")
    }

}