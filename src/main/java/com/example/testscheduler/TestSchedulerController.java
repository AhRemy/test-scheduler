package com.example.testscheduler;

import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Slf4j
public class TestSchedulerController {
	
	 @Scheduled(cron = "0/10 * * * * *") // 0초부터 10초마다 실행
	    @SchedulerLock(
	        name = "scheduler_lock", // 스케줄러 락 이름 지정. (이름이 동일한 스케줄러일 경우, 락의 대상이 된다.)
	        lockAtLeastFor = "9s", // 락을 유지하는 시간을 설정한다. (9초로 설정했는데, 스케줄러 주기보다 약간 짧게 지정하는 것이 좋다.)
	        lockAtMostFor = "9s" // 보통 스케줄러가 잘 동작하여 잘 종료된 경우 잠금을 바로 해제하게 되는데, 스케줄러 오류가 발생하면 잠금이 해제되지 않는다. 이런 경우 잠금을 유지하는 시간을 설정한다.
	    )
	 
	 	public void Schedule01()throws Exception {
		 // 스케쥴 내용 
		 log.info("Schedule01 start");
		 
	 }

	  @Scheduled(cron = "0/10 * * * * *")
	    @SchedulerLock(
		        name = "scheduler_lock", // 스케줄러 락 이름 지정. (이름이 동일한 스케줄러일 경우, 락의 대상이 된다.)
		        lockAtLeastFor = "9s", // 락을 유지하는 시간을 설정한다. (9초로 설정했는데, 스케줄러 주기보다 약간 짧게 지정하는 것이 좋다.)
		        lockAtMostFor = "9s" // 보통 스케줄러가 잘 동작하여 잘 종료된 경우 잠금을 바로 해제하게 되는데, 스케줄러 오류가 발생하면 잠금이 해제되지 않는다. 이런 경우 잠금을 유지하는 시간을 설정한다.
	  
	    )
	  
	  public void Schedule02()throws Exception {
		  
		  log.info("Schedule02 start");
	  }
	   
	}

