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

        if (!response.ok || !response.status.toString().startsWith("2")) {
            throw new Error(`Response status: ${response.status}`);
        }

        const apiResponse = (await response.json() as { data: Readonly<APIResponse[]> }).data;
        console.log(JSON.stringify(apiResponse, null, 2));
        console.log(apiResponse.filter((item) => item["ID Year"] === 2018).length);
    }
    catch (err) {
        const error = err as Error;
        console.log("Error: ", error.message);
    }
}

const apiUrls = [
    "https://datausa.io/api/data?drilldowns=Nation&measures=Population"
];

practiceRESTAPIForCodingAssessments(apiUrls[0]);
