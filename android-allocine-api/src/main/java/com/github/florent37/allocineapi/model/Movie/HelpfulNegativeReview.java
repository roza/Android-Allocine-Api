package com.github.florent37.allocineapi.model.Movie;

import com.github.florent37.allocineapi.model.Writer;
import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.io.Serializable;

public class HelpfulNegativeReview implements Serializable {

    @Expose
    private Integer code;
    @Expose
    private String creationDate;
    @Expose
    private Writer writer;
    @Expose
    private String body;
    @Expose
    private Double rating;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "HelpfulNegativeReview{" +
                "code=" + code +
                ", creationDate='" + creationDate + '\'' +
                ", writer=" + writer +
                ", body='" + body + '\'' +
                ", rating=" + rating +
                '}';
    }
}
