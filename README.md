# Inflearn - IntelliJ Guide

![IntelliJIDEA_ReferenceCard_Win.png](https://github.com/tmfdk333/intellij-guide/blob/master/images/IntelliJIDEA_ReferenceCard_Win.png)

> Reference Card에 없는 것 - <ins>명령어 설명</ins>

## [1] 코드 Edit
### 1. 메인메소드 생성 및 실행
- src/main/java - 평균적인 java의 디렉토리 구조
    - Directory `/`, Package `.` 로 하위 계층을 구분
- Generate Code **`Alt+Insert`**
- Live Template(Code Template) `psvm`, `sout`
- Run context configuration from editor **`Ctrl+Shift+F10`**
- Run **`Shift+F10`**

### 2. 라인 수정하기
- Duplicate current line **`Ctrl+D`**
- Delete line at caret **`Ctrl+Y`**
- Smart line join **`Ctrl+Shift+J`**
- <ins>Move Line Up/Down</ins> **`Shift+Alt+Up/Down`**
- <ins>Move Statement Up/Down</ins> **`Shift+Ctrl+Up/Down`**
- <ins>Move Element Right/Left</ins> **`Shift+Ctrl+Alt+Left/Right`**

### 3. 코드 즉시보기
- Parameter info(within method call arguments) **`Ctrl+P`**
- Open quick definition lookup **`Ctrl+Shift+I`**
- Quick documentation lookup **`Ctrl+Q`**
- Ultimate 버전 - Quick Definition, Documentation를 web 파일에서도 사용 가능
    - JS파일의 경우 MDN Doc 내용이 JS의 문서로 나옴

## [2] 포커스
### 1. 포커스 에디터
- <ins>Move Caret to Next Word</ins> **`Ctrl+Left/Right`**
- <ins>Move Caret to Next Word with Selection</ins> **`Shift+Ctrl+Left/Right`**
- <ins>Move Caret to End of Line</ins> **`Home/End`**
- <ins>Move Caret to End of Line with Selection</ins> **`Shift+Home/End`**
- <ins>Move Caret to Page End</ins> **`PageUp/ PageDown`**

### 2. 포커스 특수키
- Extend selection **`Ctrl+W`**
- Shrink selection **`Shift+Ctrl+W`**
- Navigate back/forward **`Ctrl+Alt+Left/Right`**
- <ins>Multi Cursor</ins> **`Ctrl+Ctrl+Up/Down`**
- Next/previous highlighted error **`F2/Shift+F2`**

## [3] 검색
### 1. 검색 텍스트
- Find **`Ctrl+F`**
- Replace **`Ctrl+R`**
- Find in path **`Ctrl+Shift+F`**
- Replace in path **`Ctrl+Shift+R`**
- <ins>정규표현식으로 검색/교체</ins> - `\/tmfdk333\/([A-Za-z]*)\/app.js` → `\/inflearn\/$1\/app.js`

### 2. 검색 기타
- Go to file **`Ctrl+Shift+N`**
    - 패키지명까지 포함해서 검색 가능 - sp2/Member
- Go to symbol **`Ctrl+Alt+Shift+N`**
- Find Action **`Ctrl+Shift+A`**
    - Intellij에서 할 수 있는 모든 Event와 Option을 찾을 수 있음 - rename, theme
- Recent files popup **`Ctrl+E`**
- <ins>Recently change files</ins> **`Ctrl+Shift+E`**

## [4] 자동완성
### 1. 자동완성
- Basic code completion **`Ctrl+Space`**
- Smart code completion **`Ctrl+Shift+Space`**
- Show intention actions and quick-fixes **`Alt+Enter`**
- <ins>Static method completion</ins> **`Ctrl+Space*2`**
- Generate code **`Alt+Insert`**
    - 새로운 파일 생성 뿐만 아니라 Getter/Setter/생성자 자동 완성에서도 사용
- Implement methods **`Ctrl+I`**

### 2. Live Template
- `psvm`, `sout`, `ifn`, `inn`, `foreach`, `itar`, `iter`, `prsf`
- Insert Live Template **`Ctrl+J`**
- Custom Live Template 추가하기
    - Ctrl+Shift+A → live templates/Setting → other → + 
        - other/output/plain은 JAVA에서도 쓸 수 있는 플러그인 
    - Abbreviation: ent, Description: Entity Class Header, Template Text 입력, Define: Java

## [5] 리팩토링
### 1. 리팩토링 Extract
- Extract Variable **`Ctrl+Alt+V`**
- Extract Parameter **`Ctrl+Alt+P`**
    - Replace all occurrences
    - Delegate via overloading method - Overloading 메소드를 하나 더 만들어서 파라미터로 추출 
- Extract Method **`Ctrl+Alt+M`**
- Move **`F6`** - 이너클래스 추출할 때에도 사용됨
 
### 2. 리팩토링 기타
- Rename **`Shift+F6`** - Class, Method, Variable, Field, Parameter
- <ins>Type Migration</ins> **`Ctrl+Shift+F6`**
- Optimize imports **`Ctrl+Alt+O`**
    - 전체 코드에서 자동으로 Optimize imports: Ctrl+Shift+A → optimize imoprts on → ON
- Reformat code **`Ctrl+Alt+L`**

## [6] 디버깅

> - ProductService의 line16에 BreakPoint - ProductService의 register메소드를 기준으로 Test 진행
>     - ProductService 코드 설명
>         - savedProduct는 productRepository를 통해 DB에 save한 후의 결과물
>         - productRepository는 productService의 class 멤버 변수

- Toggle breakpoint **`Ctrl+F8`**
- Debug context configuration from editor **`NONE`** **`Ctrl+Shift+D`** 
- Debug **`Ctrl+D`** **`Shift+F9`**
- Resume **`F9`** - 다음 BreakPoint로 이동
    - BreakPoint에 의해 멈춘 라인은 아직 실행 되기 전
    - Call Stack - 현재 BreakPoint까지 어떤 Library/Framework/Method가 실행되었는지 보여줌
    - Variables - 현재 BreakPoint에서 볼 수 있는 모든 값
        - BreakPoint를 이용해 Variable에서 변화를 확인하면 결과값이나 코드의 흐름을 파악할 수 있음
- Step Over **`F8`** - 현재 BreakPoint가 걸려 있는 상태의 다음 줄로 이동
- Step Into **`F7`** - 현재 BreakPoint가 걸려 있는 줄에서 다음에 실행될 메소드로 이동
- Step Out **`Shift+F8`** - Step Into로 들어왔을 때, 다시 현재 BreakPoint로 Focus 이동

> - ConditionalBreakTest의 line19에 BreakPoint

- <ins>Conditional Break</ins>: BreakPoint를 건 상태에서 rightClick 후 Condition에 조건 입력
    - "자바 ORM 표준 JPA 프로그래밍".equals(book.title) 
    - for문에서 BreakPoint를 걸 때 특정 값에만 Break되도록 할 때 등에 사용

> - ProductServiceTest의 line44에 BreakPoint
>     - productRepository `DAO`, save `Insert DB`, findByName `DB에서 운동화로 된 컬럼 찾기`
>     - findByName을 사용하기 전에, productRepository로 넣은 3개의 값을 확인하고 싶을 때

- Evaluate Expression **`Alt+F8`** - 현재 Break가 걸려있는 상태에서 코드를 실행해 볼 수 있음
    - DB를 직접 확인하지 않고, 전체 데이터를 불러오고 싶지만 테스트 코드를 작성하기에 애매할 때
        - product, service 코드에 넣지 않아도 되는 것들 
    - 현재 Break된 상태에서 쓸 수 있는 모든 코드를 다 쓸 수 있고 연산까지도 가능
        - `productRepository.findAll()`, `productRepository.findAll().size()`, `productRepository.findAll().get(0).getAmount()+100`
    - 창을 새로 열 때마다 초기화 됨
- <ins>Watch</ins> **`Insert`**
    - product(지역변수)가 값이 어떻게 변하는지 Line별로 실시간으로 확인할 때 사용
    - `product;` 선언 - Cannot find local variable 'product': 아직 44번 줄이 실행되지 않았기 때문.
    -  Step Over로 넘기면 product에 값이 채워져 있는 것을 볼 수 있음
- 정리
    - Evaluate Expression - 현재 Break된 상태에서 단발성으로 쓸 수 있는 코드들을 사용
    - Watch - Variables에서 Break된 시점부터 다음 Break까지 실시간으로 값이 변하는 것을 확인 가능
    - 라이브러리/프레임워크를 분석할 때 매우 도움이 됨

## [7] Git&Github
### 1. Git 기본 기능 사용하기
- <ins>Git View On</ins> **`Alt+9`** or **`View → Tool Windows → Version Control`**
    - Local Changes - 최종 버전에서 어떤 파일들이 변경되었는지 확인 가능
        - Show Diff `Ctrl+D` - 변경전/변경후, Diff 화면에서 비교하며 수정 가능
        - Revert `Ctrl+Alt+Z` - 변경 내역을 취소
    - Log - 현재 프로젝트의 Git 상태를 확인할 수 있음
        - Commit Log를 우클릭을 하면 Commit 관련 기능(revert, branch, cherry-pick)을 사용 가능
        - Commit Log, 파일 변경목록, commit message, 변경한 사람, 시간, 브랜치 등을 볼 수 있음
    - Console - IntelliJ에서 사용한 Git 명령어들이 Cmd에서 어떻게 실행됐는지 로그를 보여줌
        - Commit, Diff, CheryPick의 모든 내용이 기록으로 남으므로 오류가 났을 때는 Console을 확인 
- <ins>Git Option Popup</ins> **`Alt+BackQuart`**
    - Branch **`Ctrl+Shift+BackQuart`**, Git History **`NONE`**
    - Git Pull **`NONE`** or **`Ctrl+Shift+A → git pull/VCS → Pull Changes  → Pull`**
        - 어떤 내역이 pull받으면서 변경되었는지 확인 가능 
    - Commit **`Ctrl+K`**
        - Before Commit - Reformat code(코드 재정렬), Rearrange code
        - Perform code analysis - SonarLint, FindBugs를  Commit 할 때마다 돌려볼 수 있음
    - Push **`Ctrl+Shift+K`**
        - 새로 만든 파일(Unversioned Files)은 Commit and Push가 불가능하므로 따로 Commit 후 Push

### 2. Github 연동하기
- <ins>기존 프로젝트에 Github 연동하기</ins>
    - Ctrl+Shift+A → share github → Share Project on Github → Login to Github
        - Auth Type: Password(보안 문제로 인해 SSH를 사용을 권장), Login/Password, Save credentials
        - New repository name, Remote name, Description
        - Add Files For Initial Commit, Commit Message
- <ins>Github 프로젝트 Clone 받기</ins>
    - Welcome to IntelliJ IDEA → Check out from Version Control → Git → URL 입력
        - Login을 하면 Project URL 정보를 볼 수 있음
    - Import Project → Gradle
        - Use gradle 'wrapper' task configuration 

## [8] 플러그인
- 플러그인 설치: **`Ctrl+Shift+A`** → plugins → Plugins/Settings → sortBy:Downloads
- 추천 플러그인 
    - .gitignore: color, 자동완성, Framework나 Language에서 지원하는 ignore파일도 사용 가능
    - Presentation Assistant: 단축키가 윈도우에서 어떻게 뜨는지 보여줌(발표나 시연할 때 좋음)
    - BashSupport: Shell 파일을 만들 때가 많은데, intelliJ는 쉘파일을 지원하지 않음(ignore처럼)
    - Material Theme UI: 개인의 취향에 따라 선택
    - Translator: 번역 플러그인 - 강사(jojoldu)가 직접 제작한 플러그인, option+1/2/3
- <ins>터미널 사용</ins> **`Alt+F12`**

## [9] Appendix - 소개
### 1. 강의 소개
- 개발자의 자기계발: 사이드 프로젝트, 새로운 개발 언어, 새로운 프레임워크
- 본인의 생산성이 낮은 상황이라면 공부 방법을 조금은 우회해도 좋지 않을까?
- 생산성이 높아진다(IDEA 사용방법, 단축키를 잘 안다)면 조금 더 공부할 수 있는 양이 늘어날 것
    - 같은 시간 내에 뽑아낼 수 있는 코드의 양이 다름(노가다의 양이 감소)

### 2. Toolbox 소개
- [Jetbrains](https://www.jetbrains.com)에서 Toolbox 설치 
    - 설치한/설치할 수 있는 제품을 한눈에 볼 수 있음
    - Toolbox의 Settings를 통해 각 제품의 설정 변경 가능
        - Maximum heap size, Update to(Release, EAP - Preview)
- **Community**: Java, Groovy, Gradle, Git 사용 가능
    - Web에 관련된 Servlet, Tomcat, Spring, Spring Boot, JSP, JS는 사용할 수 없음
- **Ultimate**: Web에 관련된 모든 것들을 사용 가능, 대부분의 회사에서 지원

### 3. 프로젝트 생성
1. Do not import settings → Darcula/Light → I've never used IDEA → Next → Next → Next → Start
    - Create Launcher Script `None`
    - Tune IDEA to your tasks `None` - Plugins: Maven, Gradle, Git, JUnit
    - Download featured plugins `None`
2. Create New Project → Gradle(Project Template)/Java
     - JUnit(Test Code Library), Apache Common Lang(Utility library) 추가를 위해 Gradle 사용
     - Maven/Gradle(의존성 관리 환경)을 쓰지 않으면 직접 jar 파일을 받아서 추가하기 때문
3. GroupId(프로젝트 그룹): com.tmfdk333.inflearn, ArtifactId(그룹의 하위 모듈): intellij-guide
4. Group modules: using explict module groups
5. Project location 설정
6. 프로젝트 생성 후 추가 설정
     - Gradle projects need to be imported: Enable Auto-import
     - Ctrl+Shift+A → plugins → Presentation Assistant → Install

## [10] Reference
- [jojoldu/community-guide](https://github.com/jojoldu/community-guide)
- [ntelliJ를 시작하시는 분들을 위한 IntelliJ 가이드](https://www.inflearn.com/course/intellij-guide/)
- [IntellijIDEA_ReferenceCard.pdf](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)