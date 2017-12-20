package com.seavus.applicationtwitter.tweet;

import com.seavus.applicationtwitter.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet>  findTweetsByUser(User user);
  //  List<Tweet> findTweetsBySignedUsers();
}
