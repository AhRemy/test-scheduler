package com.example.testscheduler;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Slf4j
@Component
@EnableAsync 
public class TestSchedulerController {
	
	 	@Scheduled(cron = "0/60 * * * * *") // 0초부터 60초마다 실행
	    @SchedulerLock(
	        name = "scheduler_lock", // 스케줄러 락 이름 지정. (이름이 동일한 스케줄러일 경우, 락의 대상이 된다.)
	        lockAtLeastFor = "59s", // 락을 유지하는 시간을 설정한다. (59초로 설정했는데, 스케줄러 주기보다 약간 짧게 지정하는 것이 좋다.)
	        lockAtMostFor = "59s" //  에러가 나거나 시간이 오래걸릴때 다른 스케쥴을 지정하는 시간 ( lockAtLeasFor < lockAtMostFor ) 
	    )
	 	public void Schedule01( )throws Exception {
		 // 스케쥴이 실행될 내용 
		 	log.info("Schedule01 time :{}", String.valueOf(LocalDateTime.now()));
		 
	 	}
}


