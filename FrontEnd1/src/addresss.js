import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import React, { useState } from 'react';

function addresss() {
  return (
    <Container>
      <h6>Vidhyanidhi InfoTech Academy</h6>
        <br></br>
      <Row  sm={8}>
        <Col sm={12}>

    <br></br>
    <Col sm={12}>
        <h6>Authorised Training Centre</h6>
     5th Floor, Vidyanidhi Education Complex,<br></br> Vidyanidhi Road, Juhu Scheme Andheri (W), Mumbai 400 049 India<br></br>
    Mobile : 9029435311 / 9324095272 / 9987062416<br></br>
       Email : training@vidyanidhi.com
       </Col>
       </Col>
       
    </Row>
    </Container>
  );
}

export default addresss;
