/*
In the initial code provided in the following code snippet,
write a program that prints the summary message based on the number of notifications that you received.
The message should include:

The exact number of notifications when there are less than 100 notifications.
99+ as the number of notifications when there are 100 notifications or more.

Your phone is blowing up! You have 99+ notifications.

*/

fun main() {
    val morningNotification = 57
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {

    if( numberOfMessages == 1 ) {
    println("You have one notification")
    }
    else if(numberOfMessages in 2..99){
        println("You have $numberOfMessages notifications.")
    }
    else if(numberOfMessages > 99) {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}