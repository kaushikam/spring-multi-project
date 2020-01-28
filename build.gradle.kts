allprojects {
	repositories {
		mavenCentral()
		jcenter()
	}
}

plugins {
	id ("org.springframework.boot") version ("2.2.0.RELEASE") apply false
	id ("io.spring.dependency-management") version ("1.0.8.RELEASE") apply false
}

subprojects {
	apply {
		plugin("java")
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
	}

	dependencies {
		"implementation"("org.springframework.boot:spring-boot-starter-data-jpa")
	}
}
