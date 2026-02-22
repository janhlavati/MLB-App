import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import Loadert from 'react-loaders';

const Home = () => {

    return (
        <>
            <div className="container-home-page">
                <div className="text-zone" style={{ textAlign: 'center' }}>
                    <b><h1 style={{ display: 'block', border: '1px solid rgba(255, 255, 255, 0.3)', borderRadius: '20px', marginBottom: '20px', padding: '10px', fontSize: '48px', backgroundColor: '#4357ee',  }}>MLB Stats</h1></b>
                    <Link to="/teamPitching" className="flat-button" style={{margin: '10px', fontSize: '18px', font: 'caption', color: '#ffffffff' }}>Pitchers</Link>
                    <Link to="/teamBatting" className="flat-button" style={{margin: '10px', fontSize: '18px', font: 'caption', color: '#ffffffff' }}>Batters</Link>
                </div>
            </div>
            <Loadert type="pacman" />
        </>
    )
}

export default Home;