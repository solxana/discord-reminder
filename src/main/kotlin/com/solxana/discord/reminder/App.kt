/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.solxana.discord.reminder

import com.solxana.discord.reminder.bot.ReminderBOT
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

val logger: Logger = LogManager.getLogger()

fun main() {
    try {
        ReminderBOT()
    }
    catch (throwable: Throwable) {
        logger.error("Throwing", throwable)
    }
}
