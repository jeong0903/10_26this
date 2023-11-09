package com.kh.com.kh.domain.dao.PostBoxsDAO.RequestBoxDAO;

import com.kh.com.kh.web.form.requestForm.RequestAllForm;

import java.util.List;

public interface RequestBoxDAO {
  List<RequestAllForm> findAllRq(Long member_id);

  Long delRQ(Long requestBoard_id);
}
