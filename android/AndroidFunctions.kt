// Android source set
package com.example.kmm

import java.util.UUID

actual fun randomUUID() = UUID.randomUUID().toString()

