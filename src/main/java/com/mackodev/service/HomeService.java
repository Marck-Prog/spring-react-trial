package com.mackodev.service;

import com.mackodev.modal.Home;
import com.mackodev.modal.HomeCategory;

import java.util.List;

public interface HomeService {
    public Home createHomePageData(List<HomeCategory> allCategories);
}
