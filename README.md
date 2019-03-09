# Inflearn - IntelliJ Guide

![IntelliJIDEA_ReferenceCard_Win.png](https://github.com/tmfdk333/intellij-guide/blob/master/images/IntelliJIDEA_ReferenceCard_Win.png)

> Reference Card에 없는 것 - <ins>명령어 설명</ins>

## [1] 코드 Edit
### 1. 메인메소드 생성 및 실행
- src/main/java - 평균적인 java의 디렉토리 구조
    - Directory `/`, Package `.` 로 하위 계층을 구분
- Generate Code **`Alt+Insert`**
- Live Template(Code Template) `psvm`, `sout`
- Select configuration and run **`Alt+Shift+F10`**
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