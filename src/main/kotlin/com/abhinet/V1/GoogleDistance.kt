package com.abhinet.V1

data class GoogleDistance(val destination_addresses:String,
                          val origin_addresses:String,
                          val rows: Rows,
                          val status: String
                     ) {

}