plugins {
    java
    id("org.springframework.boot") version "3.2.5"
    alias(libs.plugins.avro)
}


dependencies {
    implementation(platform(libs.spring.boot.bom))
    implementation(platform(libs.spring.cloud.bom))
    implementation(libs.spring.cloud.starter.stream.kafka)
    annotationProcessor(libs.lombok); compileOnly(libs.lombok);

    testImplementation(libs.spring.boot.starter.test)
//    testImplementation(libs.spring.cloud.stream.te)
}

