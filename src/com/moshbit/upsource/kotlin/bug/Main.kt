package com.moshbit.upsource.kotlin.bug

object Main {
  @JvmStatic fun main(args: Array<String>) {
    var helloWorld = "Hello_World"
    helloWorld = helloWorld.split("_").joinToString(separator = "#") // "Hello#World"

    val helloWorldWithSpaces = helloWorld.prependIndent(" ".repeat(30)) // "     Hello#World"
    println(helloWorldWithSpaces.replace("#", " ").trim()) // "Hello World"

    @Suppress("DEPRECATION")
    deprecatedFunction() // "Hello world from a deprecated function"
  }

  @Suppress("DeprecatedCallableAddReplaceWith")
  @Deprecated("This function is deprecated")
  fun deprecatedFunction() {
    println("Hello world from a deprecated function")
  }
}