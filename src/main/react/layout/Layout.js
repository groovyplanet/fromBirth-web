import React from 'react';
import Menu from './Menu';
import '../../resources/static/css/common/Layout.css';

const Layout = ({ children }) => {
    return (
        <div>
            <main>{children}</main>
            <Menu />
        </div>
    );
};

export default Layout;
