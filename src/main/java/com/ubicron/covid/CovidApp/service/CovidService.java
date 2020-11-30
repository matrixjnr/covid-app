package com.ubicron.covid.CovidApp.service;

import com.ubicron.covid.CovidApp.utils.CountryUtil;

import java.util.List;

public interface CovidService {

    List<CountryUtil> findAll();

    CountryUtil getById(String id);

}