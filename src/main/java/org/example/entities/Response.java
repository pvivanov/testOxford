package org.example.entities;

import java.util.List;

public record Response(
        String id,
        Metadata metadata,
        List<Result> results,
        String word
) {}

