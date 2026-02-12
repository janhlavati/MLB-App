import React, { useEffect, useState } from "react";
import Loader from "react-loaders";
import { Link } from 'react-router-dom';
import teamData from "../../data/teams.json";

const Teams = () => {
    const[searchQuery, setSearchQuery] = useState('');
    const[filteredTeams, setFilteredTeams] = useState(teamData.teams);   



    useEffect(() => {   
        const filtered = teamData.teams.filter(team =>
            team.title.toLowerCase().includes(searchQuery.toLowerCase())
        );

        setFilteredTeams(filtered);
    }, [searchQuery]);

        const handleSearchChange = event => {
            setSearchQuery(event.target.value);
        }

        const renderTeam = (teams) => {
            return (
                <div className="images-container">
                    {teams.map((team, idx) => (
                        <div key={idx} className="image-box">
                            <img src={team.cover} alt="teams" className="team-image" />
                            <div className="content">
                                <p className="team-title">{team.title}</p>
                                <Link className="btn" to={`/pitchers?team=${encodeURIComponent(team.title)}`}>View Details</Link>  
                              </div>
                        </div>
                    ))}
                </div>
            )
        }
    return (
        <>
        <div className="container teams-page">
            <div className="search-bar">  
                <input
                    type="text"
                    placeholder="Search teams..."
                    value={searchQuery}
                    onChange={handleSearchChange}
                />
            </div>
            <div>{renderTeam(filteredTeams)}</div>
        </div>
            <Loader type="pacman" />
        </>
    );
}

export default Teams;