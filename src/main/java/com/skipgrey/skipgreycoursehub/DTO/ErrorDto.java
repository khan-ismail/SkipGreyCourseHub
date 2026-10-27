package com.skipgrey.skipgreycoursehub.DTO;

import java.time.Instant;

public record ErrorDto(
        int statusCode,
        String message,
        String path,
        Instant timestamp
) {
}
