package com.moyeo.service.impl;

import com.moyeo.controller.ReviewBoardController;
import com.moyeo.dao.ReviewBoardDao;
import com.moyeo.service.ReviewBoardService;
import com.moyeo.vo.ReviewBoard;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DefaultReviewBoardService implements ReviewBoardService {

  private final ReviewBoardDao reviewBoardDao;
  private static final Log log = LogFactory.getLog(DefaultReviewBoardService.class);

  @Override
  public List<ReviewBoard> list() {
    return reviewBoardDao.findAll();
  }

  @Override
  public ReviewBoard get(int reviewBoardId) {
    return reviewBoardDao.findBy(reviewBoardId);
  }
}