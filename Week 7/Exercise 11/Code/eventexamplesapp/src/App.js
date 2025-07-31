import React, { useState } from 'react';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  function increment() {
    setCount(prev => prev + 1);
    sayHello();
  }

  function sayHello() {
    alert("Hello! This is a static message.");
  }

  function decrement() {
    setCount(prev => prev - 1);
  }

  function welcomeMessage(msg) {
    alert("Message: " + msg);
  }

  function handleClick(e) {
    alert("I was clicked");
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>Event Handling</h2>
      <p>Count: {count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => welcomeMessage("Welcome")}>Say Welcome</button>
      <br /><br />
      <button onClick={handleClick}>Synthetic Event</button>
      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
