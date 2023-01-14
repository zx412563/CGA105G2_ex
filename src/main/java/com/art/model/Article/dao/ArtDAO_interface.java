package com.art.model.Article.dao;

import com.art.model.Article.pojo.Article;

import java.util.List;


public interface ArtDAO_interface {
    public void insert(Article Article);
    public void update(Article Article);
    public void delete(Integer artId);
    public Article getByMemId(Integer memId);
    public List<Article> getAll();
    public List<Article> getAllByMemId(Integer memId);
}
