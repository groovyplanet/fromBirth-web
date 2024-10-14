import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter } from "react-router-dom";
import Layout from "../../layout/Layout";
import '../../../resources/static/css/common/Main.css';
import Menu from "../../layout/Menu";

const Main = () => {
    return (
        <Layout>
        <div className="main-container">
            {/* 프로필*/}
            <div className="profile-section">
                <div className="profile-picture">
                    <i className="bi bi-person-circle fs-3"></i>
                </div>
                <div className="profile-dropdown">
                    <span>만 0세 홍길동</span>
                    <i className="arrow-down"></i>
                </div>
            </div>

            {/* 성장기록 */}
            <div className="record-section">
                <div className="record-item">
                    <span className="label">키</span>
                    <span className="value average">64.8 cm</span>
                </div>
                <div className="record-item">
                    <span className="label">몸무게</span>
                    <span className="value higher">11.2 kg</span>
                </div>
            </div>

            {/* 컨텐츠 박스 */}
            <div className="content-box">육아일기</div>
            <div className="content-box">주간보고</div>
            <div className="content-box">성장분석</div>
        </div>
        </Layout>
    );
};


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <BrowserRouter>
        <Main/>
    </BrowserRouter>
);
