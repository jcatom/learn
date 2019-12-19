package cc.jml1024.learn.service.repository;

import cc.jml1024.learn.service.domain.UserOrderInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface UserOrderInfoRepository extends ElasticsearchCrudRepository<UserOrderInfo, Long> {
}
