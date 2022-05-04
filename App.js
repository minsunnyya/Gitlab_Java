
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbars from './screens/Navbars';
import SIdebar from './screens/SIdebar';
import Contents from './screens/Contents';
import Table from './screens/Table';


function App() {
  return (
<div>
     <Navbars />
     <SIdebar/>
     <Contents />
     <Table />
</div>
  );
}

export default App;
