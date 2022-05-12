// iOS source set
package com.example.kmm

import platform.Foundation.NSUUID

actual fun randomUUID(): String = NSUUID().UUIDString()

