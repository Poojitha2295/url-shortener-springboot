package com.poojitha.urlshortener.service;

import com.poojitha.urlshortener.entity.UrlMapping;
import com.poojitha.urlshortener.repository.UrlMappingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UrlService {

    private final UrlMappingRepository repository;

    public UrlService(UrlMappingRepository repository) {
        this.repository = repository;
    }

    // Create short URL
    public UrlMapping createShortUrl(String originalUrl) {
        UrlMapping urlMapping = new UrlMapping();
        urlMapping.setOriginalUrl(originalUrl);

        // simple short code (we’ll improve later)
        String shortCode = UUID.randomUUID().toString().substring(0, 6);
        urlMapping.setShortUrl(shortCode);

        return repository.save(urlMapping);
    }

    // Get original URL using short code
    public Optional<UrlMapping> getOriginalUrl(String shortCode) {
        return repository.findByShortUrl(shortCode);
    }
}
