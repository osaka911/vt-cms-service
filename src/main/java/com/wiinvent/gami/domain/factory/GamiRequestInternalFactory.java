package com.wiinvent.gami.domain.factory;

import com.wiinvent.gami.domain.dto.*;
import com.wiinvent.gami.domain.exception.RequestFailedException;
import com.wiinvent.gami.domain.response.InternalRequestResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Log4j2
public class GamiRequestInternalFactory {
  @Value("${GAMI_SERVICE_DOMAIN}")
  private String gamiServiceDomain;

  @Autowired
  private RestTemplate httpRestTemplate;

  public InternalRequestResponse addSub(InternalSubRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalSubRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========addPackage: {}/v1/game/it/portal/package/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/package/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addPackage: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addAchievement(InternalAchievementRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalAchievementRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========addAchievement: {}/v1/game/it/portal/achievement/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/achievement/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addAchievement: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addQuest(InternalQuestRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalQuestRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========addQuest: {}/v1/game/it/portal/quest/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/quest/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addQuest: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addCoin(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========addCoin: {}/v1/game/it/portal/coin/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/coin/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addCoin: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subCoin(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========subCoin: {}v1/game/it/portal/coin/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/coin/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subCoin: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addPoint(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========addPoint: {}/v1/game/it/portal/point/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/point/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addPoint: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subPoint(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("=========subPoint: {}/v1/game/it/portal/point/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/point/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subPoint: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addExp(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========addExp: {}/v1/game/it/portal/exp/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/exp/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addExp: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subExp(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========subExp: {}/v1/game/it/portal/exp/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/exp/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subExp: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addTurn(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========addTurn: {}/v1/game/it/portal/turn/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/turn/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addTurn: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subTurn(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========subTurn: {}/v1/game/it/portal/turn/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/turn/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subTurn: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addTicket(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========addTicket: {}/v1/game/it/portal/ticket/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/ticket/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addTicket: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subTicket(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========subTicket: {}/v1/game/it/portal/ticket/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/ticket/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subTicket: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addLuckyPoint(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========addLuckyPoint: {}/v1/game/it/portal/lucky-point/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/lucky-point/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addLuckyPoint: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subLuckyPoint(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========subLuckyPoint: {}/v1/game/it/portal/lucky-point/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/lucky-point/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subLuckyPoint: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse addCollection(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========addCollection: {}/v1/game/it/portal/collection/add", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/collection/add",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========addCollection: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse subCollection(InternalRequestDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalRequestDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========subCollection: {}/v1/game/it/portal/collection/subtract", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/collection/subtract",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class);
      log.debug("=========subCollection: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }

  public InternalRequestResponse resetPassword(InternalResetPassDto dto) {
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<InternalResetPassDto> requestEntity = new HttpEntity<>(dto, headers);
      log.debug("==========resetPass: {}/v1/game/it/portal/user/reset-password", gamiServiceDomain);
      ResponseEntity<InternalRequestResponse> response = httpRestTemplate.exchange(
          gamiServiceDomain + "/v1/game/it/portal/user/reset-password",
          HttpMethod.PUT,
          requestEntity,
          InternalRequestResponse.class
      );
      log.debug("=========resetPass: {}{}", gamiServiceDomain, response.getBody());
      if (response.getBody() == null || !response.getBody().getSuccess()) {
        throw new RequestFailedException(response.getBody().getMessage());
      }
      return response.getBody();
    } catch (Exception e) {
      throw new RequestFailedException(e.getMessage());
    }
  }
}
