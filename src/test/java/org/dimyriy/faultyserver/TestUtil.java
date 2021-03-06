package org.dimyriy.faultyserver;

import org.dimyriy.faultyserver.filesystem.InMemoryFileSystem;

import javax.validation.constraints.NotNull;
import java.util.Objects;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TestUtil {
    static void putContent(@NotNull final InMemoryFileSystem fs, @NotNull String filename, @NotNull String content) {
        fs.put(filename, content.getBytes(UTF_8));
    }

    static String getContent(@NotNull final InMemoryFileSystem fs, @NotNull final String filename) {
        return new String(Objects.requireNonNull(fs.get(filename)));
    }
}
