package pingle.wang.client.common.sql;

import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: wpl
 */
public class SqlParserResDescriptor {
    private Map<String,String> parms = new LinkedHashMap<>();
    private Map<String,TypeInformation<?>> schemas = new LinkedHashMap<>();
    private String sourceType;
    private String tableName;
    private String sqlInfo;

    public SqlParserResDescriptor() {
    }

    public SqlParserResDescriptor(Map<String, String> parms, Map<String, TypeInformation<?>> schemas, String sourceType, String tableName, String sqlInfo) {
        this.parms = parms;
        this.schemas = schemas;
        this.sourceType = sourceType;
        this.tableName = tableName;
        this.sqlInfo = sqlInfo;
    }

    public Map<String, String> getParms() {
        return parms;
    }

    public void setParms(Map<String, String> parms) {
        this.parms = parms;
    }

    public Map<String, TypeInformation<?>> getSchemas() {
        return schemas;
    }

    public void setSchemas(Map<String, TypeInformation<?>> schemas) {
        this.schemas = schemas;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSqlInfo() {
        return sqlInfo;
    }

    public void setSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
    }

    @Override
    public String toString() {
        return "SqlParserResDescriptor{" +
                "parms=" + parms +
                ", schemas=" + schemas +
                ", sourceType='" + sourceType + '\'' +
                ", tableName='" + tableName + '\'' +
                ", sqlInfo='" + sqlInfo + '\'' +
                '}';
    }
}
