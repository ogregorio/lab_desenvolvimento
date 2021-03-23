import React, { lazy, Suspense } from 'react';

import { BrowserRouter, Route} from 'react-router-dom';

const Dashboard = lazy(() => import('../components/Dashboard/Dashboard'));
const Login = lazy(() => import('../components/Login/Login'));

function Routes() {
    return (
      <BrowserRouter>
        <Suspense fallback={() => <div>LOADING...</div>}>
            <Route path="/login" component={Login} />
            <Route path="/dashboard" component={Dashboard} />
        </Suspense>
      </BrowserRouter>
    );
}

export default Routes;