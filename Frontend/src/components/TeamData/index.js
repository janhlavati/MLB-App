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
            axios.get(`http://localhost:5050/api/players?team=${encodeURIComponent(teamValue)}`)
            .then(response => {
                setPlayerData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else if (positionValue) {
            axios.get(`http://localhost:5050/api/players?position=${encodeURIComponent(positionValue)}`)
            .then(response => {
                setPlayerData(response.data);
                setLoading(false);
            })
            .catch(error => {
                setError(error);
                setLoading(false);
            });
        } else if (nameValue) {
            axios.get(`http://localhost:5050/api/players?name=${encodeURIComponent(nameValue)}`)
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
                        <th>Team</th>
                        <th>League</th>
                        <th>WAR</th>
                        <th>Games Played</th>
                        <th>PA</th>
                        <th>AB</th>
                        <th>R</th>
                        <th>H</th>
                        <th>2B</th>
                        <th>3B</th>
                        <th>HR</th>
                        <th>RBI</th>
                        <th>SB</th>
                        <th>CS</th>
                        <th>BB</th>
                        <th>SO</th>
                        <th>BA</th>
                        <th>OBP</th>
                        <th>SLG</th>
                        <th>OPS</th>
                        <th>OPS+</th>
                        <th>rOBA</th>
                        <th>rBAT+</th>
                        <th>TB</th>
                        <th>GIDP</th>
                        <th>HBP</th>
                        <th>SH</th>
                        <th>SF</th>
                        <th>IBB</th>
                        <th>Position</th>
                        <th>Awards</th>
                    </tr>
                </thead>
                <tbody>
                    {playerData.slice(0, playersToShow).map(player =>(
                        <tr key={player.name}>
                            <td>{player.name || "N/A"}</td>
                            <td>{player.age || 0}</td>
                            <th>Team</th>
                            <th>League</th>
                            <th>WAR</th>
                            <th>Games Played</th>
                            <th>PA</th>
                            <th>AB</th>
                            <th>R</th>
                            <th>H</th>
                            <th>2B</th>
                            <th>3B</th>
                            <th>HR</th>
                            <th>RBI</th>
                            <th>SB</th>
                            <th>CS</th>
                            <th>BB</th>
                            <th>SO</th>
                            <th>BA</th>
                            <th>OBP</th>
                            <th>SLG</th>
                            <th>OPS</th>
                            <th>OPS+</th>
                            <th>rOBA</th>
                            <th>rBAT+</th>
                            <th>TB</th>
                            <th>GIDP</th>
                            <th>HBP</th>
                            <th>SH</th>
                            <th>SF</th>
                            <th>IBB</th>
                            <th>Position</th>
                            <th>Awards</th>
                        </tr>
                    ))}
                    
                </tbody>
            </table>
        </div>
    )
}

export default TeamData;