package com.example.nail

import android.util.Log
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.channels.FileChannel
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Rect
import kotlinx.coroutines.*

class HandDetector(context: Context) {
    private val handDetectionModel = HandDetectionModel(context)
    private var isInitialized = false

    // Initialize the model asynchronously
    suspend fun initialize() {
        if (!isInitialized) {
            handDetectionModel.initializeModel()
            isInitialized = true
        }
    }

    // Predicts if the image contains a hand
    fun predict(image: Bitmap): Boolean {
        return try {
            if (!isInitialized) {
                Log.w("HandDetector", "Model not initialized")
                return false
            }
            val predictions = handDetectionModel.flow(image)
            predictions.isNotEmpty()
        } catch (e: Exception) {
            // Handle any errors that occur during prediction (e.g., model loading issues)
            e.printStackTrace()
            false
        }
    }

    // Returns the bounding boxes of detected hands in the image
    fun getBoundingBoxes(image: Bitmap): List<Rect> {
        return try {
            if (!isInitialized) {
                Log.w("HandDetector", "Model not initialized")
                return emptyList()
            }
            val predictions = handDetectionModel.flow(image)
            predictions.map { it.boundingBox }
        } catch (e: Exception) {
            // Handle any errors that occur during prediction
            e.printStackTrace()
            emptyList() // Return an empty list if there's an error
        }
    }

    // Resets the model, for example, clearing any cached data
    fun reset() {
        try {
            handDetectionModel.reset()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
