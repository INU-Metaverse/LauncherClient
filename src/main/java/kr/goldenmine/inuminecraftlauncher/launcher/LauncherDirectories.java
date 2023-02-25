package kr.goldenmine.inuminecraftlauncher.launcher;

import java.io.File;

public interface LauncherDirectories {
    File getTemporaryDirectory();

    File getLauncherDirectory();

    File getLibrariesDirectory();

    File getAssetsDirectory();

    File getForgeDirectory();

    File getInstancesDirectory();

    File getJavaDirectory();
}
