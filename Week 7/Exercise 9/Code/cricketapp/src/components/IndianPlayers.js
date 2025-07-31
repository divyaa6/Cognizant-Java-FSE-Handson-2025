import React from 'react';

const IndianPlayers = () => {
  const T20 = ['Rohit', 'Virat', 'Pant', 'Hardik', 'Surya'];
  const Ranji = ['Gill', 'Sarfaraz', 'Rahane', 'Jadeja', 'Pujara'];

  const mergedPlayers = [...T20, ...Ranji];

  const oddPlayers = mergedPlayers.filter((_, i) => i % 2 !== 0);
  const evenPlayers = mergedPlayers.filter((_, i) => i % 2 === 0);

  return (
    <div>
      <h2>Even Team Players</h2>
      <ul>{evenPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h2>Odd Team Players</h2>
      <ul>{oddPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>
    </div>
  );
};

export default IndianPlayers;
