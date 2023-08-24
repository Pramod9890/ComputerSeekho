import React, { useState } from "react";
import "./AddBatchForm.css"; // Add your custom CSS file for styling
import { useNavigate } from "react-router-dom";

export function AddEnquiry() {
    const navigate = useNavigate();
  const [Enquiry, setEnquiryData] = useState({
    enquirer_name: "",
    student_name: "",
    enquirer_mobile: "",
    enquirer_email_id: "",
    enquirer_email_id: "",
    enquiry_date : "",
    follow_up_date: "",
    enquirer_address:"",
    enquirer_query: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setEnquiryData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    fetch("http://localhost:8080/api/new_enquiry", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(Enquiry),
    })
      .then((response) => {
        if (response.ok) {
          console.log("Enquiry added successfully");
          // You can reset the form or perform any other necessary actions here
        } else {
          console.error("Error adding batch");
        }
      })
      .catch((error) => {
        console.error("Error:", error);
      });

      navigate(-1);
  };

  return (
    <div className="add-batch-form">
      <h2>Add New Enquiry</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label>Enquirer Name:</label>
          <input
            type="text"
            name="enquirer_name"
            value={Enquiry.enquirer_name}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Student Name:</label>
          <input
            type="text"
            name="student_name"
            value={Enquiry.student_name}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Mobile No</label>
          <input
            type="text"
            name="enquirer_mobile"
            value={Enquiry.enquirer_mobile}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Email</label>
          <input
            type="text"
            name="enquirer_email_id"
            value={Enquiry.enquirer_email_id}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Enquiry Date</label>
          <input
            type="date"
            name="enquiry_date"
            value={Enquiry.enquiry_date}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Follow Up Date</label>
          <input
            type="date"
            name="follow_up_date"
            value={Enquiry.follow_up_date}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Address</label>
          <input
            type="textfield"
            name="enquirer_address"
            value={Enquiry.enquirer_address}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Enquiry Query:</label>
          <input
            as="textfield"
            name="enquirer_query"
            value={Enquiry.enquirer_query}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <button type="submit">Add Enquiry</button>
        </div>
      </form>
    </div>
  );
}

export default AddEnquiry;