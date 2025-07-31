import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function login() {
    setIsLoggedIn(true);
  }

  function logout() {
    setIsLoggedIn(false);
  }

  let page;
  if (isLoggedIn) {
    page = (
      <div>
        <h2>User Page</h2>
        <p>You can now book your tickets.</p>
        <button onClick={logout}>Logout</button>
      </div>
    );
  } else {
    page = (
      <div>
        <h2>Guest Page</h2>
        <p>Browse flights. Please login to book tickets.</p>
        <button onClick={login}>Login</button>
      </div>
    );
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>Ticket Booking App</h1>
      {page}
    </div>
  );
}

export default App;
