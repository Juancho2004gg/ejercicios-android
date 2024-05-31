/*
Imagine that you need to create a music-player app.

Create a class that can represent the structure of a song. The Song class must include these code elements:

Properties for the title, artist, year published, and play count
A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
A method that prints a song description in this format:
"[Title], performed by [artist], was released in [year published]."
* */

class Song(
    val songTitle:String?,
    val songArtist:String?,
    val yearPublished:Int?,
    val playCount:Int?
){
    val isPopular:Boolean = playCount != null && playCount > 1000
    fun describeSong(){
        println("$songTitle, perfomed by $songArtist, was released in $yearPublished")
    }
}

fun main(){
    var toxicity = Song("Toxicity", "System of a Down", 2001, 10000)
    toxicity.describeSong()
    print(toxicity.isPopular)
}