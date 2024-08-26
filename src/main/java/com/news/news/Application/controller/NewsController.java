package com.news.news.Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.news.news.Domain.entity.News;
import com.news.news.Domain.service.NewsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/News")
@AllArgsConstructor
public class NewsController {

	@Autowired
	private NewsService newsService;

	@GetMapping("/getByCatId")
	public List<News> getByCatId(@RequestParam int catId) {

		return newsService.getByCatId(catId);

	}
	
//	@GetMapping("/getFullNewsById")
//	public List<News> getFullNewsById(@RequestParam int newsId) {
//
//		return newsService.getFullNewsById(newsId);
//
//	}

}
