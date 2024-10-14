import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import '../../resources/static/css/common/Menu.css';

const Menu = () => {
    const [activeItem, setActiveItem] = useState('main'); // 초기 활성 메뉴 아이템 설정

    const handleItemClick = (item) => {
        setActiveItem(item); // 클릭한 메뉴 아이템을 활성화
    };

    return (
        <div className="menu-container">
            <div className={`menu-item ${activeItem === 'diary' ? 'active' : ''}`}>
                <Link to="/육아일기" onClick={() => handleItemClick('diary')} className="d-flex flex-column align-items-center">
                    <i className="bi bi-journal fs-2"></i> {/* Bootstrap 아이콘 */}
                    <span>육아일기</span>
                </Link>
            </div>
            <div className={`menu-item ${activeItem === 'weeklyreport' ? 'active' : ''}`}>
                <Link to="/주간보고" onClick={() => handleItemClick('weeklyreport')} className="d-flex flex-column align-items-center">
                    <i className="bi bi-clipboard fs-2"></i>
                    <span>주간보고</span>
                </Link>
            </div>
            <div className={`menu-item ${activeItem === 'main' ? 'active' : ''}`}>
                <Link to="/메인" onClick={() => handleItemClick('main')} className="d-flex flex-column align-items-center">
                    <i className="bi bi-house fs-2"></i>
                    <span>메인</span>
                </Link>
            </div>
            <div className={`menu-item ${activeItem === 'growth' ? 'active' : ''}`}>
                <Link to="/성장분석" onClick={() => handleItemClick('growth')} className="d-flex flex-column align-items-center">
                    <i className="bi bi-graph-up fs-2"></i>
                    <span>성장분석</span>
                </Link>
            </div>
            <div className={`menu-item ${activeItem === 'info' ? 'active' : ''}`}>
                <Link to="/내정보" onClick={() => handleItemClick('info')} className="d-flex flex-column align-items-center">
                    <i className="bi bi-person fs-2"></i>
                    <span>내정보</span>
                </Link>
            </div>
        </div>
    );
};

export default Menu;
