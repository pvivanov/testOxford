package org.example.entities;

import java.util.List;

public record Example(
        String text,
        List<Translation> translations
) {}
