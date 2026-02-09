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
            axios.get(`http://localhost:8080/api/pitchers?team=${encodeURIComponent(teamValue)}`)
            .then(response => {
                setPitcherData(response.pitcherData);
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
                    {pitcherData.map((pitcher) => (
                        <tr key={pitcher.name + pitcher.team}>
                            <td>{pitcher.name}</td>
                            <td>{pitcher.age}</td>
                            <td>{pitcher.pos}</td>
                            <td>{pitcher.war}</td>
                            <td>{pitcher.w}</td>
                            <td>{pitcher.l}</td>
                            <td>{pitcher.percentage}</td>
                            <td>{pitcher.era}</td>
                            <td>{pitcher.g}</td>
                            <td>{pitcher.gs}</td>
                            <td>{pitcher.gf}</td>
                            <td>{pitcher.cg}</td>
                            <td>{pitcher.sho}</td>
                            <td>{pitcher.sv}</td>
                            <td>{pitcher.ip}</td>
                            <td>{pitcher.h}</td>
                            <td>{pitcher.r}</td>
                            <td>{pitcher.er}</td>
                            <td>{pitcher.hr}</td>
                            <td>{pitcher.bb}</td>
                            <td>{pitcher.ibb}</td>
                            <td>{pitcher.so}</td>
                            <td>{pitcher.hbp}</td>
                            <td>{pitcher.bk}</td>
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