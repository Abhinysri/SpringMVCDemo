package com.springmvc.services;

import com.springmvc.entity.Custom;

import java.util.List;

public interface CustomService {

    public Custom addNew(Custom custom);

    public List<Custom> getAllCustomes();

}
