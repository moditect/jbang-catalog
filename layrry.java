//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 14+
//REPOS jitpack
//JAVAC_OPTIONS --enable-preview --release 14
//JAVA_OPTIONS --enable-preview
//DEPS com.github.moditect.layrry:layrry-launcher:master-SNAPSHOT

import static java.lang.System.*;

public class layrry {

    public static void main(String... args) throws Exception {
        org.moditect.layrry.Layrry.main(args);
    }
}
