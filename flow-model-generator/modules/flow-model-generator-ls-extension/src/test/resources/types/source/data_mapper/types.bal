# Represents a geographical location.
#
# + city - The name of the city
# + country - The name of the country
type Location record {|
    string city;
    string country;
|};

type Address record {|
    string houseNo;
    string line1;
    string line2;
    string city;
    string country;
|};

type Employee record {|
    string name;
    string empId;
    string email;
    Location location;
|};

type Person record {|
    string name;
    string email;
    Address address;
|};

type Admission record {
    string empId;
    string admissionDate;
};
