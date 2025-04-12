package com.springmvc.services;

import com.springmvc.entity.Custom;
import com.springmvc.repository.CustomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomServiceImpl implements CustomService {
    @Autowired
    private CustomRepository repo;

    @Override
    public Custom addNew(Custom custom) {
        return repo.save(custom);
    }

    @Override
    public List<Custom> getAllCustomes() {
        return repo.findAll();
    }
}
