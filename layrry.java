//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 15+
//REPOS jitpack
//JAVAC_OPTIONS --enable-preview --release 15
//JAVA_OPTIONS --enable-preview
//DEPS com.github.moditect.layrry:layrry-launcher:master-SNAPSHOT:all

import static java.lang.System.*;

public class layrry {
    public static void main(String... args) throws Exception {
        org.moditect.layrry.launcher.LayrryLauncher.main(args);
    }
}
