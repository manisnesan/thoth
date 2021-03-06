package com.trulia.thoth.requestdocuments;

import org.apache.solr.common.SolrInputDocument;

import java.util.Date;

/**
 * User: dbraga - Date: 11/11/14
 */
public class MessageRequestDocument {
    protected String coreName;
    protected String pool;
    protected String hostname;
    protected int portNumber = -1;
    protected String source;

    public  static final String POOL = "pool_s";
    public  static final String CORENAME = "coreName_s";
    public  static final String HOSTNAME = "hostname_s";
    public  static final String PORT = "port_i";
    public  static final String TIMESTAMP = "timestamp_dt";
    public  static final String SOURCE = "source_s";

    protected  String messageType; // INFO - DEBUG - ERROR ?

  public String getCoreName() {
      return coreName;
    }

    public void setCoreName(String coreName) {
      this.coreName = coreName;
    }

    public String getPool() {
      return pool;
    }

    public void setPool(String pool) {
      this.pool = pool;
    }

    public String getHostname() {
      return hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }

    public int getPortNumber() {
      return portNumber;
    }

    public void setPortNumber(int portNumber) {
      this.portNumber = portNumber;
    }

    public String getMessageType() {
      return messageType;
    }

    public void setMessageType(String messageType) {
      this.messageType = messageType;
    }

    public String getSource() {
      return source;
    }

    public void setSource(String source) {
      this.source = source;
    }

    public SolrInputDocument toSolrInputDocument(){
      SolrInputDocument solrInputDocument = new SolrInputDocument();

      solrInputDocument.addField(HOSTNAME, hostname);
      solrInputDocument.addField(PORT, portNumber);
      solrInputDocument.addField(TIMESTAMP, new Date());
      solrInputDocument.addField(POOL, pool);
      solrInputDocument.addField(CORENAME, coreName);
      solrInputDocument.addField(SOURCE, source);

      return solrInputDocument;

    }



  }
