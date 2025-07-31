import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  function handleSubmit() {
    const result = (Number(rupees) / 90).toFixed(2);
    setEuros(result);
  }

  return (
    <div>
      <h3>Currency Convertor</h3>
      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      <p>Euros: {euros}</p>
    </div>
  );
}

export default CurrencyConvertor;
