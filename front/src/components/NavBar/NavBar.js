import * as React from 'react';
import { Link } from 'react-router';
import brand from './logo-min.gif';

export default class NavBar extends React.Component {
  render() {
    return (
      <nav className="navbar navbar-default navbar-fixed-top">
        <div className="container-fluid">
          <div className="navbar-header">
            <Link to="/">
              <span className="navbar-brand">
                <img alt="Brand" src={brand} style={{height: '100%'}}/>
              </span>
            </Link>
          </div>
        </div>
      </nav>
    )
  }
}