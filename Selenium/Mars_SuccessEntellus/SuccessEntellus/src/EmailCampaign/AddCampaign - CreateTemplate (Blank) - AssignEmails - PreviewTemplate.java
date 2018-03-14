{"id":"f5afb224-506a-4a37-8634-4b60cc4826ab","name":"EmailCampaign","url":"https://successentellus.com","tests":[{"id":"d8e8cf0d-efba-4e56-9699-ee91b01219ce","name":"AddCampaign - CreateTemplate (Blank) - AssignEmails - PreviewTemplate","commands":[{"id":"3e11b26c-4f1b-44d9-9b1d-c7e07966aff3","command":"open","target":"/login","value":""},{"id":"71e83ef1-8c4e-4f2b-aad4-9d28b1135e33","command":"type","target":"id=pwd","value":"BringQA"},{"id":"fe3ebe83-a378-4c9c-9614-5810d49a7841","command":"clickAt","target":"id=email","value":"233,13"},{"id":"635fac46-6651-4c82-a1e6-69e8e5d6830d","command":"clickAt","target":"id=pwd","value":"188,21"},{"id":"0936f8c1-406f-444a-8470-3931e3aabf7e","command":"type","target":"id=pwd","value":"Bring"},{"id":"a64c6fe8-ff39-4560-93e1-e5a7bd1cb058","command":"clickAt","target":"id=btn_add","value":"184,20"},{"id":"2c509240-0985-49e2-997d-60096a474d77","command":"clickAt","target":"css=a[title=\"Campaign\"] > span","value":"48,7"},{"id":"b541ca46-4f52-4770-818d-651e1a78fadf","command":"clickAt","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":"64,11"},{"id":"1f7a8158-ea20-43d0-8e4c-27a9ea375899","command":"mouseOver","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":""},{"id":"2ad33580-2b09-4839-b4c5-2d374c7bcd7c","command":"mouseOut","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":""},{"id":"b6ed2db6-a381-45ad-a21d-95376b506b5d","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"213,27"},{"id":"99cd3e09-4911-4e47-921f-f87d2a321924","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"Selenium Test - IDE - Chrome"},{"id":"dc08c1f6-e1d1-49e5-a13a-b141f2281176","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm","value":"146,153"},{"id":"5b547d84-fa3a-49a8-ba4c-47be31f01167","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent","value":"testing with chrome Selenium IDE"},{"id":"363deb94-7513-4891-8ccb-7ab31a5e94e4","command":"clickAt","target":"id=btnSave","value":"34,15"},{"id":"b9f0c447-7076-44ae-89e6-06264b6b0257","command":"clickAt","target":"css=#createCampHead486 > div.cRtLink > ul.clearfix > li.dropdown > a > i.glyphicon.glyphicon-option-vertical","value":"9,20"},{"id":"104d940f-35a4-421e-87d7-048853b9738b","command":"clickAt","target":"css=li.dropdown.open > div.dropdown-menu > a","value":"99,13"},{"id":"e15f2887-0646-4b2d-a9a7-0e0e9c086d1b","command":"clickAt","target":"css=div.overlay > span","value":"38,11"},{"id":"0536a788-d508-4cb7-b6ab-faaf1c938aaf","command":"clickAt","target":"id=campaignStepSubject","value":"253,24"},{"id":"0b4657db-d3bf-4f13-a0cc-0f0159157cc5","command":"type","target":"id=campaignStepSubject","value":"Selenium IDE - subject added"},{"id":"96fc70ab-4871-4664-83c1-58249a459c3a","command":"clickAt","target":"id=userTemplateTitle","value":"179,14"},{"id":"c6ace13c-f5f2-4c1b-b8a5-5e6388599844","command":"type","target":"id=userTemplateTitle","value":"Heading with blank template"},{"id":"c6b6bef6-75d0-470f-84c7-40cbe5ef4a03","command":"selectFrame","target":"index=0","value":""},{"id":"bb375b46-eca1-4ef2-bcf3-eac80d90d330","command":"clickAt","target":"css=html","value":"161,18"},{"id":"3800b545-470a-4dc4-b24a-3bad69045af7","command":"editContent","target":"//body","value":"<p>Hi {firstName},<br></p><p><br></p><p>Pawan sasane - testing for email campaign</p>"},{"id":"8c627eb2-64e6-4ec8-a2e8-7b3dfa252f40","command":"selectFrame","target":"relative=parent","value":""},{"id":"bb013ac0-c27f-455c-9f5e-de155e7cc8e1","command":"clickAt","target":"id=btnSave","value":"39,15"},{"id":"9fcf35b5-f75b-46e4-b2b6-ea1fad303744","command":"clickAt","target":"id=timeInterval","value":"32,15"},{"id":"0bc1f980-20a1-4140-8ddc-884599204a03","command":"type","target":"id=timeInterval","value":"1"},{"id":"74650cad-3565-40c0-93cb-fec0e5086917","command":"clickAt","target":"id=type","value":"25,17"},{"id":"aeb399e0-d109-4e27-983b-db78624e78d3","command":"select","target":"id=type","value":"label=Days"},{"id":"a02f933e-cfbc-407b-8095-f7d69daff4a7","command":"clickAt","target":"id=type","value":"-1124,-363"},{"id":"4ac84dbc-1afd-4156-95be-e04cf4f1dc1b","command":"clickAt","target":"id=btnSave","value":"81,16"},{"id":"02e8cf4c-ae2f-4725-8384-709eb6ad0b53","command":"clickAt","target":"id=btnSave","value":"81,16"},{"id":"ae418f64-1a6b-49e9-ac97-18cccf15b636","command":"clickAt","target":"//a[contains(text(),'My Campaign')]","value":"25,19"},{"id":"960d8bbf-3c49-45e9-b0b3-6dbbef5c0ca1","command":"clickAt","target":"css=a.btn.bg-orange","value":"106,15"},{"id":"cb00dac4-8154-4904-b8cc-9f0f9a1e3386","command":"clickAt","target":"id=compaignFirstName","value":"255,6"},{"id":"1af09913-2d9a-4b27-98f9-729093bcfb58","command":"type","target":"id=compaignFirstName","value":"Pawan"},{"id":"b972e8e5-0bb2-4529-8c2a-bf9400433c26","command":"clickAt","target":"id=compaignLastName","value":"23,19"},{"id":"1222bee0-ed5e-4731-940a-6199ad4534c4","command":"type","target":"id=compaignLastName","value":"Sasane"},{"id":"94c9a06a-6af4-4ed3-b942-db8a6d984363","command":"clickAt","target":"id=alredyEx","value":"250,28"},{"id":"829ec4bf-aaf1-4968-bc01-51c2bf5a49d8","command":"select","target":"id=alredyEx","value":"label=Selenium Test - IDE - Chrome"},{"id":"5d72fb1d-c9fb-4e31-85e1-91a81997d3e9","command":"clickAt","target":"id=alredyEx","value":"-315,-200"},{"id":"33c71254-3710-4673-9934-28ad19388377","command":"clickAt","target":"css=#addgoalModal > div.modal-dialog > div.modal-content > div.modal-body","value":"156,435"},{"id":"f03b6085-1a2a-49f3-b0f7-181185aff7fa","command":"clickAt","target":"id=compaignPhone","value":"55,12"},{"id":"2a601743-4497-4abb-a6b0-5c6a3e1de019","command":"type","target":"id=compaignPhone","value":"1234567890"},{"id":"8550cc56-b374-4dd0-b6f1-65c44ae4003c","command":"clickAt","target":"id=compaignEmails","value":"324,25"},{"id":"e264ab8b-4a91-4d8e-aff4-0642aa358dc1","command":"type","target":"id=compaignEmails","value":"pawan@bringmax.com"},{"id":"f2419159-4352-4af8-b0c8-c8e90c9b66a5","command":"clickAt","target":"css=#dataTable3 > ul.clearfix","value":"274,108"},{"id":"1266ebed-e303-46db-94a3-744d8dde30a1","command":"clickAt","target":"id=btnAdd","value":"69,10"},{"id":"69c48741-c014-4e91-9417-322a26b4b78b","command":"clickAt","target":"id=btn_addaddEmailsWpr","value":"63,11"},{"id":"2f35bba3-17d5-4969-889b-7846d9646ac2","command":"mouseOver","target":"css=#createCampHead486 > a > div.cName > h2","value":""},{"id":"7f47ddcd-c84f-42ec-b361-0039ce8e637c","command":"clickAt","target":"css=#createCampHead486 > a > div.cName > h2","value":"166,3"},{"id":"9d487bda-b416-45f6-a5f5-da1208e634d3","command":"mouseOut","target":"css=#createCampHead486 > a > div.cName > h2","value":""},{"id":"86395289-39ae-4d80-bd49-8980194eb94e","command":"clickAt","target":"//div[@id='collapse486']/div/div/div/div/div/div/div/div[3]/a","value":"76,61"},{"id":"b575f0db-4144-4ffc-9d7f-f153e543fe5e","command":"clickAt","target":"css=#frmDeleteCurr > div > ul > li","value":"43,11"}]}],"suites":[],"urls":["https://successentellus.com","https://successentellus.com"]}