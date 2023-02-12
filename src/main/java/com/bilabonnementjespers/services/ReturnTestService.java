package com.bilabonnementjespers.services;

@org.springframework.stereotype.Service
public class ReturnTestService {

    public java.util.List<com.bilabonnementjespers.models.ReturnTestModel> returnTestModelList(){
        return com.bilabonnementjespers.repositorys.ReturnTestRepo.testModelList();
    }

    public void createReturnTest(){

    }
  /*  public com.bilabonnementjespers.models.ReturnTestModel searchReturnTest(int order_id){
        return com.bilabonnementjespers.repositorys.ReturnTestRepo.testModelList();
    }

todo lave hele returnTestklassen som cars.
   */

}
