import { configureStore } from '@reduxjs/toolkit';
import mainReducer from '../reducers';

//configureStore ha bisogno della struttura dello store globale come paramento principale (aka reducer)
const store = configureStore({
	// reducer:
	reducer: mainReducer,
});

export default store;
