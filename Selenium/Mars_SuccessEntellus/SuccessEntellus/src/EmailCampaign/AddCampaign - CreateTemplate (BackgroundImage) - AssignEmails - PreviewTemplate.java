{"id":"f5afb224-506a-4a37-8634-4b60cc4826ab","name":"EmailCampaign","url":"https://successentellus.com","tests":[{"id":"d8e8cf0d-efba-4e56-9699-ee91b01219ce","name":"AddCampaign - CreateTemplate (Blank) - AssignEmails - PreviewTemplate","commands":[{"id":"3e11b26c-4f1b-44d9-9b1d-c7e07966aff3","command":"open","target":"/login","value":""},{"id":"71e83ef1-8c4e-4f2b-aad4-9d28b1135e33","command":"type","target":"id=pwd","value":"BringQA"},{"id":"fe3ebe83-a378-4c9c-9614-5810d49a7841","command":"clickAt","target":"id=email","value":"233,13"},{"id":"635fac46-6651-4c82-a1e6-69e8e5d6830d","command":"clickAt","target":"id=pwd","value":"188,21"},{"id":"0936f8c1-406f-444a-8470-3931e3aabf7e","command":"type","target":"id=pwd","value":"Bring"},{"id":"a64c6fe8-ff39-4560-93e1-e5a7bd1cb058","command":"clickAt","target":"id=btn_add","value":"184,20"},{"id":"2c509240-0985-49e2-997d-60096a474d77","command":"clickAt","target":"css=a[title=\"Campaign\"] > span","value":"48,7"},{"id":"b541ca46-4f52-4770-818d-651e1a78fadf","command":"clickAt","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":"64,11"},{"id":"1f7a8158-ea20-43d0-8e4c-27a9ea375899","command":"mouseOver","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":""},{"id":"2ad33580-2b09-4839-b4c5-2d374c7bcd7c","command":"mouseOut","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":""},{"id":"b6ed2db6-a381-45ad-a21d-95376b506b5d","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"213,27"},{"id":"99cd3e09-4911-4e47-921f-f87d2a321924","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"Selenium Test - IDE - Chrome"},{"id":"dc08c1f6-e1d1-49e5-a13a-b141f2281176","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm","value":"146,153"},{"id":"5b547d84-fa3a-49a8-ba4c-47be31f01167","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent","value":"testing with chrome Selenium IDE"},{"id":"363deb94-7513-4891-8ccb-7ab31a5e94e4","command":"clickAt","target":"id=btnSave","value":"34,15"},{"id":"b9f0c447-7076-44ae-89e6-06264b6b0257","command":"clickAt","target":"css=#createCampHead486 > div.cRtLink > ul.clearfix > li.dropdown > a > i.glyphicon.glyphicon-option-vertical","value":"9,20"},{"id":"104d940f-35a4-421e-87d7-048853b9738b","command":"clickAt","target":"css=li.dropdown.open > div.dropdown-menu > a","value":"99,13"},{"id":"e15f2887-0646-4b2d-a9a7-0e0e9c086d1b","command":"clickAt","target":"css=div.overlay > span","value":"38,11"},{"id":"0536a788-d508-4cb7-b6ab-faaf1c938aaf","command":"clickAt","target":"id=campaignStepSubject","value":"253,24"},{"id":"0b4657db-d3bf-4f13-a0cc-0f0159157cc5","command":"type","target":"id=campaignStepSubject","value":"Selenium IDE - subject added"},{"id":"96fc70ab-4871-4664-83c1-58249a459c3a","command":"clickAt","target":"id=userTemplateTitle","value":"179,14"},{"id":"c6ace13c-f5f2-4c1b-b8a5-5e6388599844","command":"type","target":"id=userTemplateTitle","value":"Heading with blank template"},{"id":"c6b6bef6-75d0-470f-84c7-40cbe5ef4a03","command":"selectFrame","target":"index=0","value":""},{"id":"bb375b46-eca1-4ef2-bcf3-eac80d90d330","command":"clickAt","target":"css=html","value":"161,18"},{"id":"3800b545-470a-4dc4-b24a-3bad69045af7","command":"editContent","target":"//body","value":"<p>Hi {firstName},<br></p><p><br></p><p>Pawan sasane - testing for email campaign</p>"},{"id":"8c627eb2-64e6-4ec8-a2e8-7b3dfa252f40","command":"selectFrame","target":"relative=parent","value":""},{"id":"bb013ac0-c27f-455c-9f5e-de155e7cc8e1","command":"clickAt","target":"id=btnSave","value":"39,15"},{"id":"9fcf35b5-f75b-46e4-b2b6-ea1fad303744","command":"clickAt","target":"id=timeInterval","value":"32,15"},{"id":"0bc1f980-20a1-4140-8ddc-884599204a03","command":"type","target":"id=timeInterval","value":"1"},{"id":"74650cad-3565-40c0-93cb-fec0e5086917","command":"clickAt","target":"id=type","value":"25,17"},{"id":"aeb399e0-d109-4e27-983b-db78624e78d3","command":"select","target":"id=type","value":"label=Days"},{"id":"a02f933e-cfbc-407b-8095-f7d69daff4a7","command":"clickAt","target":"id=type","value":"-1124,-363"},{"id":"4ac84dbc-1afd-4156-95be-e04cf4f1dc1b","command":"clickAt","target":"id=btnSave","value":"81,16"},{"id":"02e8cf4c-ae2f-4725-8384-709eb6ad0b53","command":"clickAt","target":"id=btnSave","value":"81,16"},{"id":"ae418f64-1a6b-49e9-ac97-18cccf15b636","command":"clickAt","target":"//a[contains(text(),'My Campaign')]","value":"25,19"},{"id":"960d8bbf-3c49-45e9-b0b3-6dbbef5c0ca1","command":"clickAt","target":"css=a.btn.bg-orange","value":"106,15"},{"id":"cb00dac4-8154-4904-b8cc-9f0f9a1e3386","command":"clickAt","target":"id=compaignFirstName","value":"255,6"},{"id":"1af09913-2d9a-4b27-98f9-729093bcfb58","command":"type","target":"id=compaignFirstName","value":"Pawan"},{"id":"b972e8e5-0bb2-4529-8c2a-bf9400433c26","command":"clickAt","target":"id=compaignLastName","value":"23,19"},{"id":"1222bee0-ed5e-4731-940a-6199ad4534c4","command":"type","target":"id=compaignLastName","value":"Sasane"},{"id":"94c9a06a-6af4-4ed3-b942-db8a6d984363","command":"clickAt","target":"id=alredyEx","value":"250,28"},{"id":"829ec4bf-aaf1-4968-bc01-51c2bf5a49d8","command":"select","target":"id=alredyEx","value":"label=Selenium Test - IDE - Chrome"},{"id":"5d72fb1d-c9fb-4e31-85e1-91a81997d3e9","command":"clickAt","target":"id=alredyEx","value":"-315,-200"},{"id":"33c71254-3710-4673-9934-28ad19388377","command":"clickAt","target":"css=#addgoalModal > div.modal-dialog > div.modal-content > div.modal-body","value":"156,435"},{"id":"f03b6085-1a2a-49f3-b0f7-181185aff7fa","command":"clickAt","target":"id=compaignPhone","value":"55,12"},{"id":"2a601743-4497-4abb-a6b0-5c6a3e1de019","command":"type","target":"id=compaignPhone","value":"1234567890"},{"id":"8550cc56-b374-4dd0-b6f1-65c44ae4003c","command":"clickAt","target":"id=compaignEmails","value":"324,25"},{"id":"e264ab8b-4a91-4d8e-aff4-0642aa358dc1","command":"type","target":"id=compaignEmails","value":"pawan@bringmax.com"},{"id":"f2419159-4352-4af8-b0c8-c8e90c9b66a5","command":"clickAt","target":"css=#dataTable3 > ul.clearfix","value":"274,108"},{"id":"1266ebed-e303-46db-94a3-744d8dde30a1","command":"clickAt","target":"id=btnAdd","value":"69,10"},{"id":"69c48741-c014-4e91-9417-322a26b4b78b","command":"clickAt","target":"id=btn_addaddEmailsWpr","value":"63,11"},{"id":"2f35bba3-17d5-4969-889b-7846d9646ac2","command":"mouseOver","target":"css=#createCampHead486 > a > div.cName > h2","value":""},{"id":"7f47ddcd-c84f-42ec-b361-0039ce8e637c","command":"clickAt","target":"css=#createCampHead486 > a > div.cName > h2","value":"166,3"},{"id":"9d487bda-b416-45f6-a5f5-da1208e634d3","command":"mouseOut","target":"css=#createCampHead486 > a > div.cName > h2","value":""},{"id":"86395289-39ae-4d80-bd49-8980194eb94e","command":"clickAt","target":"//div[@id='collapse486']/div/div/div/div/div/div/div/div[3]/a","value":"76,61"},{"id":"b575f0db-4144-4ffc-9d7f-f153e543fe5e","command":"clickAt","target":"css=#frmDeleteCurr > div > ul > li","value":"43,11"}]},{"id":"353f1e1e-35ef-45d3-8927-26860199e9c0","name":"AddCampaign - ImportTemplate - AssignEmails - PreviewTemplate","commands":[{"id":"2a2419bb-2828-41fc-a624-2c585f98bcfd","command":"open","target":"/campaign","value":""},{"id":"c06ffcb0-fa60-433c-bc65-7dd2ed53772d","command":"clickAt","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":"109,13"},{"id":"3c335b32-6391-4c51-888a-092c391e3a96","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"234,12"},{"id":"8cf6b439-6f96-4306-a547-fd02807c2782","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"Import template testing"},{"id":"3115c83c-e245-43b2-a1d8-e21cdd3cdc20","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent","value":"176,11"},{"id":"2843356e-dced-4bbe-816d-ced3284901c1","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent","value":"testing for import template feature in email campaign"},{"id":"e7b7aeaf-31ff-4725-838b-ce325bd546ca","command":"clickAt","target":"id=btnSave","value":"63,21"},{"id":"f226a952-147c-45ad-a0b1-317cd56638f8","command":"mouseOver","target":"css=#createCampHead486 > a > div.cName","value":""},{"id":"dc775ce5-e1f7-4303-bf0e-a2405db46c71","command":"mouseOver","target":"//div[@id='createCampHead487']/div[3]/ul/li[2]/a/i","value":""},{"id":"f7087ea1-b1bb-47d0-9f45-9cdcd6e44758","command":"mouseOut","target":"//div[@id='createCampHead487']/div[3]/ul/li[2]/a/i","value":""},{"id":"ba7717b3-175d-46fb-afa6-20ee5aa62b8d","command":"clickAt","target":"css=#createCampHead487 > div.cRtLink > ul.clearfix > li.dropdown > a > i.glyphicon.glyphicon-option-vertical","value":"9,13"},{"id":"70b8dea7-2a3c-4895-be2c-0efb70e63c59","command":"clickAt","target":"//div[@id='createCampHead487']/div[3]/ul/li/div/a[2]/span[2]","value":"71,9"},{"id":"1c02a0fc-7057-4671-9d05-ad6c97fabc37","command":"mouseOver","target":"//div[@id='createCampHead487']/div[3]/ul/li/div/a[2]/span[2]","value":""},{"id":"ae03f615-80f8-4b87-950a-b2a92366f40b","command":"mouseOut","target":"//div[@id='createCampHead487']/div[3]/ul/li/div/a[2]/span[2]","value":""},{"id":"a6b96810-12ef-4ad8-bad4-5bc033ac2a14","command":"clickAt","target":"id=fetureCampainID487","value":"337,3175"},{"id":"d969a20f-176b-4028-96e3-e1288d359cc4","command":"select","target":"id=fetureCampainID487","value":"label=Drip List"},{"id":"0db05788-4c1d-473a-80a5-9e5c544491af","command":"clickAt","target":"id=fetureCampainID487","value":"-399,2851"},{"id":"8991e710-67ca-40da-b212-a37ef94edebd","command":"clickAt","target":"id=contact0","value":"8,3159"},{"id":"e1e3f7b6-38eb-4bc8-ae4a-e20c20720924","command":"clickAt","target":"id=btnUpdatefetureCampainID487","value":"24,3178"},{"id":"95141417-7ec8-406e-8b8f-324c7c3ab423","command":"clickAt","target":"css=#createCampHead487 > a > div.cName","value":"258,26"},{"id":"b89b918e-cf88-484e-b98d-4a1f0cb52922","command":"clickAt","target":"css=a.btn.bg-orange > span > img","value":"20,11"},{"id":"6e784c24-3d74-49aa-b417-21996e3b5ed8","command":"clickAt","target":"id=compaignFirstName","value":"202,22"},{"id":"8bec4ab5-9cf3-4bd1-8103-f0b4eb0820f9","command":"type","target":"id=compaignFirstName","value":"Pawan"},{"id":"a8d94193-a821-445e-91e9-ce1413799b3b","command":"type","target":"id=compaignLastName","value":"Sasane"},{"id":"0dcf513a-5262-424e-a2e2-f540b0537639","command":"clickAt","target":"id=alredyEx","value":"154,9"},{"id":"931dd4e6-1022-4409-9e54-02afa06f9bd7","command":"select","target":"id=alredyEx","value":"label=Import template testing"},{"id":"5000d49b-8a0b-49ab-b5ab-94070cbf7c9b","command":"clickAt","target":"id=alredyEx","value":"-315,-200"},{"id":"42d3e8bd-1906-4b0f-b90a-bb3abc9126dd","command":"clickAt","target":"id=compaignPhone","value":"81,6"},{"id":"e55b3b20-0294-4b18-91ea-6d5095a339b3","command":"type","target":"id=compaignPhone","value":"12345678790"},{"id":"a6790592-3822-40d6-849f-aa6b3875a65f","command":"clickAt","target":"id=compaignEmails","value":"313,17"},{"id":"8426e119-3929-4a43-82ec-46cb3f12844b","command":"type","target":"id=compaignEmails","value":"pawand.sasane@gmail.com"},{"id":"02be3509-9f40-4085-be02-81ac01c6e670","command":"clickAt","target":"id=btnAdd","value":"116,15"},{"id":"c279a688-99ab-49c1-8727-be1c1f8fe995","command":"clickAt","target":"id=btn_addaddEmailsWpr","value":"76,20"},{"id":"e1799612-7e39-4d93-ad46-702a7e476605","command":"clickAt","target":"css=#createCampHead487 > a > div.cName","value":"205,26"},{"id":"5f8596b1-dbea-48f4-847c-d05cc311c3f1","command":"mouseOver","target":"css=#createCampHead487 > a > div.cName > h2","value":""},{"id":"7a4099bd-7075-44fb-b87e-398c360657f4","command":"mouseOut","target":"css=#createCampHead487 > a > div.cName > h2","value":""},{"id":"864a9dce-17f8-4a4f-99d1-041ab8438878","command":"clickAt","target":"//div[@id='collapse487']/div/div/div/div/div/div/div/div[3]/a","value":"70,63"},{"id":"b4f103eb-957c-47ee-9c56-e36ed7a5a6b3","command":"clickAt","target":"css=#frmDeleteCurr > div > ul > li","value":"52,14"}]},{"id":"6d787c38-4b09-4a41-b913-3df8d9e0c316","name":"AddCampaign - CreateTemplate (BackgroundImage) - AssignEmails - PreviewTemplate","commands":[{"id":"4a480bd5-8d9d-47da-95d5-d8e38599805f","command":"open","target":"/campaign","value":""},{"id":"fc90241c-2a84-425d-a895-c8165f0b13fc","command":"clickAt","target":"//a[@onclick=\"$('#addCampaignModal').modal();\"]","value":"94,10"},{"id":"e9e01fc5-7e03-4e00-8fd2-a0e8e55015a5","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"157,22"},{"id":"1bb3d305-233b-4f35-a158-9c258d2a55bf","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"84,20"},{"id":"836dcb49-532d-4d5c-bf7f-4ba951d42624","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"124,18"},{"id":"415afdf3-3c5f-43aa-8198-2f305eab8bc0","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignTitle","value":"Background Image Template"},{"id":"e32cd9b9-b00c-4e03-8734-ee836f69c4b4","command":"clickAt","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent","value":"68,16"},{"id":"eccabf3c-16b6-4104-b87d-d57a3eafea75","command":"type","target":"css=#addCampaignModal > div.modal-dialog > div.modal-content > div.modal-body > #frm > div.form-group > div.col-sm-12 > div.input-group > #campaignContent","value":"testing for template which is having background image"},{"id":"5b605917-cfa2-47f4-bcf5-04fa5ec69898","command":"clickAt","target":"id=btnSave","value":"32,16"},{"id":"1703e558-6671-4d95-8f4c-ae599be96b32","command":"mouseOver","target":"css=#createCampHead487 > a > div.cName","value":""},{"id":"40591f6c-5d14-4651-974a-7a3a7a06b70e","command":"clickAt","target":"css=#createCampHead488 > div.cRtLink > ul.clearfix > li.dropdown > a > i.glyphicon.glyphicon-option-vertical","value":"11,14"},{"id":"365f2716-9d8e-4a49-9faf-0305beca547d","command":"mouseOver","target":"css=#createCampHead488 > div.cRtLink > ul.clearfix > li.dropdown > a > i.glyphicon.glyphicon-option-vertical","value":""},{"id":"bbc7ce1b-adbb-425b-8f87-36b397cbc02f","command":"mouseOut","target":"css=li.dropdown.open > a > i.glyphicon.glyphicon-option-vertical","value":""},{"id":"c2bd7e19-c86c-40ff-8f9a-0d8e829d6e82","command":"clickAt","target":"css=li.dropdown.open > div.dropdown-menu > a","value":"81,13"},{"id":"26cc1769-6286-4fa6-957a-7783ee042cda","command":"clickAt","target":"//form[@id='addCampaign']/div/ul/li[2]/a/div/span","value":"34,17"},{"id":"2b2d2d75-e36d-411f-9061-cf1fc22f00b8","command":"clickAt","target":"id=campaignStepSubject","value":"134,9"},{"id":"58e81517-f9b4-4e27-957d-41b40ea517a1","command":"type","target":"id=campaignStepSubject","value":"Background Image template"},{"id":"c1569944-73dc-485b-b73d-5f4463ef001f","command":"clickAt","target":"id=userTemplateTitle","value":"132,22"},{"id":"38e3b8dd-23b4-4aeb-af4e-d72766b477f4","command":"type","target":"id=userTemplateTitle","value":"heading"},{"id":"7fa1c979-cf86-4551-8038-7070aa2f17da","command":"selectFrame","target":"index=0","value":""},{"id":"a9909f80-08dc-450b-acb0-0d5a897cee40","command":"clickAt","target":"//body","value":"177,28"},{"id":"eff19a30-e49f-4f91-bcfe-487257f0536a","command":"selectFrame","target":"relative=parent","value":""},{"id":"eef7dc36-dd61-4c1f-a9b8-ab9e7b30d84c","command":"runScript","target":["window.scrollTo(0,220)"],"value":""},{"id":"7d279f67-3960-423e-8ebf-87ddf74569ab","command":"selectFrame","target":"index=0","value":""},{"id":"e9fea2d0-8b6d-4acb-9a0f-6ce63ff5be92","command":"editContent","target":"//body","value":"<p>Hi {firstName},<br></p><p><br></p><p>Testing on 10th march 2018</p><div id=\"selenium-highlight\"></div>"},{"id":"9e25db56-ebc1-4003-8043-c0f990765f96","command":"selectFrame","target":"relative=parent","value":""},{"id":"586845ad-ce8f-4e34-95eb-dad9685a91cd","command":"clickAt","target":"id=btnSave","value":"67,13"},{"id":"75ac6b85-8944-4cf2-afc2-bed5fdd36469","command":"mouseDownAt","target":"id=timeInterval","value":"6,16"},{"id":"eb875418-2327-462e-8dd2-4afa45b638f7","command":"mouseMoveAt","target":"id=timeInterval","value":"6,16"},{"id":"564dcd03-ff62-4abc-ba3c-6f38edc0f3d6","command":"mouseUpAt","target":"id=timeInterval","value":"6,16"},{"id":"8ad03823-ee72-42c7-99ca-9a6500ddcee9","command":"clickAt","target":"id=timeInterval","value":"6,16"},{"id":"328d52e5-82ad-4771-8d1f-846965dcb299","command":"type","target":"id=timeInterval","value":"2"},{"id":"856798be-63e9-4493-bb41-ee043e81e444","command":"clickAt","target":"id=type","value":"36,24"},{"id":"030e41fc-bcfc-4b03-940e-18af6fea79b1","command":"select","target":"id=type","value":"label=Weeks"},{"id":"614fadc8-ca1c-4a23-acba-8ac950600dc9","command":"clickAt","target":"id=type","value":"-1124,-363"},{"id":"77900a0b-dc50-4f1f-ae26-f6088a00524e","command":"clickAt","target":"id=btnSave","value":"85,16"},{"id":"991d4959-d193-42d8-8e8e-6421666d3a6d","command":"clickAt","target":"//a[contains(text(),'My Campaign')]","value":"28,10"},{"id":"ab7fe3e8-871d-453d-a500-f834e46c4564","command":"mouseOver","target":"css=#createCampHead487 > a > div.cName > h2","value":""},{"id":"371a1694-1d47-46b0-8121-77ab5aded5ac","command":"mouseOut","target":"css=#createCampHead487 > a > div.cName > h2","value":""},{"id":"6796a862-951f-4bc1-b108-a1aca8e16969","command":"mouseOver","target":"css=#createCampHead488 > a > div.cName > h2","value":""},{"id":"8279383b-9dda-49df-8415-8d3c347811a2","command":"clickAt","target":"css=#createCampHead488 > a > div.cName > h2","value":"83,7"},{"id":"7f0c8ed0-27d4-4df1-84af-a2beaa0ef46a","command":"mouseOut","target":"css=#createCampHead488 > a > div.cName > h2","value":""},{"id":"ed35827b-6707-443a-9934-1349335961ff","command":"clickAt","target":"css=a.btn.bg-orange","value":"89,10"},{"id":"00451e9d-5ac2-46fe-bdbc-d20c5116a1d1","command":"clickAt","target":"id=compaignFirstName","value":"205,14"},{"id":"25db1b08-97cb-4afa-be8a-78bb7443b80c","command":"type","target":"id=compaignFirstName","value":"Pawan"},{"id":"3dc04b5e-b3a7-4332-8167-1efbe9ce0c6f","command":"clickAt","target":"id=compaignLastName","value":"38,25"},{"id":"a20bcaf4-7a3e-4e32-aa46-8004f722a5fd","command":"type","target":"id=compaignLastName","value":"Sasane"},{"id":"0a670b20-b6cc-4592-adef-34948a03d5a9","command":"clickAt","target":"id=alredyEx","value":"285,15"},{"id":"3b437c49-66cb-463c-8335-6faaebbe939e","command":"select","target":"id=alredyEx","value":"label=Background Image Template"},{"id":"4424b312-a7c3-4559-9811-006f596c5ec2","command":"clickAt","target":"id=alredyEx","value":"-315,-200"},{"id":"8b5bcb76-5248-4ea0-b092-cc0b17b7d867","command":"clickAt","target":"id=compaignPhone","value":"53,15"},{"id":"a9b81492-19c6-4c72-ba86-ed115d840387","command":"type","target":"id=compaignPhone","value":"1234567890"},{"id":"703af81a-62d1-4ae9-b253-c327d8ec8cb4","command":"clickAt","target":"id=compaignEmails","value":"299,33"},{"id":"998e05c0-48de-43e5-b678-19c963c744de","command":"type","target":"id=compaignEmails","value":"pawand.sasane@aol.com"},{"id":"ff4a0a8c-e712-4526-b6d2-758ca331880d","command":"clickAt","target":"id=btnAdd","value":"112,17"},{"id":"9c36f818-10d6-4fd4-b93c-9681ffb28c0f","command":"clickAt","target":"id=btn_addaddEmailsWpr","value":"78,16"},{"id":"6a0ede85-3d1f-4a2c-9a5f-8ec50031fc6c","command":"mouseOver","target":"css=#createCampHead488 > a > div.cName > h2","value":""},{"id":"a4d00c19-ae33-4ff2-8c9a-b0214e2efb3d","command":"clickAt","target":"css=#createCampHead488 > a > div.cName > h2","value":"145,1"},{"id":"6cba32ed-76c2-460a-bb6a-c72e0d64b47c","command":"mouseOut","target":"css=#createCampHead488 > a > div.cName > h2","value":""},{"id":"07581298-6fd4-42aa-86f0-63504c317df0","command":"mouseOver","target":"css=#createCampHead488 > a > div.cName > h2","value":""},{"id":"c18ea23b-deee-4db6-b484-0b06dfaaeaad","command":"mouseOut","target":"css=#createCampHead488 > a > div.cName > h2","value":""},{"id":"ca313fd2-4939-48be-8b9c-b5c71584efa5","command":"clickAt","target":"//div[@id='collapse488']/div/div/div/div/div/div/div/div[3]/a","value":"66,64"},{"id":"979879b7-aa28-43b7-ad10-e2aa7c5f8490","command":"mouseOver","target":"id=chkexist0","value":""},{"id":"dd36e3ad-ce38-499b-8e77-362ba124a6ce","command":"mouseOut","target":"id=chkexist0","value":""}]}],"suites":[],"urls":["https://successentellus.com","https://successentellus.com","https://successentellus.com","https://successentellus.com"]}