package cn.net.hlsq.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import cn.net.hlsq.app.model.AppConfigration;
import cn.net.hlsq.app.model.BaseModel;

@Component("appConfigrationDao")
public class AppConfigrationDao extends AbstractBaseDao<AppConfigration> {

	@Override
	public void execute(AppConfigration model) {

	}

	@Override
	public BaseModel get(int id) {
		return null;
	}

	@Override
	public void delete(int id) {

	}

	@Override
	public void saveOrUpdate(final AppConfigration model) {
		final String sql = "insert into " + model.getTableName() + " (type) values (?)";
		getJdbcTemplate().update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, model.getType());
			}
		});
	}

}
