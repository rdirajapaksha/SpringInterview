package com.news.news.Domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.news.news.Application.controller.responsedto.NewResponseDto;
import com.news.news.Domain.entity.News;
import com.news.news.External.repository.NewsRepo;

@Service
public class NewsService {

	@Autowired
	private NewsRepo newsRepo;

	public List<News> getByCatId(int catId) {

		return newsRepo.findBycatId(catId);

	}

//	public ResponseEntity<NewResponseDto> getFullNewsById(int newsId) {
//
//		Optional<News> news = newsRepo.findById(newsId);
//		NewResponseDto dto = new NewResponseDto();
//
//		if (news.isPresent()) {
//			dto.setNewsId(news.get().getNewsid());
//			dto.setNewsDesc(news.get().getNewsdesc());
//			
//			return ResponseEntity.ok(dto);
//			
//		} else {
////			return ResponseEntity.ofNullable("");
//		}
//
//	}

}
