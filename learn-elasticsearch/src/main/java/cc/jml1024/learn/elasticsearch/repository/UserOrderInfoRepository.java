package cc.jml1024.learn.elasticsearch.repository;

import cc.jml1024.learn.elasticsearch.document.UserOrderInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface UserOrderInfoRepository extends ElasticsearchCrudRepository<UserOrderInfo, Long> {
}
