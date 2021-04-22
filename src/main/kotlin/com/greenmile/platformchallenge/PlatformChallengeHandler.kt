package com.greenmile.platformchallenge

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class PlatformChallengeHandler {

    fun hello(request: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(BodyInserters.fromValue("\n" +
                "                                                                            ,--╤╕\n" +
                "                                                                       ,-╦ê▒▓▓▓▓▓▓▓▓▓Ö\n" +
                "                                                                 ,╓╗▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓┘\n" +
                "                                                             ,╗▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌\n" +
                "                                                          ╓╗▓▓▓▓▓▓▓▓▓▓█▀Γ╔▄▓▓▓▓▓▓▓▓O\n" +
                "                                                        ╗▓▓▓▓▓▓▓▓▓▓▀▀▌╤▒▓▓▓▓▓▓▓▓▓▓▓\n" +
                "                                                      ╣▓▓▓▓▓▓▓▓▓▀`,╗▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌\n" +
                "                                                    ╥▓▓▓▓▓▓▓▓▓Q ╓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓⌐\n" +
                "                                                  ,▓▓▓▓▓▓▓█Γ ,▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌\n" +
                "                                                 ╓▓▓▓▓▓▓█` ╓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "                                                ╓▓▓▓▓▓█▓╕╓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓Ö\n" +
                "                                                ▓▓▓▓▀  ,▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓Θ\n" +
                "                                               ║▓▓█`  ê▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓Ö\n" +
                "                                               ▓▓▓  ╓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "                                              ╓▀  Σ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀\n" +
                "                                                  ╔▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀\n" +
                "                                                 ╔▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀\n" +
                "   ______                     __  ____ __       ╓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▀`\n" +
                "  / ____/_______  ___  ____  /  |/  (_) /__     ╫▓▓▓▓▓▓▓▓▓▓▓▓▓██▀`\n" +
                " / / __/ ___/ _ \\/ _ \\/ __ \\/ /|_/ / / / _ \\   '▀▀▀▀▀▀▀▀▀╜\"`\n" +
                "/ /_/ / /  /  __/  __/ / / / /  / / / /  __/\n" +
                "\\____/_/   \\___/\\___/_/ /_/_/  /_/_/_/\\___/\n" +
                "\n" +
                "===============================================================================\n" +
                "-------------------------------------------------------------------------------"))

}