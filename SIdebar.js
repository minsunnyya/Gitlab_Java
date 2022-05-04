import React from 'react'
import { Button, Offcanvas,Navbar, Container,Row,Col, Badge } from 'react-bootstrap';
import { useState } from 'react';
import { BsInfoCircle,BsClipboardCheck,BsList,BsFolder2,BsShare,BsFillShieldFill,BsFillCloudArrowUpFill,BsInbox, BsGraphUp,BsJournalBookmarkFill} from "react-icons/bs";

const SIdebar = () => {
  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);



  return (

    <Navbar id="togglenNav">
  <Container id="container">
    
    <Button id="btnnav" onClick={handleShow}>
      <BsList /> 
     </Button>

     <Offcanvas id="offcanvas-start"show={show} onHide={handleClose}>
     <Offcanvas.Header id="titlepms" closeButton>
         <Offcanvas.Title id="offtitle" >  <Badge id="bg-primary2" className='pmslogo'>
  
  </Badge>{' '}
  pmsplus</Offcanvas.Title>
      </Offcanvas.Header>
      <Offcanvas.Body id="offbody">
  <Row>
    <Col id="row_li"><BsInfoCircle />&nbsp;Group infomation</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsFolder2 />&nbsp;Epics  <Badge id="bg-primary" className='bg-primary'>
    0
  </Badge>{' '}</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsClipboardCheck />&nbsp;Issues  
    <Badge id="bg-primary" className='bg-primary'>
   0
  </Badge>{' '}</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsShare />&nbsp;Merge requests  <Badge id="bg-primary" className='bg-primary'>
    0
  </Badge>{' '}</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsFillShieldFill />&nbsp;Security & Compliance</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsFillCloudArrowUpFill />&nbsp;Kubernetes</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsInbox />&nbsp;Packages & Ragistries</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsGraphUp />&nbsp;Analytics</Col>
  </Row>
  <Row>
    <Col id="row_li"><BsJournalBookmarkFill />&nbsp;Wiky</Col>
  </Row>
  
     </Offcanvas.Body>
     </Offcanvas>
 
    <Navbar.Toggle />
    <Navbar.Collapse id="justify-contentend">
      <Navbar.Text>
      ｜pmsplus
      </Navbar.Text>
    </Navbar.Collapse>
  </Container>




  
</Navbar>












  //   <div>
  //   <Button id="btnnav" onClick={handleShow}>
  //    <BsList />
  //   </Button>

  //   <Offcanvas show={show} onHide={handleClose}>
  //     <Offcanvas.Header closeButton>
  //       <Offcanvas.Title>Offcanvas</Offcanvas.Title>
  //     </Offcanvas.Header>
  //     <Offcanvas.Body>
  //       Some text as placeholder. In real life you can have the elements you
  //       have chosen. Like, text, images, lists, etc.
  //     </Offcanvas.Body>
  //   </Offcanvas>
  // </div>
);
}

export default SIdebar