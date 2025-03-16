package org.example.entities;

import java.util.List;

public record LexicalEntry(
        List<Entry> entries,
        String language,
        LexicalCategory lexicalCategory,
        String text
) {}
