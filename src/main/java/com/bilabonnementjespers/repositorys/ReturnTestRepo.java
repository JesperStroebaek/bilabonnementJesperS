package com.bilabonnementjespers.repositorys;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.models.ReturnTestModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

@org.springframework.stereotype.Repository
public class ReturnTestRepo {
@org.springframework.beans.factory.annotation.Autowired
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

    public List<ReturnTestModel> testModelList(){
        String sql = "SELECT * FROM bilabonnement.return_testing";
        RowMapper<ReturnTestModel> rowMapper =
                new org.springframework.jdbc.core.
                        BeanPropertyRowMapper<>(ReturnTestModel.class);
        return jdbcTemplate.query(sql,rowMapper);
    }
    public void createNewReturnTest()
    {
        String sql = "INSERT INTO bilabonnemet.return_testing (" +
                "test_id, damage_description, return_test_price) VALUES" +
                " (?,?,?)";
        RowMapper rowMapper = new BeanPropertyRowMapper<>(ReturnTestModel.class);
        jdbcTemplate.update(sql, rowMapper);

    }
}
