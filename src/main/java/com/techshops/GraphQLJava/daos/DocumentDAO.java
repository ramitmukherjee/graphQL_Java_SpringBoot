package com.techshops.GraphQLJava.daos;

import com.techshops.GraphQLJava.DTOs.Document;
import com.techshops.GraphQLJava.DTOs.Legislation;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Repository
public class DocumentDAO {

    public List<Document> DOCUMENTS;

    @PostConstruct
    public void init() {
        DOCUMENTS = Arrays.asList(
                new Document("1001", "S", true, 2019, "Document No. 1", "docume+#+1", "Doc 1", "101", 0),
                new Document("1002", "X", true, 2018, "Document No. 2", "docume+#+2", "Doc 2", "102", 1),
                new Document("1003", "S", true, 2019, "Document No. 3", "docume+#+3", "Doc 3", "103", 1),
                new Document("1004", "X", true, 2018, "Document No. 4", "docume+#+4", "Doc 4", "104", 0)
        );
    }


    /**
     * Returns all documents
     * @return
     */
    public List<Document> getAllDocuments() {
        return DOCUMENTS;
    }

    /**
     * Find the doc by ID return null if not found
     * @param id
     * @return
     */
    public Document getDocumentById( String id ) {
        return DOCUMENTS.stream()
                .filter( document -> document.getId().equals(id) )
                .findFirst()
                .orElse( null );
    }

}
