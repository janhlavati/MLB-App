import React, { useState, useEffect } from 'react';
import axios from 'axios';

const BatterHandling = () => {
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [batterData, setBatterData] = useState([]);
    const [battersToShow, setBattersToShow] = useState(10);

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const teamValue = params.get('team');

        if (teamValue) {
            axios.get(`http://localhost:8080/api/batters?team=${encodeURIComponent(teamValue)}`)
                .then(response => {
                    setBatterData(response.data);
                    setLoading(false);
                })
                .catch(error => {
                    setError(error);
                    setBatterData([]);
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
                <span className="text-animate">Batter Data of {batterData.length > 0 ? batterData[0].team : "Unknown Team"}</span>
            </h1>

            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Position</th>
                        <th>G</th>
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
                        <th>TB</th>
                        <th>HBP</th>
                        <th>SH</th>
                        <th>SF</th>
                        <th>IBB</th>
                        <th>Awards</th>
                        <th>Team</th>
                    </tr>
                </thead>

                <tbody>
                    {batterData.slice(0, battersToShow).map((batter) => (
                        <tr key={batter.name + batter.team}>
                            <td>{batter.name || "N/A"}</td>
                            <td>{batter.age || 0}</td>
                            <td>{batter.pos || "N/A"}</td>
                            <td>{batter.g || 0}</td>
                            <td>{batter.pa || 0}</td>
                            <td>{batter.ab || 0}</td>
                            <td>{batter.r || 0}</td>
                            <td>{batter.h || 0}</td>
                            <td>{batter.doubles || 0}</td>
                            <td>{batter.triples || 0}</td>
                            <td>{batter.hr || 0}</td>
                            <td>{batter.rbi || 0}</td>
                            <td>{batter.sb || 0}</td>
                            <td>{batter.cs || 0}</td>
                            <td>{batter.bb || 0}</td>
                            <td>{batter.so || 0}</td>
                            <td>{batter.ba || 0}</td>
                            <td>{batter.obp || 0}</td>
                            <td>{batter.slg || 0}</td>
                            <td>{batter.ops || 0}</td>
                            <td>{batter.opsPlus || 0}</td>
                            <td>{batter.tb || 0}</td>
                            <td>{batter.hbp || 0}</td>
                            <td>{batter.sh || 0}</td>
                            <td>{batter.sf || 0}</td>
                            <td>{batter.ibb || 0}</td>
                            <td>{batter.awards || "N/A"}</td>
                            <td>{batter.team || "N/A"}</td>
                        </tr>))}
                </tbody>
            </table>
            {battersToShow < batterData.length ? (
                <button onClick={() => setBattersToShow(batterData.length)}>Load All Batters</button>
            ) : (
                <button onClick={() => setBattersToShow(10)}>Show Less</button>
            )}

        </div>
    );
}

export default BatterHandling;