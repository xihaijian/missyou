package com.missyou.service;

import com.missyou.model.Sku;
import com.missyou.repository.SkuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SkuService {


    public List<Sku> getSkuListByIds(List<Long> ids);
}
