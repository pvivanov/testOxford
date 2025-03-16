package org.example.entities;

import java.util.List;

public record Translation(
        String language,
        String text,
        List<Note> notes
) {}
