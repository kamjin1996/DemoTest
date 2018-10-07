package com.elasticsearch;

import com.elasticsearch.dao.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Auther: KAM1996
 * @Date: 下午 9:11 2018-09-10
 * @Description: 分布式最强搜索技术
 * @Version: 1.0
 */
public interface ElasticSearch extends ElasticsearchRepository<User,Integer> {

}
