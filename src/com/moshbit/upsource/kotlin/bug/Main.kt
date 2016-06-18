package com.moshbit.upsource.kotlin.bug

object Main {
  @JvmStatic fun main(args: Array<String>) {
    var helloWorld = "Hello_World"
    helloWorld = helloWorld.split("_").joinToString(separator = " ")
    println(helloWorld)
  }
}