import Amadeus

var amadeus: Amadeus = Amadeus(
    client_id: "YOUR_API_ID",
    client_secret: "YOUR_API_SECRET"
)

amadeus.travel.tripParserJobs.result(jobId: "Mk8RWGGCDagNHOdjP9EZrJ9l").get(
    onCompletion: {
        response, error in
        if error == nil {
            print(response!.data)
        }
                                        })
