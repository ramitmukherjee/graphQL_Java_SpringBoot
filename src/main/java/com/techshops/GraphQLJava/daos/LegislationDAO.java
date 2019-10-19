package com.techshops.GraphQLJava.daos;

import com.techshops.GraphQLJava.DTOs.Legislation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Repository
public class LegislationDAO {

    @Autowired
    DocumentDAO documentDAO;

    public List<Legislation> LEGISLATIONS;

    @PostConstruct
    public void init() {
        LEGISLATIONS = Arrays.asList(
                new Legislation( "1001", documentDAO.getDocumentById("1001"), "reg1:para1", 2, "para1", 101, true, true ),
                new Legislation( "1002", documentDAO.getDocumentById("1001"), "reg1:para2", 2, "para2", 102, true, false ),
                new Legislation( "1003", documentDAO.getDocumentById("1002"), "root", 0, "root", 103, true, true ),
                new Legislation( "1004", documentDAO.getDocumentById("1002"), "root:sch1", 1, "sch1", 104, true, true ),
                new Legislation( "1005", documentDAO.getDocumentById("1002"), "reg1:sch1:para1", 3, "para1", 105, true, false ),
                new Legislation( "1006", documentDAO.getDocumentById("1003"), "para1", 1, "para1", 105, true, false ),
                new Legislation( "1007", documentDAO.getDocumentById("1004"), "reg1:para1", 2, "para1", 107, true, true ),
                new Legislation( "1008", documentDAO.getDocumentById("1004"), "reg1:para2", 2, "para2", 108, true, true ),
                new Legislation( "1009", documentDAO.getDocumentById("1003"), "para1:a1", 2, "a1", 109, true, true ),
                new Legislation( "1010", documentDAO.getDocumentById("1003"), "reg1:a1:c1", 3, "c1", 110, true, false )
        );
    }

    /**
     * Return all legislations
     * @return
     */
    public List<Legislation> getAllLegislations() {
        return LEGISLATIONS;
    }

    /**
     * Get legislation by ID return null otherwise
     * @param id
     * @return
     */
    public Legislation getLegislationById( String id ) {
        return LEGISLATIONS.stream()
                .filter( legislation -> legislation.getId().equals( id ) )
                .findFirst()
                .orElse( null );
    }

}
