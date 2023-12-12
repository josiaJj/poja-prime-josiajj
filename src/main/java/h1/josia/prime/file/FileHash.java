package h1.josia.prime.file;

import h1.josia.prime.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
