import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <p className="h1 text-primary py-3">Sales Dashboard</p>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <p className="h5 text-center text-secondary">Success Rate (%)</p>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <p className="h5 text-center text-secondary">All Sales</p>
                        <DonutChart />
                    </div>
                </div>

                <p className="h1 text-primary">All Sales</p>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;