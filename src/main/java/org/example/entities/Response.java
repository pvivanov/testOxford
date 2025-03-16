package org.example.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Response(
        String id,
        Metadata metadata,
        List<Result> results,
        String word
) {}

