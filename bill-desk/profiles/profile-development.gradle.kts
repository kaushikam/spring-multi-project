val currentDir = project(":bill-desk").projectDir
apply {
	from("$rootDir/bill-desk/profiles/common.gradle.kts")
}

val applicationProperties: HashMap<String, String> by extra

tasks.withType<ProcessResources> {
	filesMatching("application.properties") {
		expand(applicationProperties)
	}
}
