package com.eticket.webclient.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FetchedMovie {
    String id;
    String original_title;
    String original_language;
    String overview;
    String poster_path;
    Boolean adult;

}
