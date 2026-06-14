<div align="center">

<img src="app/src/main/res/drawable/sinsun_logo.png" alt="Sinsun 로고" width="160" />

# Sinsun · 신선

**우리 동네 반찬가게를 한 곳에서, 신선한 반찬 마켓플레이스 🥬**

🎓 숭실대학교 창업 동아리 **「창업하솦」** 프로젝트 · 2020.09 – 2021.02

![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)
![Language](https://img.shields.io/badge/Language-Java-007396?logo=openjdk&logoColor=white)
![minSdk](https://img.shields.io/badge/minSdk-26-1976D2)
![targetSdk](https://img.shields.io/badge/targetSdk-30-1976D2)
![Build](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle&logoColor=white)

</div>

---

## 📖 소개

**신선(Sinsun)** 은 동네 반찬가게의 반찬을 한 곳에서 둘러보고 주문하는 경험을 목표로 하는 **안드로이드 반찬 마켓플레이스 앱**입니다.
여러 반찬가게를 탐색하고, 가게별 **메뉴 · 리뷰 · 매장정보**를 탭으로 확인할 수 있습니다.

> 신선한 반찬을, 매일 새롭게.

## 🎓 창업 동아리 프로젝트

> **숭실대학교 창업 동아리 「창업하솦」** 활동으로 기획·개발한 프로젝트입니다. _(2020.09 ~ 2021.02)_

- 🎯 **배경** — 지역 반찬가게의 **재고 로스(폐기)율 감소**와 **거래 활성화**를 목표로, 동네 반찬가게를 잇는 반찬 마켓플레이스 *신선*을 기획
- 🔎 **현장 리서치** — 초기 한 달간 지역 반찬가게를 직접 방문해 **수요 설문조사**와 **로스율 측정**을 진행하고, 이를 바탕으로 서비스를 설계
- 🌱 **성장** — 안드로이드 앱 프로토타입을 직접 개발하며 팀의 실질적인 개발 역량을 키운 프로젝트

## ✨ 주요 기능

- 🎬 **스플래시** — Sinsun 로고 인트로 화면 (`IntroActivity`)
- 🏠 **홈 피드** — 상단 배너 캐러셀(ViewPager)과 추천 반찬가게 바로가기
- 🏪 **반찬가게 둘러보기** — 반찬가게 1·2·3 상세 페이지
- 📑 **탭 구성** — 가게별 *메뉴 / 리뷰 / 매장정보* (TabLayout + ViewPager)
- ⭐ **리뷰 & 별점** — RatingBar 기반 사용자 리뷰 목록
- 🧭 **하단 내비게이션** — 홈 · 장바구니 · 알림 · 내정보

## 🛠 기술 스택

| 구분 | 내용 |
| --- | --- |
| Language | Java |
| Min SDK | 26 (Android 8.0) |
| Compile / Target SDK | 30 (Android 11) |
| Build | Gradle · buildTools 30.0.2 |
| UI | AppCompat v7, ConstraintLayout, Material Design, support-v4 |
| Architecture | Activity + Fragment · ViewPager · TabLayout |
| Test | JUnit 4 · Espresso |

## 🗂 프로젝트 구조

```text
Sinsun_APP/
└─ app/src/main/
   ├─ java/com/example/test/
   │  ├─ IntroActivity.java       # 스플래시
   │  ├─ MainActivity.java        # 홈 (배너 캐러셀 · 하단 내비)
   │  ├─ Market1~3.java           # 반찬가게 상세
   │  ├─ FragmentMenu1~3.java     # 메뉴 / 리뷰 / 매장정보 탭
   │  ├─ Adapter.java             # 배너 캐러셀 어댑터
   │  └─ VPAdapter.java           # 탭 페이저 어댑터
   ├─ res/                        # 레이아웃 · 드로어블 · 리소스
   └─ AndroidManifest.xml
```

| 화면 | 설명 |
| --- | --- |
| `IntroActivity` | 로고 노출 후 홈으로 이동하는 스플래시 |
| `MainActivity` | 홈 — 배너 캐러셀, 반찬가게 바로가기, 하단 내비 |
| `Market1` · `Market2` · `Market3` | 반찬가게 상세 — 메뉴 / 리뷰 / 매장정보 탭 |
| `FragmentMenu1` | 메뉴 탭 |
| `FragmentMenu2` | 리뷰 탭 (별점 + 리뷰 목록) |
| `FragmentMenu3` | 매장정보 탭 |

## 🚀 시작하기

```bash
git clone https://github.com/SinsunFood/Sinsun_APP.git
```

1. **Android Studio**로 프로젝트 열기
2. Gradle Sync 완료 대기
3. **Android 8.0(API 26)+** 기기/에뮬레이터에서 **Run ▶**

또는 CLI에서:

```bash
./gradlew assembleDebug
```

## 👥 팀

**SinsunFood** 팀이 함께 만들었습니다.

| 이름 | GitHub |
| --- | --- |
| 김정원 | [@dhkfkr134](https://github.com/dhkfkr134) |
| 김시우 | [@siwookim97](https://github.com/siwookim97) |
| 박철순 | [@cheolsoonP](https://github.com/cheolsoonP) |
| 조소망 | [@josomang](https://github.com/josomang) |

---

<div align="center">
Made with 🥗 by <b>SinsunFood</b>
</div>
