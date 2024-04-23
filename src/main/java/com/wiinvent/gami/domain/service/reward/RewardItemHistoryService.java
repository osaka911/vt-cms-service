package com.wiinvent.gami.domain.service.reward;

import com.wiinvent.gami.domain.entities.reward.RewardItemHistory;
import com.wiinvent.gami.domain.entities.transaction.TurnTransaction;
import com.wiinvent.gami.domain.response.RewardItemHistoryResponse;
import com.wiinvent.gami.domain.response.TransactionResponse;
import com.wiinvent.gami.domain.response.base.PageCursorResponse;
import com.wiinvent.gami.domain.response.type.CursorType;
import com.wiinvent.gami.domain.service.BaseService;
import com.wiinvent.gami.domain.utils.Helper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RewardItemHistoryService extends BaseService {


  public PageCursorResponse<RewardItemHistoryResponse> getRewardItemHistory(UUID userId, Long next, Long pre, int limit) {
    List<RewardItemHistory> rewardItemHistories = new ArrayList<>();
    CursorType type = CursorType.FIRST;
    if (next == null && pre == null) {
      next = Helper.getNowMillisAtUtc();
      pre = 0L;
      rewardItemHistories = rewardItemHistoryStorage.findAll(userId, next, pre, limit, type);
    } else if (next == null) {
      type = CursorType.NEXT;
      pre = 0L;
      rewardItemHistories = rewardItemHistoryStorage.findAll(userId, next, pre, limit, type);
    } else if (pre == null) {
      type = CursorType.PRE;
      next = Helper.getNowMillisAtUtc();
      rewardItemHistories = rewardItemHistoryStorage.findAll(userId, next, pre, limit, type);
    }
    List<RewardItemHistoryResponse> responses = modelMapper.toListRewardItemHistoryResponse(rewardItemHistories);
    return new PageCursorResponse<>(responses, limit, type, "createdAt");
  }
}
