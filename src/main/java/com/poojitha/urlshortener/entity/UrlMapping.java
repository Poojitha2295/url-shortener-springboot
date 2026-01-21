package com.poojitha.urlshortener.entity;

	import jakarta.persistence.*;
	import java.time.LocalDateTime;

	@Entity
	@Table(name = "url_mapping")
	public class UrlMapping {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String originalUrl;

	    @Column(unique = true, nullable = false)
	    private String shortUrl;

	    private LocalDateTime createdAt;

	    // Constructor
	    public UrlMapping() {
	        this.createdAt = LocalDateTime.now();
	    }

	    // Getters & Setters
	    public Long getId() {
	        return id;
	    }

	    public String getOriginalUrl() {
	        return originalUrl;
	    }

	    public void setOriginalUrl(String originalUrl) {
	        this.originalUrl = originalUrl;
	    }

	    public String getShortUrl() {
	        return shortUrl;
	    }

	    public void setShortUrl(String shortUrl) {
	        this.shortUrl = shortUrl;
	    }

	    public LocalDateTime getCreatedAt() {
	        return createdAt;
	    }
	}

