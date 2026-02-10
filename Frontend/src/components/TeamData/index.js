import React, { useState, useEffect } from 'react';
import './index.scss';
import axios from 'axios';

const TeamData = () => {
    const[loading, setLoading] = useState(true);
    const[error, setError] = useState(null);
    const[playerData, setPlayerData] = useState([]);
    const[playersToShow, setPlayersToShow] = useState(10);
    const[letterClass] = useState('text-animate');

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const teamValue = params.get('team');
        const positionValue = params.get('position');
        const nameValue = params.get('name');

        if (teamValue) {
            axios.get(`http://localhost:8080/api/pitchers?team=${encodeURIComponent(teamValue)}`)
            .then(response => {
                setPlayerData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else if (positionValue) {
            axios.get(`http://localhost:8080/api/pitchers?position=${encodeURIComponent(positionValue)}`)
            .then(response => {
                setPlayerData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else if (nameValue) {
            axios.get(`http://localhost:8080/api/pitchers?name=${encodeURIComponent(nameValue)}`)
            .then(response => {
                setPlayerData(response.data);
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
                    {playerData.slice(0, playersToShow).map(player =>(
                        <tr key={player.name + player.team}>
                            <td>{player.name || "N/A"}</td>
                            <td>{player.age || 0}</td>
                            <th>{player.pos || "N/A"}</th>
                            <th>{player.war || 0}</th>
                            <th>{player.w || 0}</th>
                            <th>{player.l || 0}</th>
                            <th>{player.percentage || 0}</th>
                            <th>{player.era || 0}</th>
                            <th>{player.g || 0}</th>
                            <th>{player.gs || 0}</th>
                            <th>{player.gf || 0}</th>
                            <th>{player.cg || 0}</th>
                            <th>{player.sho || 0}</th>
                            <th>{player.sv || 0}</th>
                            <th>{player.ip || 0}</th>
                            <th>{player.h || 0}</th>
                            <th>{player.r || 0}</th>
                            <th>{player.er || 0}</th>
                            <th>{player.hr || 0}</th>
                            <th>{player.bb || 0}</th>
                            <th>{player.ibb || 0}</th>
                            <th>{player.so || 0}</th>
                            <th>{player.hbp || 0}</th>
                            <th>{player.bk || 0}</th>
                            <th>{player.wp || 0}</th>
                            <th>{player.bf || 0}</th>
                            <th>{player.eraPlus || 0}</th>
                            <th>{player.fip || 0}</th>
                            <th>{player.whip || 0}</th>
                            <th>{player.h9 || 0}</th>
                            <th>{player.hr9 || 0}</th>
                            <th>{player.bb9 || 0}</th>
                            <th>{player.so9 || 0}</th>
                            <th>{player.so_bb || 0}</th>
                            <th>{player.awards || "N/A"}</th>
                            <th>{player.team || "N/A"}</th>
                        </tr>
                    ))}
                    
                </tbody>
            </table>
        </div>
    )
}

export default TeamData;