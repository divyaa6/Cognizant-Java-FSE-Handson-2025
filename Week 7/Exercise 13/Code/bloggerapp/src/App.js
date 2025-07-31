import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState("book");

  let componentToRender;
  if (view === "book") {
    componentToRender = <BookDetails />;
  } else if (view === "blog") {
    componentToRender = <BlogDetails />;
  } else if (view === "course") {
    componentToRender = <CourseDetails />;
  } else {
    componentToRender = <p>Please select a valid view.</p>;
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>Blogger App</h1>

      <button onClick={() => setView("book")}>Show Book</button>
      <button onClick={() => setView("blog")}>Show Blog</button>
      <button onClick={() => setView("course")}>Show Course</button>

      <br /><br />

      {/* Approach 1: Element Variable */}
      {componentToRender}

      <br /><br />

      {/* Approach 2: Ternary Operator */}
      {view === "blog" ? <p>You're viewing the Blog section</p> : null}

      {/* Approach 3: && Operator */}
      {view === "course" && <p>You're in the Course section</p>}
    </div>
  );
}

export default App;
