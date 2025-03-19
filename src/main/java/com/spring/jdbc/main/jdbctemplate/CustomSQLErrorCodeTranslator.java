package com.spring.jdbc.main.jdbctemplate;

import java.sql.SQLException;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;

public class CustomSQLErrorCodeTranslator extends SQLErrorCodeSQLExceptionTranslator {
	@Override
    protected BadSqlGrammarException customTranslate(String task, String sql, SQLException sqlException) {
        if (sqlException.getErrorCode() == 42001) {
          return new BadSqlGrammarException("Bad SQL", sql, sqlException);
        }
        return null;
    }
}
