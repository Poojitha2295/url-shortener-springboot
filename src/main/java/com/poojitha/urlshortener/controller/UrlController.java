package com.poojitha.urlshortener.controller;

import com.poojitha.urlshortener.entity.UrlMapping;
import com.poojitha.urlshortener.service.UrlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    // Create short URL
    @PostMapping("/api/shorten")
    public ResponseEntity<UrlMapping> shortenUrl(
            @RequestParam String originalUrl) {

        UrlMapping mapping = urlService.createShortUrl(originalUrl);
        return ResponseEntity.ok(mapping);
    
    }

    // Redirect short URL
    @GetMapping("/{shortUrl}")
    public ResponseEntity<Void> redirect(@PathVariable String shortUrl) {

        Optional<UrlMapping> optionalUrl = urlService.getOriginalUrl(shortUrl);

        if (optionalUrl.isPresent()) {
            return ResponseEntity
                    .status(302)
                    .location(URI.create(optionalUrl.get().getOriginalUrl()))
                    .build();
        }
        

        return ResponseEntity.notFound().build();
    }
}
