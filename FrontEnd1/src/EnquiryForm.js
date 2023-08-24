import { useState } from "react";
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import { useNavigate } from "react-router-dom"
import { Row } from "react-bootstrap";
import Col from 'react-bootstrap/Col';

export function EnquiryForm(props) {
    const [Person, setPerson] = useState({});
    const [isChecked, setIsChecked] = useState(false);


    let navigate = useNavigate();
    const handleChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        setPerson(values => ({ ...values, [name]: value }))
    }
    const handleCheckboxChange = () => {
      setIsChecked(prevValue => !prevValue);
    }
    const handleSubmit = (event) => {
        let demo = JSON.stringify(Person);
        console.log(JSON.parse(demo));
        fetch("http://localhost:8080/api/new_enquiry", {
          value: !isChecked,
            method: 'POST',
            headers: { 'Content-type': 'application/json' },
            body: demo
        })
        event.preventDefault();
        navigate('/demo2');
        alert(Person);
    }
    return (
      <div className="enquiry-form">
      
      <Row sm={8}>
        <Col sm={12}>
        <Col sm={5}>
      <Form style={{ position: 'relative', top: '50px', left: '100px' }} onSubmit={handleSubmit}>
      <h1>Enquiry Form</h1>
        <Form.Group controlId="enquirerName">
          <Form.Label>Enquirer Name:</Form.Label>
          <Form.Control onChange={handleChange} type="text" name="enquirer_name" placeholder="Enter enquirer name" />
        </Form.Group>
        <Form.Group controlId="enquirerAddress">
          <Form.Label>Enquirer Address:</Form.Label>
          <Form.Control onChange={handleChange} type="text" name="enquirer_address" placeholder="Enter enquirer address" />
        </Form.Group>
        <Form.Group controlId="enquirerMobile">
          <Form.Label>Enquirer Mobile:</Form.Label>
          <Form.Control onChange={handleChange} type="text" name="enquirer_mobile" placeholder="Enter enquirer mobile" />
        </Form.Group>
        <Form.Group controlId="enquirerEmail">
          <Form.Label>Enquirer Email:</Form.Label>
          <Form.Control onChange={handleChange} type="email" name="enquirer_email_id" placeholder="Enter enquirer email" />
        </Form.Group>
        <Form.Group controlId="enquiryDate">
            <Form.Label>Enquiry Date:</Form.Label>
            <Form.Control onChange={handleChange} name="enquiry_date" type="date" />
          </Form.Group>
        <Form.Group controlId="enquirerQuery">
          <Form.Label>Enquirer Query:</Form.Label>
          <Form.Control onChange={handleChange} as="textarea" name="enquirer_query" rows={3} />
        </Form.Group>
        <Form.Group controlId="enquiryProcessedFlag">
          <Form.Check  checked={isChecked} onChange={handleCheckboxChange} type="checkbox"  name="enquiry_processed_flag" label="Enquiry Processed" />
        </Form.Group>
        <Form.Group controlId="studentName">
          <Form.Label>Student Name:</Form.Label>
          <Form.Control onChange={handleChange} type="text" name="student_name" placeholder="Enter student name" />
        </Form.Group>
        <Form.Group controlId="inquiryCounter">
          <Form.Label>Inquiry Counter:</Form.Label>
          <Form.Control onChange={handleChange} type="number" name="inquiry_counter" placeholder="Enter inquiry counter" />
        </Form.Group>
        <br></br>
        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Form>
      </Col>
      </Col>
      </Row>
        
    </div>
    );
} 
export default EnquiryForm;