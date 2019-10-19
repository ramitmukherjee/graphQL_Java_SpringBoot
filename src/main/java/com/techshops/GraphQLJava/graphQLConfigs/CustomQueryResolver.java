package com.techshops.GraphQLJava.graphQLConfigs;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshops.GraphQLJava.DTOs.Document;
import com.techshops.GraphQLJava.DTOs.Legislation;
import com.techshops.GraphQLJava.daos.DocumentDAO;
import com.techshops.GraphQLJava.daos.LegislationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomQueryResolver implements GraphQLQueryResolver {

    @Autowired
    LegislationDAO legislationDAO;

    @Autowired
    DocumentDAO documentDAO;

    public List<Legislation> getAllLegislations() { return legislationDAO.getAllLegislations(); }

    public Legislation getLegislationById(String id) { return legislationDAO.getLegislationById( id ); }

    public List<Document> getAllDocuments() { return documentDAO.getAllDocuments(); }

    public Document getDocumentById(String id) { return documentDAO.getDocumentById( id ); }

}
