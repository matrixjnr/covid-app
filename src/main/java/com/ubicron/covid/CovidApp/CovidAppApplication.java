package com.ubicron.covid.CovidApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import com.ubicron.covid.CovidApp.service.CovidServiceImpl;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
@EnableCaching

public class CovidAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidAppApplication.class, args);
	}

	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager(CovidServiceImpl.COVID_SERVICE_CACHE);
	}

}
