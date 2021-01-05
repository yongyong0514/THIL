
written by Yonggi Jeong<br>
reporting date 01.01.21

&nbsp;

![THIL](/web/psd/thil.png)

### 내가사는 그 집은 인테리어관련 기술을 가지고 있는 기술자들을 위한 1:1 매칭 사이트 입니다.
### 1:1 Matching website between the skilled workers and the customers for home rennovation.

&nbsp;

## 개발환경 Environment
* JAVA, JSP, JavaScript, jQuery, Json, Xml, Sql, HTML5, CSS, Ajax
* Eclipse, Oracle, Tomcat

&nbsp;

## 링크 Link
### Notion Development Log https://www.notion.so/yongyong0514/Project_THE-HOUSE-I-LIVE-858defca841946eb9c86c62fcd251bfa

### Figma UI https://www.figma.com/file/6ti7B3dkZhCibqRzG6iEp2/THIL

&nbsp;

## 시연 영상 YouTube Clip
* YouTube Link

&nbsp;

## 주요기능 Developed Functions
1. 회원 가입 및 로그인 회원 정보 수정, 사업자 회원으로 전환
<br>Sign-up, Log-in, My page, and approval function to be registered as a company

2. 고객 및 사업자 마이페이지 의뢰 내역 및 의뢰 관리, 관리자 페이지 구현
<br>Order list and order management for the customer and the companies. A
management page for the administrator.

3. 포트폴리오 및 1:1 질문 게시판
<br>Preview/Quotation page and 1:1 message board.

4. 메인 페이지 및 홈페이지 소개
<br>Main page and Introduction of the homepage

5. 고객이 선택한 인테리어 업종에서 사업자 선택 가능
<br>Selecting a company within the selected business category (by customers)

&nbsp;

## DB 디자인 DataBase Design
![THIL](/web/psd/thildb.png)

&nbsp;

## 담당역할 및 기여도 Main Responsibilities in the Project
팀장 - 프로젝트의 전반적인 제작과 진행을 관리했습니다. GitHub를 이용해 전체 프로젝트 형상관리를 수행했습니다.
<br>Development and management of the whole project as a leader.

* Figma를 활용한 전체 프로젝트 UI 설계 및 디자인
Project User Interface (UI) Design by using Figma

* 고객의 의뢰사항 구현
<br>Customer’s order page

* 사업자의 의뢰사항 구현
<br>Company’s order page

* 관리자 페이지 제작 및 데이터를 관리 구현
<br>Administrator’s management page

* 데이터베이스 설계 및 구현
<br>Database design and management

&nbsp;

## 프로젝트 담당 주요 내용 Project Overview

### 고객의 마이 페이지입니다. 현재 로그인 고객의 의뢰 진행상황을 볼 수 있습니다.
* 구현기능설명
<br>고객의 마이페이지에서는 고객이 시공을 의뢰한 내역을 볼 수 있습니다. 
하나의 시공 건 마다 시공 진행 상태에 따라 버튼이 활성화되며, 사업자와의 상호작용으로 결재하기와 완료하기, 리뷰 남기기가 가능합니다.
하나의 시공 건을 클릭하면, 의뢰 진행상황과 의뢰한 정보를 한눈에 확인할 수 있습니다.
고객이 의뢰 시 첨부한 사진과 사업자가 업로드한 계약서를 다운받을 수 있습니다.
![S1](/web/psd/S1.jpg)

&nbsp;

### 고객의 마이 페이지입니다. 결재하기 버튼으로 결재를 진행합니다.
* 구현기능설명 
<br>팝업 창으로 결재 정보를 입력 받을 수 있습니다.
결재 모듈과의 연동(미구현)으로 결재를 진행할 수 있으며, 결재하고자 하는 이용자의 견적금액과 시공날짜가 표시됩니다.
서버에는 계좌번호와 은행명, 현금영수증을 휴대폰으로 입력 받을지 카드번호로 입력 받을지, 이메일 주소 등 최소한의 결재정보를 다음 거래 및 환불을 위해 저장합니다.
![S2](/web/psd/S2.jpg)

&nbsp;

### 사업자의 마이 페이지입니다. 현재 로그인한 사업자 회원에게 들어온 의뢰 진행상황을 볼 수 있습니다.
* 구현기능설명 
<br>사업자의 마이페이지에서는 사업자에게 들어온 고객의 의뢰내역을 볼 수 있습니다.
고객과 마찬가지로 하나의 시공 건 마다 시공 진행 상태에 따라 버튼이 활성화되며, 고객과의 상호작용으로 의뢰 수락과 취소, 의뢰정보등록, 시공완료가 가능합니다.
하나의 시공 건을 클릭하면 의뢰 진행상황과 의뢰한 정보를 한눈에 확인할 수 있습니다.
고객이 의뢰 시 첨부한 사진과 사업자가 업로드한 계약서를 다운받을 수 있습니다.
![S3](/web/psd/S3.jpg)

