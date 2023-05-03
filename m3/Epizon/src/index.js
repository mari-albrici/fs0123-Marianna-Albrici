import React from 'react';
import ReactDOM from 'react-dom/client';

import 'bootstrap/dist/css/bootstrap.min.css';
import './index.css';
import './style/index.css';
import App from './App';
import store from './redux/store';
import { Provider } from 'react-redux';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
	//Provider è un HOC (Higher Order Component) che fornisce a App le funzionalità dello store tramite hooks dedicati. Riceve in ingresso come input dalle prop lo store creato con la funzione configure store
	<Provider store={store}>
		<App />
	</Provider>,
);
