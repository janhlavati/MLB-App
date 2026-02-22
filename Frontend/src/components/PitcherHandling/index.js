import React, { useState, useEffect } from 'react';
import './index.scss';
import axios from 'axios';

const PitcherHandling = () => {
    const[loading, setLoading] = useState(true);
    const[error, setError] = useState(null);
    const[pitcherData, setPitcherData] = useState([]);
    const[pitchersToShow, setPitchersToShow] = useState(10);
    const[letterClass] = useState('text-animate');

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const teamValue = params.get('team');
        const positionValue = params.get('position');
        const nameValue = params.get('name');

        if (teamValue) {
            axios.get(`http://localhost:8080/api/pitchers?team=${encodeURIComponent(teamValue)}`)
            .then(response => {
                setPitcherData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else if (positionValue) {
            axios.get(`http://localhost:8080/api/pitchers?position=${encodeURIComponent(positionValue)}`)
            .then(response => {
                setPitcherData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else if (nameValue) {
            axios.get(`http://localhost:8080/api/pitchers?name=${encodeURIComponent(nameValue)}`)
            .then(response => {
                setPitcherData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else {
            setLoading(false);
        }
    }, []);

    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error: {error.message}</div>;
    }
    
    return (
        <div className="table-container">
            <h1>
                <span className={letterClass}>Pitcher Data of {pitcherData.length > 0 ? pitcherData[0].team : "Unknown Team"}</span>
            </h1>

            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Position</th>
                        <th>WAR</th>
                        <th>Wins</th>
                        <th>Losses</th>
                        <th>W-L%</th>
                        <th>ERA</th>
                        <th>G</th>
                        <th>GS</th>
                        <th>GF</th>
                        <th>CG</th>
                        <th>SHO</th>
                        <th>SV</th>
                        <th>IP</th>
                        <th>H</th>
                        <th>R</th>
                        <th>ER</th>
                        <th>HR</th>
                        <th>BB</th>
                        <th>IBB</th>
                        <th>SO</th>
                        <th>HBP</th>
                        <th>BK</th>
                        <th>WP</th>
                        <th>BF</th>
                        <th>ERA+</th>
                        <th>FIP</th>
                        <th>WHIP</th>
                        <th>h9</th>
                        <th>HR9</th>
                        <th>BB9</th>
                        <th>SO9</th>
                        <th>SO/W</th>
                        <th>Awards</th>
                        <th>Team</th>
                    </tr>
                </thead>
                <tbody>
                    {pitcherData.slice(0, pitchersToShow).map(pitcher =>(
                        <tr key={pitcher.name + pitcher.team}>
                            <td>{pitcher.name || "N/A"}</td>
                            <td>{pitcher.age || 0}</td>
                            <th>{pitcher.pos || "N/A"}</th>
                            <th>{pitcher.war || 0}</th>
                            <th>{pitcher.w || 0}</th>
                            <th>{pitcher.l || 0}</th>
                            <th>{pitcher.percentage || 0}</th>
                            <th>{pitcher.era || 0}</th>
                            <th>{pitcher.g || 0}</th>
                            <th>{pitcher.gs || 0}</th>
                            <th>{pitcher.gf || 0}</th>
                            <th>{pitcher.cg || 0}</th>
                            <th>{pitcher.sho || 0}</th>
                            <th>{pitcher.sv || 0}</th>
                            <th>{pitcher.ip || 0}</th>
                            <th>{pitcher.h || 0}</th>
                            <th>{pitcher.r || 0}</th>
                            <th>{pitcher.er || 0}</th>
                            <th>{pitcher.hr || 0}</th>
                            <th>{pitcher.bb || 0}</th>
                            <th>{pitcher.ibb || 0}</th>
                            <th>{pitcher.so || 0}</th>
                            <th>{pitcher.hbp || 0}</th>
                            <th>{pitcher.bk || 0}</th>
                            <th>{pitcher.wp || 0}</th>
                            <th>{pitcher.bf || 0}</th>
                            <th>{pitcher.eraPlus || 0}</th>
                            <th>{pitcher.fip || 0}</th>
                            <th>{pitcher.whip || 0}</th>
                            <th>{pitcher.h9 || 0}</th>
                            <th>{pitcher.hr9 || 0}</th>
                            <th>{pitcher.bb9 || 0}</th>
                            <th>{pitcher.so9 || 0}</th>
                            <th>{pitcher.so_bb || 0}</th>
                            <th>{pitcher.awards || "N/A"}</th>
                            <th>{pitcher.team || "N/A"}</th>
                        </tr>
                    ))}
                </tbody>
            </table>
            <button onClick={() => setPitchersToShow(pitcherData.length)}>Load All Pitchers</button>
        </div>
    )
}

export default PitcherHandling;