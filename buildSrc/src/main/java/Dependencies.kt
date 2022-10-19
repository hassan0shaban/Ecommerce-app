object UserFeatures {
    const val categories = ":features:categories"
    const val search = ":features:search"
    const val marketLocation = ":features:market-location"
    const val shop = ":features:shop"
    const val product = ":features:product"
    const val wishlist = ":features:wishlist"
    const val login = ":features:login"
    const val accountForm = ":features:account-form"
    const val offer = ":features:offer"
    const val cart = ":features:cart"
    const val account = ":features:account"
}

object ManagerFeatures {
    const val addCategory = ":manager-features:add-category"
    const val product = ":manager-features:product"
    const val editProduct = ":manager-features:edit-product"
    const val categories = ":manager-features:categories"
    const val login = ":manager-features:login"
    const val dashboard = ":manager-features:dashboard"
}

object Common {
    const val models = ":common:models"
}


object Libs {
    //adMob
    const val adMob = "com.google.android.gms:play-services-ads-lite:${Versions.Ad_MOB_VERSION}"

    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT_VERSION}"

    //Hilt
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.HILT_VERSION}"
    const val hiltTesting = "com.google.dagger:hilt-android-testing:${Versions.HILT_VERSION}"
    const val hiltAndroidCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.HILT_VERSION}"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.HILT_VERSION}"
    const val hiltAnnotation = "androidx.hilt:hilt-compiler:${Versions.HILT_VERSION}"

    //UI
    const val activity = "androidx.activity:activity-ktx:${Versions.ACTIVITY_VERSION}"

    const val appcompat = "androidx.appcompat:appcompat:${Versions.ANDROIDX_APP_COMPAT_VERSION}"
    const val materialDesign =
        "com.google.android.material:material:${Versions.GOOGLE_MATERIAL_VERSION}"

    //Image Loader
    const val picasso = "com.squareup.picasso:picasso:${Versions.PICASSO_VERSION}"

    //Room
    const val roomRunTime = "androidx.room:room-runtime:${Versions.ROOM_VERSION}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.ROOM_VERSION}"

    //test
    const val testRunner = "androidx.test:runner:${Versions.TEST_RUNNER_VERSION}"
    const val androidCoreTesting =
        "androidx.arch.core:core-testing:${Versions.ANDROIDX_CORE_Testing_VERSION}"

    const val truth = "com.google.truth:truth:1.1.3"

    //gms play
    const val playServicesPlugin = "com.google.gms.google-services"
    const val playServicesMaps =
        "com.google.android.gms:play-services-maps:${Versions.GOOGLE_MAPS_VERSION}"

    const val googleServices = "com.google.gms:google-services:${Versions.GMS_GOOGLE_SERVICES}"
    const val playServicesTasks =
        "com.google.android.gms:play-services-tasks:${Versions.PLAY_SERVICE_TASKS}"
    const val playServicesAuth =
        "com.google.android.gms:play-services-auth:${Versions.GOOGLE_AUTH_VERSION}"

    const val playServicesAuthPhone =
        "com.google.android.gms:play-services-auth-api-phone:${Versions.GOOGLE_AUTH_PHONE_VERSION}"

    //firebase
    const val firebaseAuth = "com.google.firebase:firebase-auth:${Versions.FIREBASE_AUTH_VERSION}"

    const val firebaseDatabase =
        "com.google.firebase:firebase-database:${Versions.FIREBASE_DATABASE_VERSION}"

    const val firebaseStorage =
        "com.google.firebase:firebase-storage:${Versions.FIREBASE_STORAGE_VERSION}"

    const val firebaseFirestore =
        "com.google.firebase:firebase-firestore:${Versions.FIREBASE_FIRESTORE_VERSION}"

    const val firebaseBom =
        "com.google.firebase:firebase-bom:${Versions.FIREBASE_BOM_VERSION}"

    //Material SearchBar
    const val searchBar = "com.github.mancj:MaterialSearchBar:${Versions.SEARCH_BAR}"

    //dots indicator
    const val indicator = "com.tbuonomo:dotsindicator:4.2"

    const val gradleTools = "com.android.tools.build:gradle:${Versions.GRADLE_TOOLS_VERSION}"

    //circle image
    const val circleImage = "de.hdodenhof:circleimageview:${Versions.CIRCLE_IMAGE}"

    //gligar picker
    const val gligarPicker = "com.opensooq.supernova:gligar:${Versions.GLIGER_VERSION}"

    //intuit
    const val intuit = "com.intuit.sdp:sdp-android:${Versions.INTUIT_VERSION}"

    //places
    const val googlePlaces = "com.google.android.libraries.places:places:${Versions.GOOGLE_PLACES}"

    // Kotlin
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_VERSION}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}"

    // Coroutines
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES_VERSION}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES_VERSION}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES_VERSION}"

    const val androidxCore = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE_VERSION}"

    // Fragments
    const val fragments = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_VERSION}"

    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_VERSION}"
    const val lifeCycleCompiler =
        "androidx.lifecycle:lifecycle-compiler:${Versions.LIFECYCLE_COMPILER_VERSION}"
    const val lifeCycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_VERSION}"
    const val viewModels =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VERSION}"

    // SwipeRefresh layout
    const val swipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.ANDROIDX_SWIPE_REFRESH_LAYOUT_VERSION}"

    //Navigation
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.JETPACK_NAVIGATION_VERSION}"

    const val navigationUi =
        "androidx.navigation:navigation-ui-ktx:${Versions.JETPACK_NAVIGATION_VERSION}"
    const val navigationSafeArgsPlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.JETPACK_NAVIGATION_VERSION}"

    // ||
    // TESTING
    // ||

    // Junit 4
    const val junit4 = "junit:junit:${Versions.TEST_JUNIT_VERSION}"
    const val junitExt = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"

    // Fragments
    const val fragmentTest =
        "androidx.fragment:fragment-testing:${Versions.ANDROIDX_FRAGMENT_TESTING_VERSION}"

}