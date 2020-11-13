package com.atlassian.db.replica.internal;

import com.atlassian.db.replica.spi.*;
import com.atlassian.jira.ofbiz.sql.*;

import java.io.*;
import java.math.*;
import java.net.*;
import java.sql.Date;
import java.sql.*;
import java.util.*;

public class ReplicaCallableStatementWrapper extends PreparedStatementWrapper implements CallableStatement {
    private final ReplicaConnectionProvider connectionProvider;
    private final ReplicaConsistency consistency;

    public ReplicaCallableStatementWrapper(
        ReplicaConnectionProvider connectionProvider,
        String sql,
        ReplicaConsistency consistency
    ) {
        super(ReplicaPreparedStatement.builder(connectionProvider, consistency, sql).build());
        this.connectionProvider = connectionProvider;
        this.consistency = consistency;
    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType, int scale) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public boolean wasNull() {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public String getString(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public boolean getBoolean(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public byte getByte(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public short getShort(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public int getInt(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public long getLong(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public float getFloat(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public double getDouble(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public BigDecimal getBigDecimal(int parameterIndex, int scale) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public byte[] getBytes(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Date getDate(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Time getTime(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Timestamp getTimestamp(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Object getObject(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public BigDecimal getBigDecimal(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Object getObject(int parameterIndex, Map<String, Class<?>> map) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Ref getRef(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Blob getBlob(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Clob getClob(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Array getArray(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Date getDate(int parameterIndex, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Time getTime(int parameterIndex, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Timestamp getTimestamp(int parameterIndex, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType, String typeName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType, int scale) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType, String typeName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public URL getURL(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setURL(String parameterName, URL val) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNull(String parameterName, int sqlType) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBoolean(String parameterName, boolean x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setByte(String parameterName, byte x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setShort(String parameterName, short x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setInt(String parameterName, int x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setLong(String parameterName, long x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setFloat(String parameterName, float x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setDouble(String parameterName, double x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBigDecimal(String parameterName, BigDecimal x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setString(String parameterName, String x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBytes(String parameterName, byte[] x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setDate(String parameterName, Date x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setTime(String parameterName, Time x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setTimestamp(String parameterName, Timestamp x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x, int length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x, int length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setObject(String parameterName, Object x, int targetSqlType, int scale) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setObject(String parameterName, Object x, int targetSqlType) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setObject(String parameterName, Object x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader, int length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setDate(String parameterName, Date x, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setTime(String parameterName, Time x, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setTimestamp(String parameterName, Timestamp x, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNull(String parameterName, int sqlType, String typeName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public String getString(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public boolean getBoolean(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public byte getByte(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public short getShort(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public int getInt(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public long getLong(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public float getFloat(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public double getDouble(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public byte[] getBytes(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Date getDate(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Time getTime(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Timestamp getTimestamp(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Object getObject(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public BigDecimal getBigDecimal(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Object getObject(String parameterName, Map<String, Class<?>> map) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Ref getRef(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Blob getBlob(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Clob getClob(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Array getArray(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Date getDate(String parameterName, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Time getTime(String parameterName, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Timestamp getTimestamp(String parameterName, Calendar cal) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public URL getURL(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public RowId getRowId(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public RowId getRowId(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setRowId(String parameterName, RowId x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNString(String parameterName, String value) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNCharacterStream(String parameterName, Reader value, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNClob(String parameterName, NClob value) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setClob(String parameterName, Reader reader, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBlob(String parameterName, InputStream inputStream, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNClob(String parameterName, Reader reader, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public NClob getNClob(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public NClob getNClob(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setSQLXML(String parameterName, SQLXML xmlObject) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public SQLXML getSQLXML(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public SQLXML getSQLXML(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public String getNString(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public String getNString(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Reader getNCharacterStream(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Reader getNCharacterStream(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Reader getCharacterStream(int parameterIndex) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public Reader getCharacterStream(String parameterName) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBlob(String parameterName, Blob x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setClob(String parameterName, Clob x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader, long length) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNCharacterStream(String parameterName, Reader value) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setClob(String parameterName, Reader reader) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setBlob(String parameterName, InputStream inputStream) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public void setNClob(String parameterName, Reader reader) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public <T> T getObject(int parameterIndex, Class<T> type) {
        throw new ReadReplicaUnsupportedOperationException();
    }

    @Override
    public <T> T getObject(String parameterName, Class<T> type) {
        throw new ReadReplicaUnsupportedOperationException();
    }
}
