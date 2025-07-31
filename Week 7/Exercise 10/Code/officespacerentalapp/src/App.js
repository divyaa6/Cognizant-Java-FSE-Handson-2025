import React from 'react';

function App() {
  const heading = <h1 style={{ textAlign: "center" }}>Office Space Rental App</h1>;

  const imageURL = process.env.PUBLIC_URL + "/office.webp";

  const office1 = {
    name: "Downtown Office",
    rent: 55000,
    address: "123 MG Road, Bangalore"
  };

  const offices = [
    {
      name: "Downtown Office",
      rent: 55000,
      address: "123 MG Road, Bangalore"
    },
    {
      name: "Corporate Tower",
      rent: 62000,
      address: "45 Anna Salai, Chennai"
    },
    {
      name: "Startup Hub",
      rent: 48000,
      address: "91 Banjara Hills, Hyderabad"
    },
    {
      name: "Business Bay",
      rent: 73000,
      address: "14 Park Street, Kolkata"
    }
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}
      <img src={imageURL} alt="Office Space" style={{ display: "block", margin: "auto" }} />
      <h2>Office Details</h2>
      <p>Name: {office1.name}</p>
      <p style={{ color: office1.rent < 60000 ? "red" : "green" }}>Rent: ₹{office1.rent}</p>
      <p>Address: {office1.address}</p>

      <h2>All Office Listings</h2>
      <ul>
        {offices.map((office, index) => (
          <li key={index}>
            <strong>{office.name}</strong> - 
            <span style={{ color: office.rent < 60000 ? "red" : "green" }}> ₹{office.rent}</span> - 
            {office.address}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
