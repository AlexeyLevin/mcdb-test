import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { browserHistory, IndexRoute, Route, Router } from 'react-router';

import configureStore from './store/configureStore';

import App from './components/App/App';
import LoginPage from './components/LoginPage/LoginPage';
import OrganizationsGrid from './components/OrganizationGrid/OrganizationsGrid';

import 'font-awesome/css/font-awesome.min.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';

let store = configureStore();

ReactDOM.render(
  <Provider store={store}>
    <Router history={browserHistory}>
      <Route path="/" component={App}>
        <IndexRoute component={OrganizationsGrid}/>
        <Route path="login" component={LoginPage}/>
      </Route>
    </Router>
  </Provider>,
  document.getElementById('root')
);
