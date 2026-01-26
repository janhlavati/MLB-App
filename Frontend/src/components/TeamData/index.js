import { use } from "react";

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
                        <th>Team</th>
                        <th>Position</th>
                        <th>Games Played</th>
                        <th>Batting Average</th>
                        <th>Home Runs</th>
                        <th>RBIs</th>
                    </tr>
                </thead>
                <tbody>
                    
                </tbody>
            </table>
        </div>
    )
}