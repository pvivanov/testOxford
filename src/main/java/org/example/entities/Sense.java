package org.example.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Sense(
        @SerializedName("id") String senseId,
        List<DatasetCrossLink> datasetCrossLinks,
        List<Example> examples,
        List<Translation> translations,
        List<Note> notes
) {}
