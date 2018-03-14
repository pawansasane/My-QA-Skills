{
  "type": "script",
  "seleniumVersion": "2",
  "formatVersion": 2,
  "steps": [
    {
      "type": "get",
      "url": "https://successentellus.com/home/display"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "link text",
        "value": "Log In"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "email"
      },
      "text": "pawan@bringmax.com"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "pwd"
      },
      "text": "Bring"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btn_add"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "link text",
        "value": "Email Campaign"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "link text",
        "value": "Create Campaign"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='addCampaignModal']/div/div/div[2]/form/div[1]/div/div/input"
      },
      "text": "Selenium test2"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='addCampaignModal']/div/div/div[2]/form/div[2]/div/div/textarea"
      },
      "text": "Creat campaign"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='addCampaignModal']/div/div/div[2]/form/div[2]/div/div/textarea"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='addCampaignModal']/div/div/div[2]/form/div[2]/div/div/textarea"
      },
      "text": "Create campaign_createtemplate_blank template_assign emails"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btnSave"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='createCampHead468']/div[3]/ul/li[1]/a/i"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='createCampHead468']//a[normalize-space(.)='Create Template']"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@class='col-sm-12']//span[.='Select']"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "campaignStepSubject"
      },
      "text": "Blank Templated"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "userTemplateTitle"
      },
      "text": "Heading for Blank template"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "link text",
        "value": "Attach Files"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "upload"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btnupload"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btnSave"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btnSave"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "timeInterval"
      },
      "text": "1"
    },
    {
      "type": "setElementSelected",
      "locator": {
        "type": "xpath",
        "value": "//select[@id='type']//option[2]"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btnSave"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "link text",
        "value": "My Campaign"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "link text",
        "value": "Add Email's"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "compaignFirstName"
      },
      "text": "Pawan"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "compaignLastName"
      },
      "text": "Sasane"
    },
    {
      "type": "setElementSelected",
      "locator": {
        "type": "xpath",
        "value": "//select[@id='alredyEx']//option[31]"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "compaignPhone"
      },
      "text": "8308452063"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "compaignEmails"
      },
      "text": "pawan@bringmax.com"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btnAdd"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btn_addaddEmailsWpr"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='createCampHead468']//h2[.='Selenium test2 Campaign']"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='collapse468']/div/div/div[1]/div/div/div/div/div[3]/a"
      }
    }
  ],
  "data": {
    "configs": {},
    "source": "none"
  },
  "inputs": [],
  "timeoutSeconds": 60
}