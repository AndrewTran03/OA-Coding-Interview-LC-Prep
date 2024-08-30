// Source: https://abhiappmobiledeveloper.medium.com/free-api-huge-list-of-public-apis-for-developertesting-b9cf371282b3

type APIResponse = {
    "ID Nation": string;
    Nation: string;
    "ID Year": number;
    Year: number;
    Population: number;
    "Slug Nation": string;
};

async function practiceRESTAPIForCodingAssessments(apiUrl: string) {
    try {
        const response = await fetch(apiUrl, {
            headers: {
                "Content-Type": "application/json",
                "Accept": "application/json",
            },
        });

        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }

        const apiResponse = await response.json() as { data: APIResponse[] };
        console.log(JSON.stringify(apiResponse.data, null, 2));
        console.log(apiResponse.data.filter((item) => item["ID Year"] === 2018).length); 
    }
    catch (error) {
        console.log("Error: ", error);
    }
}

const apiUrls = [
    "https://datausa.io/api/data?drilldowns=Nation&measures=Population"
];

practiceRESTAPIForCodingAssessments(apiUrls[0]);
