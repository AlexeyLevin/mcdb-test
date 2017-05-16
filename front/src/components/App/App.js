import * as React from 'react';
import NavBar from '../NavBar/NavBar';

export default class App extends React.Component {
  render() {
    return (
      <div>
        <NavBar/>
        {this.props.children}
      </div>
    );
  }
}