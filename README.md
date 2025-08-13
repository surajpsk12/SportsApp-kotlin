# 🚴 SportsApp - Discover Sports & Activities

> **An engaging Android application designed to showcase various sports and activities. It features a dynamic list with custom item layouts, a prominent header, and a modern UI.**

---
---
App Download Link : https://drive.google.com/file/d/1SBc7ULxth6oIDUb7d_l6mkJ49z3lOS0J/view?usp=sharing
---
## 🚀 Features

- 🏅 **Sports Listing:** Displays a list of sports or activities using a `RecyclerView`.
- 🎨 **Custom Design:**
    -   Eye-catching header 
with a gradient overlay (`header_gradient.xml`).
    -   Custom card layout (`card_item_layout.xml`) for each sport item.
    -   Use of badges (`badge_background.xml`) and icons (`ic_play_arrow.xml`).
- 📱 **Data Handling:**
    -   Uses `SportModel.kt` as the data class for sport-related information.
    -   `SportAdapter.kt` manages the data flow to the `RecyclerView`.
- ✨ **Modern UI:** Utilizes `ConstraintLayout` and `CardView` for a clean and responsive interface.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI:** XML
- **Core Components:** Android SDK (Activities, `RecyclerView`, Custom Adapters, `ConstraintLayout`, `CardView`, `ImageView`, `TextView`)

---

## 📁 Project Structure (Simplified)





```
com.surajvanshsv.sportsapp/  
├── MainActivity.kt             # Main activity displaying the sports list
├── SportAdapter.kt             # Custom RecyclerView adapter for sports
├── SportModel.kt               # Data model for sport items
├── res/
│   ├── layout/
│   │   ├── activity_main.xml   # Main layout with header and RecyclerView
│   │   └── card_item_layout.xml# Custom layout for a single sport item
│   ├── drawable/               # Custom drawables (header_gradient, badge_background, ic_play_arrow, etc.)
│   └── values/                 # colors.xml, strings.xml, styles.xml
└── AndroidManifest.xml



```






---

## ⚙️ Installation & Run

1.  **Clone this repo:**
    



```
git clone https://github.com/surajpsk12/SportsApp-kotlin.git
    cd SportsApp-kotlin
```





2.  **Open in Android Studio.**

3.  **Run the app on an emulator or physical device.**

---

## ✨ Future Enhancements

*   ✅ Detailed view for each sport/activity on item click.
*   ✅ Fetch sports data from a remote API or local database.
*   ✅ Categorization or filtering of sports.
*   ✅ User profiles or ability to mark favorite sports.
*   ✅ Integration with maps to find nearby sports venues.

---

## 🤝 Contribution

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or improve.

---

## 📜 License

MIT © 2024 [Suraj Kumar](https://github.com/surajpsk12)

---

## 🌐 Connect With Me

*   🔗 [LinkedIn - Suraj Kumar](https://www.linkedin.com/in/surajvansh12/)
*   💻 [GitHub - surajpsk12](https://github.com/surajpsk12)
