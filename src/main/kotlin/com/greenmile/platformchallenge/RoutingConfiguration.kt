package com.greenmile.platformchallenge

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router


@Configuration
class RoutingConfiguration {

    @Bean
    fun route(platformChallengeHandler: PlatformChallengeHandler) = router {
        "/".nest {
            GET(platformChallengeHandler::hello)
        }
    }
}