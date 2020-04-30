import React from 'react';
import ReactDOM from 'react-dom';

const App = (props) => {
  return (<h2>Hello from React</h2>);
}

ReactDOM.render(
<App />,
    document.getElementById('app')
);