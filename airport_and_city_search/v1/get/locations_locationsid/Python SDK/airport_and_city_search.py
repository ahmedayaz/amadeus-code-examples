# Install the Python library from https://pypi.org/project/amadeus
from amadeus import Client, ResponseError
from amadeus import Location

amadeus = Client(
    client_id='YOUR_AMADEUS_API_KEY',
    client_secret='YOUR_AMADEUS_API_SECRET'
)

try:
    '''
    Which cities or airports start with 'r'?
    '''
    response = amadeus.reference_data.locations.get(keyword='r',
                                                    subType=Location.ANY)
    print(response.data)
except ResponseError as error:
    raise error
