package org.alfresco.indexchecker.solr.bean;

import java.util.List;

public class Response
{
    public int numFound;
    public int start;
    public List<Doc> docs;
}