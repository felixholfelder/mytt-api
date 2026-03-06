package cloud.holfelder.myttapi.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.cache.annotation.CacheEvict
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.Scheduled

@Configuration
class CacheConfig {

  @CacheEvict(allEntries = true, cacheNames = ["historyData"])
  @Scheduled(cron = "\${cache.evict-cache}")
  fun evictCache() {
    log.info("History cache Evicted")
  }

  companion object {
    val log: Logger = LoggerFactory.getLogger(CacheConfig::class.java)
  }
}