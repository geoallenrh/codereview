{"id":"3d8cb329-d87f-41b2-9655-78bbaf577af4","name":"CodeReview.ManageUser-taskform.frm","model":{"processName":"Manage User","processId":"CodeReview.ManageUser","properties":[{"name":"User","typeInfo":{"type":"OBJECT","className":"com.enterprisearchitecture.codereview.Requester","multiple":false},"metaData":{"entries":[]}},{"name":"userID","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"4351b319-5fd9-4cdb-8b83-1e7d8174cb3c","container":"FIELD_SET","id":"field_4838575494877606E11","name":"User","label":"User","required":false,"readOnly":false,"validateOnChange":true,"binding":"User","standaloneClassName":"com.enterprisearchitecture.codereview.Requester","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"maxLength":100,"placeHolder":"UserID","id":"field_0287802987345725E12","name":"userID","label":"UserID","required":false,"readOnly":false,"validateOnChange":true,"binding":"userID","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_4838575494877606E11","form_id":"3d8cb329-d87f-41b2-9655-78bbaf577af4"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_0287802987345725E12","form_id":"3d8cb329-d87f-41b2-9655-78bbaf577af4"},"parts":[]}]}]}]}}