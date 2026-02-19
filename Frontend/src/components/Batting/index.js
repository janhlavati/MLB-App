import React, { useState, useEffect } from 'react';
import axios from 'axios';

const DataHandling = () => {
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [pitcherData, setPitcherData] = useState([]);

    useEffect(() => {
        const params = new URLSearchParams(window.location.search);
        const teamValue = params.get('team');

        if(teamValue) {
            axios.get(`http://localhost:8080/api/data?team=${encodeURIComponent(teamValue)}`)
            .then(response => {
                setPitcherData(response.data.pitcherData);
                setLoading(false);
            })
            .catch(error => {
                console.error("Error fetching data:", error);
                setPitcherData([]);
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
            <pre>{JSON.stringify(pitcherData, null, 2)}</pre>
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
                        <th>WOBA</th>
                        <th>WRC+</th>
                        <th>TB</th>
                        <th>GDP</th>
                        <th>HBP</th>
                        <th>SH</th>
                        <th>SF</th>
                        <th>IBB</th>
                        <th>Awards</th>
                        <th>Team</th>
                    </tr>
                </thead>

                <tbody>
                    {pitcherData.map((batter) => (
                        <tr key={batter.name + batter.team}>
                            <td>{batter.name}</td>
                            <td>{batter.age}</td>
                            <td>{batter.pos}</td>
                            <td>{batter.g}</td>
                            <td>{batter.pa}</td>
                            <td>{batter.ab}</td>
                            <td>{batter.percentage}</td>
                            <td>{batter.era}</td>
                            <td>{batter.g}</td>
                            <td>{batter.gs}</td>
                            <td>{batter.gf}</td>
                            <td>{batter.cg}</td>
                            <td>{batter.sho}</td>
                            <td>{batter.sv}</td>
                            <td>{batter.ip}</td>
                            <td>{batter.h}</td>
                            <td>{batter.r}</td>
                            <td>{batter.er}</td>
                            <td>{batter.hr}</td>
                            <td>{batter.bb}</td>
                            <td>{batter.ibb}</td>
                            <td>{batter.so}</td>
                            <td>{batter.hbp}</td>
                            <td>{batter.bk}</td>
                            <td>{pitcher.wp}</td>
                            <td>{pitcher.bf}</td>
                            <td>{pitcher.eraPlus}</td>
                            <td>{pitcher.fip}</td>
                            <td>{pitcher.whip}</td>
                            <td>{pitcher.h9}</td>
                            <td>{pitcher.hr9}</td>
                            <td>{pitcher.bb9}</td>
                            <td>{pitcher.so9}</td>
                            <td>{pitcher.so_bb}</td>
                            <td>{pitcher.awards}</td>
                            <td>{pitcher.team}</td>
                        </tr>))}<br />
                        </tbody>
            </table>
        </div>
    );
}
export default DataHandling;