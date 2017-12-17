package com.seavus.applicationtwitter;

import com.seavus.applicationtwitter.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx =
                SpringApplication.run(Main.class, args);
      // ctx.getBean(AnonymousUser.class).tweetRandomMessage();


       User user = new User("nikola@ymail.com");


/*
        AnonymousUser anonymousUser = new AnonymousUser();
        Logger logger = new Logger();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input \"1\" to Tweet a message");
        System.out.println("Input \"2\" to list all tweets in reversed order");
        System.out.println("Input \"3\" to quit the program");
    int tmpint ;
        while(true){
            tmpint=scanner.nextInt();
                if(tmpint==1){
                    anonymousUser.tweetMessage();
                }else if(tmpint==2){
                    anonymousUser.listAllTweets();
                }
                else if (tmpint==3){
                    System.exit(1);
                }


        }
*/
    }
/*
   @Bean
   CommandLineRunner runner(UserRepository user) {
        return args -> {
            user.save(new User("mail@yahoo.com"));
        };
    }
*/
}
