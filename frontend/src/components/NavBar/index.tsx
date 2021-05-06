import ImgLogo from 'assets/img/my_logo.png';

const NavBar = () => {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <p className="h6 text-secondary">
                    <img src={ImgLogo} alt="DevSuperior" width="50" />
                    NdrewCoding
                    </p>
                </nav>
            </div>
        </div>
    );
}

export default NavBar;