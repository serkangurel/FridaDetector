package com.sgmobile.frida_detector

object FridaDetector {
    private var isLibraryLoaded = false

    fun init() {
        if (!isLibraryLoaded) {
            try {
                System.loadLibrary("native-lib")
                isLibraryLoaded = true
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun isLibraryLoaded(): Boolean = isLibraryLoaded
}