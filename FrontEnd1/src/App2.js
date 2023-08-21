import React from 'react';
import { MDBRow, MDBCol, MDBInput, MDBTextArea, MDBBtn } from 'mdb-react-ui-kit';

export default function App() {
  return (
    <section className='border text-center mb-4'>
      <div className='row'>
        <div className='col-lg-5'>
          <iframe
            src='https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15079.633407820726!2d72.832891!3d19.1116761!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7c9c3a5e26d7b%3A0x89a89f343cff9c29!2sSM%20VITA!5e0!3m2!1sen!2sin!4v1692026406253!5m2!1sen!2sin" width="600" height="450" style="borde'
            className='h-100 w-100'
            style={{ border: '0' }}
            loading='lazy'
          ></iframe>
        </div>

      </div>
    </section>
  );
}