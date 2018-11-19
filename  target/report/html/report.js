$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/pet/UpdatePet.feature");
formatter.feature({
  "line": 2,
  "name": "To test update pet functionality",
  "description": "",
  "id": "to-test-update-pet-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@edit"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "update pet",
  "description": "",
  "id": "to-test-update-pet-functionality;update-pet",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@edit"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is using the baseURI",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user makes the put call to the resource \"/pet\"",
  "rows": [
    {
      "cells": [
        "id",
        "1234567892878"
      ],
      "line": 8
    },
    {
      "cells": [
        "catName",
        "toy"
      ],
      "line": 9
    },
    {
      "cells": [
        "name",
        "doggie 125"
      ],
      "line": 10
    },
    {
      "cells": [
        "photoUrl",
        "url1"
      ],
      "line": 11
    },
    {
      "cells": [
        "tagname",
        "tag1"
      ],
      "line": 12
    },
    {
      "cells": [
        "status",
        "pending"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "The user validates the updated pet details",
  "rows": [
    {
      "cells": [
        "id",
        "1234567892878"
      ],
      "line": 16
    },
    {
      "cells": [
        "catName",
        "toy"
      ],
      "line": 17
    },
    {
      "cells": [
        "name",
        "doggie 125"
      ],
      "line": 18
    },
    {
      "cells": [
        "photoUrl",
        "url1"
      ],
      "line": 19
    },
    {
      "cells": [
        "tagname",
        "tag1"
      ],
      "line": 20
    },
    {
      "cells": [
        "status",
        "pending"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 3805723395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/pet",
      "offset": 45
    }
  ],
  "location": "UpdatePetSteps.the_user_makes_the_put_call_to_the_resource(String,DataTable)"
});
formatter.result({
  "duration": 7571708930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 34
    }
  ],
  "location": "CommonScenarioSteps.i_need_to_get_a_response_code(int)"
});
formatter.result({
  "duration": 223064813,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePetSteps.the_user_validates_the_updated_pet_details(DataTable)"
});
formatter.result({
  "duration": 201376203,
  "status": "passed"
});
});