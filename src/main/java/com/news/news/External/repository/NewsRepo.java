package com.news.news.External.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.news.news.Domain.entity.News;

public interface NewsRepo extends JpaRepository<News, Integer> {

	@Query(value = "SELECT * FROM news n WHERE n.categoryid = ?", nativeQuery = true)
	public List<News> findBycatId(int catId);

	
}
