package com.bilabonnementjespers.repositorys;
@org.springframework.stereotype.Repository
public class ReturnTestRepo {
@org.springframework.beans.factory.annotation.Autowired
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

    public java.util.List<com.bilabonnementjespers.models.ReturnTestModel> testModelList(){
        String sql = "";
        javax.swing.tree.RowMapper<com.bilabonnementjespers.models.ReturnTestModel> rowMapper =
                new org.springframework.jdbc.core.BeanPropertyRowMapper<>(com.bilabonnementjespers.models.ReturnTestModel.class);
        return jdbcTemplate.query(sql,rowMapper);
    }
}
