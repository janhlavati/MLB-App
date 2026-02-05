import { Link, NavLink } from "react-router-dom"
import LogoPL from '../../assets/images/mlb.jpg'
import './index.scss'
import { useState } from 'react'

const Sidebar = () => {
    const [showNav, setShowNav] = useState(false);
    return (
        <div className='nav-bar'>
            <Link className="logo" to="/">
                <img src={LogoPL} alt="logo" style={{ width: 50, padding:20, height: 'auto' }} />
            </Link>
            <div className="hamburger-icon" onClick={() => setShowNav(true)} />
            <h1>Major League Baseball</h1>
        </div>
    )
}

export default Sidebar