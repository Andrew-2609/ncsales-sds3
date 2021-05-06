import NavBar from "components/navbar";
import Footer from "components/footer";
import DataTable from "components/dataTable";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <p className="h1 text-primary">Hello World!</p>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;