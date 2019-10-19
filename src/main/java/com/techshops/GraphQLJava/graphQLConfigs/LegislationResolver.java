package com.techshops.GraphQLJava.graphQLConfigs;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.techshops.GraphQLJava.DTOs.Document;
import com.techshops.GraphQLJava.DTOs.Legislation;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LegislationResolver implements GraphQLResolver<Legislation> {

    public Document getDocument(Legislation legislation) {
        return legislation.getDocument();
    }

}
