package com.ubicron.covid.CovidApp.models;

import lombok.Data;

@Data
public class LatestData {

    private Long deaths;
    private Long confirmed;
    private Long recovered;

}