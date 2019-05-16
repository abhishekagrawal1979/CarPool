package com.abhinet.V1

import com.google.gson.Gson
import khttp.get


fun DistanceCalculator () {

    val r = get("https://maps.googleapis.com/maps/api/distancematrix/json?origins=tw197sb&destinations=sw1e5nn&key=AIzaSyBD4QlJkseTIKoP81JRZib8Y_gQDasivRk")
    val gson =Gson()


    val googleDistance:GoogleDistance = gson.fromJson(gson.toJson(r), GoogleDistance::class.java)
//    println(googleDistance.destination_addresses)
//    println(r.text)


}