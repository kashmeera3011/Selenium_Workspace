{
  "id": "0dede25c-df15-4bab-92ae-8c636f621a5a",
  "version": "2.0",
  "name": "command_contact_us",
  "url": "https://www.tops-int.com",
  "tests": [{
    "id": "5af1bc5e-f5c3-4931-8f33-efa088876605",
    "name": "coomand_contact_us",
    "commands": [{
      "id": "9ad3362e-8941-418c-bb28-d269cbfceb68",
      "comment": "",
      "command": "open",
      "target": "/contact-us/",
      "targets": [],
      "value": ""
    }, {
      "id": "9fc8cd36-2624-41a6-a921-28115a197600",
      "comment": "",
      "command": "setWindowSize",
      "target": "1050x708",
      "targets": [],
      "value": ""
    }, {
      "id": "0ff4d63c-0e25-4c60-95f3-0e5f8678262b",
      "comment": "",
      "command": "click",
      "target": "css=.nav-link > .fa-solid",
      "targets": [
        ["css=.nav-link > .fa-solid", "css:finder"],
        ["xpath=//div[@id='navbarNav']/ul/li[6]/a/i", "xpath:idRelative"],
        ["xpath=//a/i", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "8522ce53-c729-4271-bf3d-a704a3355309",
      "comment": "",
      "command": "click",
      "target": "id=inq_name",
      "targets": [
        ["id=inq_name", "id"],
        ["name=name", "name"],
        ["css=.col-md-4 #inq_name", "css:finder"],
        ["xpath=//input[@id='inq_name']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/input", "xpath:idRelative"],
        ["xpath=//form/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "13ef8d88-dd45-40bd-b5cd-e3a652bd73d2",
      "comment": "",
      "command": "type",
      "target": "id=inq_name",
      "targets": [
        ["id=inq_name", "id"],
        ["name=name", "name"],
        ["css=.col-md-4 #inq_name", "css:finder"],
        ["xpath=//input[@id='inq_name']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/input", "xpath:idRelative"],
        ["xpath=//form/input", "xpath:position"]
      ],
      "value": "pooja"
    }, {
      "id": "385129c1-1f34-4596-be2a-513d3d192d92",
      "comment": "",
      "command": "type",
      "target": "id=inq_email",
      "targets": [
        ["id=inq_email", "id"],
        ["name=email", "name"],
        ["css=.col-md-4 #inq_email", "css:finder"],
        ["xpath=//input[@id='inq_email']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/input[2]", "xpath:idRelative"],
        ["xpath=//input[2]", "xpath:position"]
      ],
      "value": "pooja@yopmail.com"
    }, {
      "id": "c57d03dc-e536-40e0-99bf-26b15302601e",
      "comment": "",
      "command": "click",
      "target": "id=inq_contact",
      "targets": [
        ["id=inq_contact", "id"],
        ["name=contact", "name"],
        ["css=.col-md-4 #inq_contact", "css:finder"],
        ["xpath=//input[@id='inq_contact']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "6d4b611a-3be6-473a-bb89-3fda612a74b7",
      "comment": "",
      "command": "click",
      "target": "id=inq_contact",
      "targets": [
        ["id=inq_contact", "id"],
        ["name=contact", "name"],
        ["css=.col-md-4 #inq_contact", "css:finder"],
        ["xpath=//input[@id='inq_contact']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "952c5a59-a936-4c4b-97dc-6f4733e703d7",
      "comment": "",
      "command": "type",
      "target": "id=inq_contact",
      "targets": [
        ["id=inq_contact", "id"],
        ["name=contact", "name"],
        ["css=.col-md-4 #inq_contact", "css:finder"],
        ["xpath=//input[@id='inq_contact']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/div[2]/input", "xpath:idRelative"],
        ["xpath=//div[2]/input", "xpath:position"]
      ],
      "value": "8787878787"
    }, {
      "id": "d603d751-b567-430f-936e-f83c65878f25",
      "comment": "",
      "command": "mouseOver",
      "target": "linkText=Send Inquiry",
      "targets": [
        ["linkText=Send Inquiry", "linkText"],
        ["css=.col-md-4 .btn", "css:finder"],
        ["xpath=//a[contains(text(),'Send Inquiry')]", "xpath:link"],
        ["xpath=//a[@type='button']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/div[3]/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, 'javascript:;')])[2]", "xpath:href"],
        ["xpath=//form/div[3]/a", "xpath:position"],
        ["xpath=//a[contains(.,'Send Inquiry')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "e1c6dbab-c403-493b-bf2b-ec25a6fc8319",
      "comment": "",
      "command": "click",
      "target": "linkText=Send Inquiry",
      "targets": [
        ["linkText=Send Inquiry", "linkText"],
        ["css=.col-md-4 .btn", "css:finder"],
        ["xpath=//a[contains(text(),'Send Inquiry')]", "xpath:link"],
        ["xpath=//a[@type='button']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/div[3]/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, 'javascript:;')])[2]", "xpath:href"],
        ["xpath=//form/div[3]/a", "xpath:position"],
        ["xpath=//a[contains(.,'Send Inquiry')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "43e67597-15a6-454f-91b6-dccc97437755",
      "comment": "",
      "command": "mouseOut",
      "target": "linkText=Send Inquiry",
      "targets": [
        ["linkText=Send Inquiry", "linkText"],
        ["css=.col-md-4 .btn", "css:finder"],
        ["xpath=//a[contains(text(),'Send Inquiry')]", "xpath:link"],
        ["xpath=//a[@type='button']", "xpath:attributes"],
        ["xpath=//div[@id='all-blogs']/div/section[2]/div/div[2]/div[2]/form/div[3]/a", "xpath:idRelative"],
        ["xpath=(//a[contains(@href, 'javascript:;')])[2]", "xpath:href"],
        ["xpath=//form/div[3]/a", "xpath:position"],
        ["xpath=//a[contains(.,'Send Inquiry')]", "xpath:innerText"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "36964883-8c9d-4ffe-8a4b-945206e6014b",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["5af1bc5e-f5c3-4931-8f33-efa088876605"]
  }],
  "urls": ["https://www.tops-int.com/"],
  "plugins": []
}