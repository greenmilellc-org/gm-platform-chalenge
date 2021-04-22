package com.greenmile.platformchallenge

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer
import org.springframework.boot.info.BuildProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MetricsConfig(
    @Value("\${app.name}") val applicationName: String,
    val buildProperties: BuildProperties
) {

    @Bean
    fun metricsCommonTags(): MeterRegistryCustomizer<MeterRegistry> = MeterRegistryCustomizer { meterRegistry ->
        meterRegistry.config()
            .commonTags(
                "application", applicationName,
                "app-version", buildProperties.version
            )
    }
}