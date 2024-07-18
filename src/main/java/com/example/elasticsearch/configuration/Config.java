package com.example.elasticsearch.configuration;


import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.elasticsearch.repository")
@ComponentScan(basePackages = {"com.example.elasticsearch"})
public class Config extends ElasticsearchConfiguration {

    @Value("${elasticsearch.url}")
    public String elasticsearchurl;

    @Value("${elasticsearch.username}")
    public String userName;

    @Value("${elasticsearch.password}")
    public String password;

    @Value("${elasticsearch.caFingerprint}")
    public String caFingerprint;


    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo(elasticsearchurl)
                .usingSsl(caFingerprint) //add the generated sha-256 fingerprint
                .withBasicAuth(userName, password) //add your username and password
                .build();
    }


}
