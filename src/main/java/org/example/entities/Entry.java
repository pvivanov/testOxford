package org.example.entities;

import java.util.List;

public record Entry(
        List<Pronunciation> pronunciations,
        List<Sense> senses
) {}
