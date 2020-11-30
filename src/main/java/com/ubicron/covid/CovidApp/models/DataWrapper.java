package com.ubicron.covid.CovidApp.models;

import lombok.Data;

@Data
public class DataWrapper<T> {

    private T data;

}
