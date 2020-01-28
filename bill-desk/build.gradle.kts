import org.springframework.boot.gradle.tasks.bundling.BootJar

repositories {
	maven {
		url = uri("http://nexus.saas.hand-china.com/content/repositories/rdc")
	}
}

dependencies {
	implementation("com.oracle:ojdbc7:12.1.0.2")
}

tasks.withType<BootJar> {
	enabled = false
}

sourceSets {
	main {
		java
		resources
	}

	test {
		java
		resources
	}
}

val buildProfile: String by project
val currentDir = project(":bill-desk").projectDir

apply {
	from("$currentDir/profiles/profile-$buildProfile.gradle.kts")
}
