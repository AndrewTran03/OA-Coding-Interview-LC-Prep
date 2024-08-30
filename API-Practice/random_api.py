# Source: https://abhiappmobiledeveloper.medium.com/free-api-huge-list-of-public-apis-for-developertesting-b9cf371282b3

import requests
import json

class Result:
    ID_nation: str
    nation: str
    ID_year: int
    year: int
    population: int
    slug_nation: str
    
    def __init__(self, ID_nation: str, nation: str, ID_year: int, year: int, population: int, slug_nation: str) -> None:
        self.ID_nation = ID_nation
        self.nation = nation
        self.ID_year = ID_year
        self.year = year
        self.population = population
        self.slug_nation = slug_nation

def main() -> None:
    API_URL = "http://universities.hipolabs.com/search?country=United+States"
    response = requests.get(API_URL, headers={
        "Accept": "application/json",
        "Content-Type": "application/json",
    })
    
    if not str(response.status_code).startswith("2"):
        print(f"Error: {response.status_code}")
        exit(1)  
    
    res_body = response.json()
    print(json.dumps(res_body, indent=4))
    
    print(len(res_body))
    data = res_body
    
    # data = res_body.get("data")
    # print(len(data))
    
    results: list[Result] = []
    for _, v in enumerate(data):
        result = Result(
            ID_nation=v.get("ID nation"),
            nation=v.get("nation"),
            ID_year=v.get("ID year"),
            year=v.get("year"),
            population=v.get("Population"),
            slug_nation=v.get("Slug nation"),
        )
        results.append(result)
    print(results)
    return None

if __name__ == "__main__":
    main()