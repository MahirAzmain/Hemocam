# Hemocam App

Hemocam is a cutting-edge Android application designed to detect hemoglobin levels through image processing. This project integrates machine learning models with user-friendly Android interfaces to deliver an innovative solution for healthcare.

---

## Directory Structure

    mahirazmain-hemocam-/
    ├── build.gradle.kts
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle.kts
    ├── app/
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   └── src/
    │       ├── androidTest/
    │       │   └── java/
    │       │       └── com/
    │       │           └── example/
    │       │               └── nail/
    │       │                   └── ExampleInstrumentedTest.kt
    │       ├── main/
    │       │   ├── AndroidManifest.xml
    │       │   ├── java/
    │       │   │   └── com/
    │       │   │       └── example/
    │       │   │           └── nail/
    │       │   │               ├── BoundingBox.kt
    │       │   │               ├── BoundingBoxView.kt
    │       │   │               ├── HandDetectionModel.kt
    │       │   │               ├── HandDetector.kt
    │       │   │               ├── ImageSelectionActivity.kt
    │       │   │               ├── Logger.kt
    │       │   │               ├── MainActivity.kt
    │       │   │               ├── Prediction.kt
    │       │   │               ├── ResultsActivity.kt
    │       │   │               └── WelcomeActivity.kt
    │       │   ├── python/
    │       │   │   ├── hand_detection.py
    │       │   │   ├── model.pkl
    │       │   │   └── run.py
    │       │   └── res/
    │       │       ├── drawable/
    │       │       │   ├── app_icon.xml
    │       │       │   ├── baseline_refresh_24.xml
    │       │       │   ├── button_background.xml
    │       │       │   ├── circle_background.xml
    │       │       │   ├── circle_background_blue.xml
    │       │       │   ├── circle_background_orange.xml
    │       │       │   ├── hemocam_icon_background.xml
    │       │       │   ├── hemocam_icon_foreground.xml
    │       │       │   ├── ic_launcher_background.xml
    │       │       │   └── ic_launcher_foreground.xml
    │       │       ├── layout/
    │       │       │   ├── activity_image_selection.xml
    │       │       │   ├── activity_main.xml
    │       │       │   ├── activity_results.xml
    │       │       │   └── activity_welcome.xml
    │       │       ├── mipmap-anydpi-v26/
    │       │       │   ├── hemocam_icon.xml
    │       │       │   ├── ic_launcher.xml
    │       │       │   └── ic_launcher_round.xml
    │       │       ├── mipmap-hdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-mdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xhdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xxhdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── mipmap-xxxhdpi/
    │       │       │   ├── ic_launcher.webp
    │       │       │   └── ic_launcher_round.webp
    │       │       ├── values/
    │       │       │   ├── colors.xml
    │       │       │   ├── strings.xml
    │       │       │   └── themes.xml
    │       │       └── xml/
    │       │           ├── backup_rules.xml
    │       │           ├── data_extraction_rules.xml
    │       │           └── provider_paths.xml
    │       └── test/
    │           └── java/
    │               └── com/
    │                   └── example/
    │                       └── nail/
    │                           └── ExampleUnitTest.kt
    └── gradle/
        ├── libs.versions.toml
        └── wrapper/
            └── gradle-wrapper.properties

## Screenshots:

# Window slider
![WhatsApp Image 2025-08-03 at 14 52 26](https://github.com/user-attachments/assets/72b5779c-b703-49d5-ad57-1942ab5e3dc3)
![WhatsApp Image 2025-08-03 at 14 52 26 (1)](https://github.com/user-attachments/assets/a01763b9-cf87-4aa6-be80-2a6509010ce3)
![WhatsApp Image 2025-08-03 at 14 52 27](https://github.com/user-attachments/assets/c5642078-b244-4168-8815-7b3088b75306)

# APP Icon
![WhatsApp Image 2025-08-02 at 02 10 36](https://github.com/user-attachments/assets/3ad7aa89-0259-46cd-8978-c947bd5c0381)

# Front page
![WhatsApp Image 2025-08-02 at 12 42 14 (1)](https://github.com/user-attachments/assets/8c498144-f7f9-4d7d-a551-4525d923396c) ![WhatsApp Image 2025-08-02 at 12 42 15](https://github.com/user-attachments/assets/88ef7ee8-ddc6-4444-9ab4-dd96ec2ec8a7)

# Main Page
![WhatsApp Image 2025-08-02 at 12 42 13](https://github.com/user-attachments/assets/bfc353da-f6d4-47e6-ac40-50c38d2af8c2)

# Camera click
![WhatsApp Image 2025-08-02 at 12 42 12](https://github.com/user-attachments/assets/ee93084b-1aa7-4d81-bd08-4dc529104b3c)

# Bounding box selection
![WhatsApp Image 2025-08-02 at 12 42 13 (2)](https://github.com/user-attachments/assets/20de9240-e488-4fce-8344-8a640eb9a779)
![WhatsApp Image 2025-08-02 at 12 42 14](https://github.com/user-attachments/assets/61c20b6f-3481-44e6-9b8a-234235d11b49)

# Result
![WhatsApp Image 2025-08-02 at 12 42 13 (1)](https://github.com/user-attachments/assets/c69d2fca-d0cb-4ee0-9db1-03dc4e32d9c3)


# If there is no hand:
![WhatsApp Image 2025-08-02 at 12 44 55](https://github.com/user-attachments/assets/e78f4ef0-1014-446f-b32e-ab65074ae6ba)
![WhatsApp Image 2025-08-02 at 12 44 55 (1)](https://github.com/user-attachments/assets/5de8dc76-486e-4288-a3d2-8c175cbf7f98)

