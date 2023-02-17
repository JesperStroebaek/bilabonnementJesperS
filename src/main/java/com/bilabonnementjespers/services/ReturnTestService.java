package com.bilabonnementjespers.services;

import com.bilabonnementjespers.models.ReturnTestModel;
import com.bilabonnementjespers.repositorys.ReturnTestRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ReturnTestService {

    @Autowired
    ReturnTestRepo returnTestRepo;



    public List<ReturnTestModel> returnTestModelList()
    {
        return returnTestRepo.testModelList();
    }

    public void createReturnTest(){

    }
}
