import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import Loadert from 'react-loaders';

const Home = () => {

    return (
        <>
            <div className="container-home-page">
                <div className="text-zone" style={{ textAlign: 'center' }}>
                    <b><h1 style={{ display: 'block', borderRadius: '0px', marginBottom: '20px', padding: '10px', fontSize: '48px', background: 'linear-gradient(360deg, #470476ff, #040039c8)' }}>Major League Baseball - Statistics</h1></b>
                    <Link to="/teams" className="flat-button" style={{ display: 'flex', justifyContent: 'center', color: 'black', fontSize: '18px', font: 'caption', color: '#ffffffff' }}>Get Started</Link>
                </div>
            </div>
            <Loadert type="pacman" />
        </>
    )
}

export default Home;