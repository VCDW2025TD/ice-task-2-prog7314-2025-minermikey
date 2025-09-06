package com.example.memestream.DataaClasses

// this data class will be used when the
// JSON meme are sent through from the api,
// this class will be able to process it

data class GiffyRepose( val data: List<MemeData> )

data class MemeData( val images: MemeImages )

data class  MemeImages ( val fixed_height : MemeImages )

data class MemeImage ( val url: String )