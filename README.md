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