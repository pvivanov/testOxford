package org.example.entities;

import java.util.List;

public record Pronunciation(
        String audioFile,
        List<String> dialects,
        String phoneticNotation,
        String phoneticSpelling
) {}
