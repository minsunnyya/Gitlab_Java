import React from 'react'
import { Badge, Container,Row,Col,InputGroup,FormControl,DropdownButton,Dropdown,Button } from 'react-bootstrap'
import { BsFillSquareFill , BsFillLockFill, BsClipboardCheck, BsBell, BsChevronCompactDown} from "react-icons/bs";


const Contents = () => {
  return (
    <Container >
     
    <Row id="containerrow">
    
    
    <Badge id="imgmain">
    
    </Badge>
      <Col id="title"  sm={8}> {' '}pmsplus<BsFillLockFill /></Col>
      <Col id="groupId"  sm={4}>Group ID:52102502<BsClipboardCheck/> Leave group</Col>
      
    </Row>



    <Button id="btnbell"><BsBell /><BsChevronCompactDown /></Button>

    <div className="d-grid gap-2">
  <Button id="newprjbtn">
    New project
  </Button>
 
</div>
<Container>

<Container className='textcontainer'>
  <Row>
    <Col>pmsplus</Col>
  </Row>
  <Row>
    <Col id="more">Read more</Col>
  </Row>
 
</Container>

<Container className='textcontainer'>
  <Row>
    <Col id="recent">Recent activity</Col>
  </Row>
  <Row>
    <Col>Last 90 days</Col>
  </Row>
 
</Container>

<Container className='textcontainer' id="merge">
  <Row>
    <Col>Merge Requests created</Col>
  </Row>
  <Row>
    <Col className='num'>0</Col>
  </Row>
 
</Container>

<Container className='textcontainer' id="issue">
  <Row>
    <Col >issues created</Col>
  </Row>
  <Row>
    <Col className='num'>0</Col>
  </Row>
 
</Container>

<Container className='textcontainer' id="member">
  <Row>
    <Col>Members added</Col>
  </Row>
  <Row>
    <Col className='num'>5</Col>
  </Row>
 
</Container>

<InputGroup className="mb-3" id="inputname">
    
    <FormControl
      placeholder="Search by name"
      aria-label="Username"
      aria-describedby="basic-addon1"
      id='forminput'
    />
  </InputGroup>
  <Button id="inputSize">
    Name
  </Button>

  {/* <DropdownButton
      
      title="Name"
      id='inputSize'
      className='inputSize'
    >
      <Dropdown.Item href="#">Name</Dropdown.Item>
      <Dropdown.Item href="#">Name, descending</Dropdown.Item>
      <Dropdown.Item href="#">Last created</Dropdown.Item>
      <Dropdown.Item href="#">Oldest created</Dropdown.Item>
      <Dropdown.Item href="#">Updated created</Dropdown.Item>
      <Dropdown.Item href="#">Oldest updated</Dropdown.Item>
      <Dropdown.Item href="#">Most stars</Dropdown.Item>
     
     
    </DropdownButton> */}
  </Container>
  </Container>
  )
}

export default Contents