&nbsp;

### 사업자의 마이 페이지입니다. 의뢰정보를 입력할 수 있습니다.
* 구현기능설명 
<br>팝업 창으로 의뢰 정보를 등록할 수 있습니다.
고객과의 계약서를 업로드 가능하며, 시공 시작일과 종료일, 고객의 결재를 위해 견적가를 입력하고 정보를 등록하면 다음 진행 상태인 시공 대기 상태로 변경됩니다.
시공이 완료되면 시공 완료 버튼으로 시공완료 처리할 수 있습니다.
![S4](/web/psd/S4.jpg)

&nbsp;

### 관리자의 로그인 페이지입니다. 별도의 관리자 아이디로 로그인합니다.
* 구현기능설명 
<br>관리자 페이지는 별도로 제작된 페이지로 관리자 아이디로 로그인 가능합니다.
로그인은 암호화 처리된 비밀번호로 로그인 됩니다.
로그인을 하게 되면, 관리자 페이지에 모두 import되어 있는 왼쪽바에서 세션 체크를 통해 관리자의 로그인 유무를 상시로 체크하게 됩니다.
로그인 세션이 만료되거나 별도의 관리자 창에서 로그아웃시, 로그인 페이지로 이동하게 됩니다.
![S5](/web/psd/S5.jpg)

&nbsp;

### 관리자 첫 페이지는 각 게시판들의 최신 글을 볼 수 있으며 관리 가능합니다. 모든 게시글을 관리할 수 있으며, 고객, 사업자 요청에 따라 의뢰에 개입할 수 있습니다
* 구현기능설명 
<br>관리자 페이지에서는 시공 완료된 내역을 볼 수 있으며, 시공 완료 내역을 클릭해서 정해진 입금 날짜에 시공완료 처리를 하는 작업이 가능합니다.
사업자 전환 신청 내역을 클릭해서 사업자 전환 신청을 고객들의 상태를 사업자로 변경하거나 거절할 수 있습니다.
1:1 문의와 빠른 문의내역을 확인할 수 있습니다.
각각의 게시물들을 최신 5개순으로 볼 수 있습니다.
![S6](/web/psd/S6.jpg)

&nbsp;

### 관리자 페이지의 의뢰관리 페이지입니다. 의뢰의 한 건을 클릭해 관리합니다.
* 구현기능설명 
<br>의뢰관리 페이지에서는 서버에 기록되어 있는 모든 의뢰내역을 볼 수 있습니다.
한 건을 클릭해 현재 의뢰 정보를 한눈에 볼 수 있으며, 고객과 사업자에게 보이지 않는 하단의 컨트롤 버튼이 관리자에게 활성화됩니다.
하단의 컨트롤 버튼으로 송금 처리 및 결재정보수정, 결재취소와 거래취소가 가능합니다.
각각의 버튼을 사용할 때는 사유를 입력해야 하며, 입력된 사유는 메모 공간에 기록됩니다.
![S7](/web/psd/S7.jpg)

&nbsp;

### 관리자 페이지의 회원관리 페이지입니다.
* 구현기능설명 
<br>관리자 페이지의 회원관리 페이지에서는 모든 고객의 기본 정보 및 의뢰정보를 볼 수 있습니다.
하나의 고객을 클릭하면, 고객의 의뢰한 내역과 문의내역을 확인할 수 있습니다.
고객의 개인정보를 수정할 수 있습니다.

![S8](/web/psd/S8.jpg)

&nbsp;

### 관리자 페이지의 사업자관리 페이지입니다.
* 구현기능설명 
<br>관리자 페이지의 사업자관리 페이지에서는 모든 사업자의 기본 정보 및 의뢰정보를 볼 수 있습니다.
하나의 사업자를 클릭하면, 사업자에게 의뢰된 내역을 확인할 수 있습니다.
고객이 사업자 전환의뢰를 한 경우, 사업자 대기 상태로 사업자관리에 등록되며 사업자 회원 전환 버튼으로 사업자 전환시키거나 거절할 수 있습니다.
![S9](/web/psd/S9.jpg)

&nbsp;

### 관리자 페이지의 빠른 상담관리 페이지입니다.
* 구현기능설명 
<br>관리자 페이지의 빠른 상담관리페이지에서는 고객이 메인 페이지에서 빠른 상담 신청으로 의뢰한 내역을 볼 수 있습니다.
그 밖의 파일관리, 1:1문의, 리뷰관리, 포트폴리오 관리, 알림 관리는 같은 구조로 모든 내역을 볼 수 있습니다.
![S10](/web/psd/S10.jpg)
