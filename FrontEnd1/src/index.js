import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Contact from './contact';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Followup from './followup';
import Bootstraptab1 from './followup_2';
import DatatablePage from './demo';
import ProfileStatistics, { EnquiryForm } from './EnquiryForm';
import AddEnquiry from './AddEnquiry';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
     <BrowserRouter>
      <Routes>
        <Route path="/" element={<Contact />} />
          <Route path="/follow" element={<Bootstraptab1/>}/>
            <Route path="/demo" element={<DatatablePage/>}/>
              <Route path="/display" element={<EnquiryForm/>}/>
              <Route path="/adde" element={<AddEnquiry/>}>
        </Route>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
