import React, { Component } from 'react';
import BootstrapTable from 'react-bootstrap-table-next';
import axios from 'axios';
import filterFactory, { textFilter } from 'react-bootstrap-table2-filter';
import paginationFactory from 'react-bootstrap-table2-paginator';

const formatDate = (dateTimeString) => {
    const date = new Date(dateTimeString);
    return date.toISOString().split("T")[0]; // Get only the date part
};

export class Bootstraptab1 extends Component {
  state = {
    enquiry: [], // Initial empty array
    columns: [
      {
        dataField: 'enquiry_id',
        text: 'Enq.Id',
        sort: true
      },
      {
        filter: textFilter(),
        dataField: 'enquirer_name',
        text: 'Enquirer Name',
      },
      {
        dataField: 'student_name',
        text: 'Student Name',
      },
      {
        dataField: 'enquirer_mobile',
        text: 'Phone',
      },
      {
        dataField: 'follow_up_date',
        text: 'follow_up_date',
        formatter: formatDate, // Use the formatDate function
      },
      {
        dataField: 'enquirer_email_id',
        text: 'Email',
      },
    ],
  };

  componentDidMount() {
    axios.get('http://localhost:8080/api/egetall').then(response => {
      this.setState({
        enquiry: response.data,
      });
    });
  }

  render() {
    const options = {
      page: 1, // Default page
      sizePerPage: 10, // Default number of items per page
      totalSize: this.state.enquiry.length, // Total number of items
    };

    return (
      <div className="container">
        <div className="row hdr">
          {/* <div className="col-sm-14 btn btn-info">staff</div> */}
        </div>
        <div className="container" style={{ marginTop: 50 }}>
          {this.state.enquiry.length > 0 ? (
            <BootstrapTable
              striped
              hover
              keyField='enquiry_id'
              data={this.state.enquiry}
              columns={this.state.columns}
              filter={filterFactory()}
              pagination={paginationFactory(options)}
            />
          ) : (
            <p>Loading data...</p>
          )}
        </div>
      </div>
    );
  }
}

export default Bootstraptab1;
