package com.pyip.edu.service;

public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}