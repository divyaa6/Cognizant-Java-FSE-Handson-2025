import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 40 },
    { name: 'Dhoni', score: 95 },
    { name: 'Kohli', score: 68 },
    { name: 'Jadeja', score: 55 },
    { name: 'Hardik', score: 73 },
    { name: 'Rahul', score: 64 },
    { name: 'Pant', score: 72 },
    { name: 'Ashwin', score: 36 },
    { name: 'Bumrah', score: 59 },
    { name: 'Shami', score: 90 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
      <h3>Players with score below 70:</h3>
      <ul>
        {lowScorers.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
