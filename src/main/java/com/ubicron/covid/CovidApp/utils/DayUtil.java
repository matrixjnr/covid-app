package com.ubicron.covid.CovidApp.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DayUtil {

    private LocalDate date;

    private Long cases;

    private Long deaths;

    private Long recovered;

    private Long newCases;

    private Long newDeaths;

    private Long newRecovered;

}