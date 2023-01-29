package com.bilabonnementjespers.services;

@org.springframework.stereotype.Service
public class ReturnTestService {

    public java.util.List<com.bilabonnementjespers.models.ReturnTestModel> returnTestModelList(){
        return com.bilabonnementjespers.repositorys.ReturnTestRepo.testModelList();
    }

    public void createReturnTest(){

    }
}
