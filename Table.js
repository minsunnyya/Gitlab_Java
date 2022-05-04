import React from 'react'
import { Card,Nav,ListGroup,ListGroupItem,Button } from 'react-bootstrap'
import { FaLock, FaBookOpen,FaUserFriends, FaAngleRight } from "react-icons/fa";
import styled from "styled-components";

const StyledDiv = styled.div`
float:left

`;



const Table = () => {
  return (
    <Card id="card">
    <Card.Header id="cardheader">
      <Nav variant="pills" defaultActiveKey="#first">
        <Nav.Item>
          <Nav.Link id="tab" href="#first">Subgroups and projects</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link id="tab" href="#link">Shared projects</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link id="tab" href="#disabled">
            Archived projects
          </Nav.Link>
        </Nav.Item>
      </Nav>
    </Card.Header> 
    <ListGroup className="list-group-flush">
   <ListGroupItem><StyledDiv><FaAngleRight/>&nbsp;</StyledDiv>&nbsp;<div id="iconpic">C</div>css-layout&nbsp;<FaLock />
    <div id="icon"><FaLock /> 0 <FaBookOpen /> 2 <FaUserFriends />1 </div>
    </ListGroupItem>
    <ListGroupItem><StyledDiv><FaAngleRight/>&nbsp;</StyledDiv>&nbsp;<div id="iconpic">C</div>demo&nbsp;<FaLock /> <div id="icon"><FaLock /> 0 <FaBookOpen /> 2 <FaUserFriends />1 </div></ListGroupItem>
    <ListGroupItem><StyledDiv><FaAngleRight/>&nbsp;</StyledDiv>&nbsp;<div id="iconpic">M</div>pims&nbsp;<FaLock /> <div id="icon"><FaLock /> 0 <FaBookOpen /> 2 <FaUserFriends />1 </div></ListGroupItem>
    <ListGroupItem><StyledDiv><FaAngleRight/>&nbsp;</StyledDiv>&nbsp;<div id="iconpic">Z</div>react&nbsp;<FaLock /> <div id="icon"><FaLock /> 0 <FaBookOpen /> 2 <FaUserFriends />1 </div></ListGroupItem>
    <ListGroupItem><StyledDiv><FaAngleRight/>&nbsp;</StyledDiv>&nbsp;<div id="iconpic">A</div>homepage&nbsp;<FaLock /> <div id="icon"><FaLock /> 0 <FaBookOpen /> 2 <FaUserFriends />1 </div></ListGroupItem>
  </ListGroup>
    
  </Card>
  )
}

export default Table