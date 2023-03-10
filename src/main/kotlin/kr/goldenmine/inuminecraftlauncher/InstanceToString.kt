package kr.goldenmine.inuminecraftlauncher

import com.google.gson.GsonBuilder
import kr.goldenmine.inuminecraftlauncher.util.OS_NAME_MAC
import kr.goldenmine.inuminecraftlauncher.util.OS_NAME_WINDOWS
import java.io.File

fun main() {
    val instanceSettings = InstanceSettings(
        "1.16.5",
        "1.16",
        "36.2.34",
        8,
        mapOf(
            Pair(OS_NAME_MAC, "jdk1.8.0_351.jdk"),
            Pair(OS_NAME_WINDOWS, "jdk8u351")
        ),
        1024,
        4096,
        "inu1165",
        "minecraft.goldenmine.kr",
        20000,
        listOf(
            "chiselsandbits-1.0.43.jar",
            "immersive-portals-0.17-mc1.16.5-forge.jar",
            "inumodelloader-1.3.4-SNAPSHOT.jar",
            "test.jar",
            "OptiFine_1.16.5_HD_U_G7.jar",
            "thutcore-1.16.4-8.2.0.jar",
            "thuttech-1.16.4-9.1.2.jar",
            "worldedit-mod-7.2.5-dist.jar"
        ),
        "BSL+Standard+v6.1.1",
        "1.0.0.3"
    )

    val gson = GsonBuilder().setPrettyPrinting().create()
    val file = File("references/${instanceSettings.instanceName}.json")
    file.bufferedWriter().use {
        gson.toJson(instanceSettings, it)
    }
}