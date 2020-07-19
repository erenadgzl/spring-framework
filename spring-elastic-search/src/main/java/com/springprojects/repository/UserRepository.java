package com.springprojects.repository;

/* 
Eren created on 19.07.2020 
*/

import com.springprojects.entity.User;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
    List<User> findByCustomQuery(String search);

    List<User> findByNameLikeOrLastnameLike(String search,String search2);
}
