package com.bilabonnementjespers.repositorys;
@org.springframework.stereotype.Repository
public class ReturnTestRepo {
@org.springframework.beans.factory.annotation.Autowired
static
org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

    public static java.util.List<com.bilabonnementjespers.models.ReturnTestModel> testModelList(){
        String sql = "";
        org.springframework.jdbc.core.RowMapper<com.bilabonnementjespers.models.ReturnTestModel> rowMapper =
                new org.springframework.jdbc.core.BeanPropertyRowMapper<>(com.bilabonnementjespers.models.ReturnTestModel.class);
        return jdbcTemplate.query(sql,rowMapper);
    }
}
