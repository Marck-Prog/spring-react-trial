package com.mackodev.service;

import com.mackodev.modal.Seller;
import com.mackodev.modal.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport(SellerReport sellerReport);
}
