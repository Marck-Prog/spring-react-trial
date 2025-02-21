package com.mackodev.service;

import com.mackodev.modal.Deal;

import java.util.List;

public interface DealService {
    List<Deal> getDeal();
    Deal createDeal(Deal deal);
    Deal updateDeal(Deal deal, Long id) throws Exception;
    void deleteDeal(Long id) throws Exception;
}
