import React, { useState } from 'react';

export const EnquiryF = () => {
  const currentDate = new Date();
  const nextThreeDays = new Date(currentDate);
  nextThreeDays.setDate(currentDate.getDate() + 3);

  const [formState] = useState({
    currentDate: currentDate.toISOString().split('T')[0],
    nextThreeDays: nextThreeDays.toISOString().split('T')[0],
    // ... other form fields and state
  });

  const handleSubmit = (event) => {
    event.preventDefault();
    // Handle form submission logic
  };
  
  return (
    
    <form onSubmit={handleSubmit}>
      {/* ... other form fields */}
      <input type="hidden" name="current_date" value={formState.currentDate} />
      <input type="hidden" name="next_three_days" value={formState.nextThreeDays} />
      <button type="submit">Submit</button>
      console.log(currentDate)
      console.log({formState.nextThreeDays})
    </form>
  );
};

export default EnquiryF;
