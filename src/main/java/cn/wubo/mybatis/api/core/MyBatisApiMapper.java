package cn.wubo.mybatis.api.core;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface MyBatisApiMapper {

    @SelectProvider(type = Builder.class, method = "select")
    List<Map<String, Object>> select(String tableName, Map<String, Object> params);

    @InsertProvider(type = Builder.class, method = "insert")
    int insert(String tableName, Map<String, Object> params);

    @UpdateProvider(type = Builder.class, method = "update")
    int update(String tableName, Map<String, Object> params);

    @DeleteProvider(type = Builder.class, method = "delete")
    int delete(String tableName, Map<String, Object> params);
}
