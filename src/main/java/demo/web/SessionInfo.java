/*
 * Copyright 2015 Technology Nexus. All rights reserved.
 * Nexus Technology PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms. www.nexusgroup.com
 */
package demo.web;

public class SessionInfo {

    private int id;
    private String query;
    private String salt;
    private String cipherText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
}
