package com.eticket.webclient.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FetchMoviePage {
    private List<FetchedMovie> data;
}
