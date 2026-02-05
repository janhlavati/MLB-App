import { Link, NavLink } from "react-router-dom"
import LogoPL from '../../assets/images/mlb.jpg'
import { useState } from 'react'

const Sidebar = () => {
    const [showNav, setShowNav] = useState(false);
    return (
        <div className='nav-bar'>
            <Link className="logo" to="/">
                <img src={LogoPL} alt="logo" style={{ width: 300, height: 'auto' }} />
            </Link>
            <div className="hamburger-icon" onClick={() => setShowNav(true)} />
        </div>
    )
}

export default Sidebar