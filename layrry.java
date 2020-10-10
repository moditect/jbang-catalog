//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 14+
//REPOS jitpack
//JAVAC_OPTIONS --enable-preview --release 15
//JAVA_OPTIONS --enable-preview
//DEPS com.github.moditect.layrry:layrry-launcher:-41888424b9-1

import static java.lang.System.*;

public class layrry {

    public static void main(String... args) throws Exception {
        org.moditect.layrry.launcher.LayrryLauncher.main(args);
    }
}
