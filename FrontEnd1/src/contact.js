import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import React, { useState } from 'react';
import { useNavigate } from "react-router-dom";
import Button from 'react-bootstrap/Button';


function Contact() {
  const [timestamp, setTimestamp] = useState(new Date().getTime());
  const [Enquiry, setEmployee] = useState({});
    let navigate = useNavigate();
    const handleChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        setEmployee(values => ({ ...values, [name]: value }))
    }
    const handleSubmit = (event) => {
        let demo = JSON.stringify(Enquiry);
        // console.log(JSON.parse(demo));
        fetch("http://localhost:8080/api/new_enquiry", {
            method: 'POST',
            headers: { 'Content-type': 'application/json' },
            body: demo
        }).then(r => r.json()).then((data) => data)

        event.preventDefault();
        navigate('/');
    }
  return (
    <Container >
      <h3 align = "center">ComputerSeekho</h3>
        <br></br>
      <Row sm={8}>
        <Col sm={12}>
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3769.908236798875!2d72.83031607495563!3d19.1116811508519!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7c9c3a5e26d7b%3A0x89a89f343cff9c29!2sSM%20VITA!5e0!3m2!1sen!2sin!4v1692108335468!5m2!1sen!2sin" width="1200" align="right" height="300"  allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
          </Col>
          <br></br>
          <br></br>
      <Col sm={5}>
        <Form  style={{ position: 'relative', top: '50px', left: '200px' }} onSubmit={handleSubmit}>
      <Form.Group controlId="f1">
      <Form.Label>Enquirer Name</Form.Label>
      <Form.Control
        size="sm"
        placeholder="Enquirer Name"
        type="text"
        name ="enquirer_name"
        onChange={handleChange}
      />
      </Form.Group>
      {/* <label>Enquirer Name</label>
      <input name = "enquirer_name"  type="text" onChange={handleChange}></input> */}
      <Form.Group controlId="f2">
      <Form.Label>Student Name</Form.Label>
      <Form.Control
        size="sm"
        placeholder=" Name"
        type="text"
       name="Student_Name"
       onChange={handleChange}
      />
      </Form.Group>
      
      <Form.Group controlId="f3">
      <Form.Label>Mobile No.</Form.Label>
      <Form.Control
        size="sm"
        placeholder="Mobile No"
        type="text"
        name ="enquirer_mobile"
        onChange={handleChange}
      />
      </Form.Group>

      <Form.Group controlId="f4">
      <Form.Label>Email</Form.Label>
      <Form.Control
        size="sm"
        placeholder="Email"
        type="text"
        name="enquirer_email_id"
        onChange={handleChange}
      />
      </Form.Group>

      <Form.Group controlId="f5">
          <Form.Label>Your Query</Form.Label>
          <Form.Control as="textarea" name = "enquirer_query" rows={5} onChange={handleChange} placeholder="Enter your text here..." />
        </Form.Group>
        <div>
      <input type="hidden" name="enquiry_date" onChange={timestamp}/>
    </div>
      <div>
        <br></br>
        {/* <input  type='submit' className=''/> */}
        <Button variant="primary" type='submit'>Submit</Button>
        </div>
       <p style={{ paddingTop: '20px' }}></p>
      </Form>
       </Col>
       
       <Col sm={6}>
       <br></br>
        <h4 style={{ position: 'relative', top: '50px', left: '220px' }} >Authorised Training Centre</h4>
          <strong style={{ position: 'relative', top: '50px', left: '220px' }}>5th Floor, Vidyanidhi Education Complex,<br></br> Vidyanidhi Road, Juhu Scheme Andheri (W), Mumbai 400 049 India<br></br>
          Mobile : 9029435311 / 9324095272 / 9987062416<br></br>
       Email : training@vidyanidhi.com
       </strong>
       </Col>
    </Row>
    </Container>
    
  );
  
}

export default Contact;
