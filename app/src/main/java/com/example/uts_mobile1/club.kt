package com.example.uts_mobile1

class club {
}
package com.example.uts_kotlin

class club {
}
data class Club(
    val name: String,
    val premierLeagueTrophies: Int,
    val faCupTrophies: Int,
    val eflCupTrophies: Int,
    val championsLeagueTrophies: Int,
    val europaLeagueTrophies: Int
)

fun main() {
    val liverpool = Club("Liverpool", 19, 8, 9, 6, 3)
    val manchesterUnited = Club("Manchester United", 20, 12, 6, 3, 1)
    val chelsea = Club("Chelsea", 6, 6, 5, 2, 2)
    val manchesterCity = Club("Manchester City", 8, 8, 8, 0, 0)
    val arsenal = Club("Arsenal", 13, 14, 2, 0, 0)
}