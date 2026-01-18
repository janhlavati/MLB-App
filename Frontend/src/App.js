import { use } from "react";
import { useEffect, useState } from "react";
import { Routes, Route, useLocation } from "react-router-dom";
import Layout from "./components/Layout";
import Home from "./components/Home";
import Teams from "./components/Teams";
import TeamData from "./components/TeamData";


function App() {
    const[players, setPlayers] = useState([]);
    const[loading, setLoading] = useState(true);
    const location = useLocation();

    useEffect(() => {
        document.title = "MLB Stats App";

        const generateFetchUrl = () => {
            let baseUrl = "http://localhost:5050/api/v1/player";
            const queryParams = new URLSearchParams(location.search);

            if (queryParams.toString()) {
                baseUrl += `?${queryParams.toString()}`;
            }
            return baseUrl;
        };

        const fetchPitchersAndBatters = async () => {
            try {
                const response = await fetch(generateFetchUrl());
                const data = await response.json();
                setPlayers(data);
            } catch (error) {
                console.error("Error fetching player data:", error);
            } finally {
                setLoading(false);
            }       
        };
        fetchPitchersAndBatters();
    }, [location]);
    return (
        <>
            <Routes>
                <Route path="/" element={<Layout />}>
                    <Route index element={<Home />} />
                    <Route path="teams" element={<Teams />} />
                    <Route path="data" element={<TeamData />} />
                </Route>
            </Routes>
        </>
    );
}
export default App;
