
public class HrmsMySQLDBConfig {
	 @Bean(name = "mysqlDb")
	    @ConfigurationProperties(prefix = "spring.hrms.mysql")
	    public DataSource mysqlDataSource() {
	        return DataSourceBuilder.create().build();
	    }

	    @Bean(name = "mysqlJdbcTemplate")
	    public JdbcTemplate jdbcTemplate(@Qualifier("mysqlDb") DataSource dsMySQL) {
	        return new JdbcTemplate(dsMySQL);
	    }
}
