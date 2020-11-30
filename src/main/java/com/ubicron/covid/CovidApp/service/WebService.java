package com.ubicron.covid.CovidApp.service;

import com.ubicron.covid.CovidApp.models.Country;
import com.ubicron.covid.CovidApp.models.DataWrapper;
import com.ubicron.covid.CovidApp.models.Timeline;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.SortedSet;

@FeignClient(name = "coronaapi", url = "${coronaapi.url}")
public interface WebService {

    @RequestMapping(value = "/countries")
    DataWrapper<SortedSet<Country>> countries();

    @RequestMapping(value = "/countries/{code}")
    DataWrapper<Country> countries(@PathVariable String code);

    @RequestMapping(value = "timeline")
    DataWrapper<List<Timeline>> timeline();

}
