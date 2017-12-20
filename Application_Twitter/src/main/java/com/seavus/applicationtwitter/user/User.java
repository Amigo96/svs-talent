package com.seavus.applicationtwitter.user;


import com.seavus.applicationtwitter.tweet.Tweet;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Component

public class
User {
@Id
    private String email;


@OneToMany(mappedBy = "user")
private Collection<Tweet> tweets;

@ManyToMany
private Collection<User> followedUsers;

public User(){
    createUser("defaultUserBean");
}

public User(String email){
    createUser(email);
}

    private void createUser(String mail) {
    this.email= email ;
}


}
