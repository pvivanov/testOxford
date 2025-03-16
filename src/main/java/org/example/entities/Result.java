package org.example.entities;

import java.util.List;

public record Result(
        String id,
        String language,
        List<LexicalEntry> lexicalEntries,
        String type,
        String word
) {}
