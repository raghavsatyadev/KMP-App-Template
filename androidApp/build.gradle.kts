plugins {
  alias(libs.plugins.androidApplication)
  alias(libs.plugins.composeMultiplatform)
  alias(libs.plugins.composeCompiler)
}

kotlin { jvmToolchain(21) }

android {
  namespace = "com.jetbrains.kmpapp"
  compileSdk = 36

  defaultConfig {
    applicationId = "com.jetbrains.kmpapp"
    minSdk = 24
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"
  }
  packaging { resources { excludes += "/META-INF/{AL2.0,LGPL2.1}" } }
  buildTypes { getByName("release") { isMinifyEnabled = false } }
}

dependencies {
  implementation(projects.composeApp)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.compose.ui.tooling.preview)
  debugImplementation(libs.androidx.compose.ui.tooling)
}
