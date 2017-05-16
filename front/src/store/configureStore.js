import createLogger from 'redux-logger';
import { applyMiddleware, createStore } from 'redux';
import thunk from 'redux-thunk';

import reducers from '../reducers';

export default function configureStore(initialState) {
  const logger = createLogger();
  return createStore(
    reducers,
    initialState,
    applyMiddleware(thunk, logger)
  );
}
