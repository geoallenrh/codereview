{"id":"258baba1-2bb3-4c9e-bcd9-502babcce88c","name":"JobReview-taskform.frm","model":{"taskName":"JobReview","processId":"CodeReview.Job","properties":[{"name":"Job","typeInfo":{"type":"OBJECT","className":"com.enterprisearchitecture.codereview.Job","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":true}]}},{"name":"job","typeInfo":{"type":"OBJECT","className":"com.enterprisearchitecture.codereview.Job","multiple":false},"metaData":{"entries":[]}},{"name":"jobID","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"73ca68ef-c84c-42e2-a76b-de69f1ebcef9","container":"FIELD_SET","id":"field_7067976673585614E11","name":"Job","label":"Job","required":false,"readOnly":true,"validateOnChange":true,"binding":"Job","standaloneClassName":"com.enterprisearchitecture.codereview.Job","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"73ca68ef-c84c-42e2-a76b-de69f1ebcef9","container":"FIELD_SET","id":"field_871518891705003E11","name":"job","label":"Job","required":false,"readOnly":false,"validateOnChange":true,"binding":"job","standaloneClassName":"com.enterprisearchitecture.codereview.Job","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"maxLength":100,"placeHolder":"JobID","id":"field_157410721528335E12","name":"jobID","label":"JobID","required":false,"readOnly":false,"validateOnChange":true,"binding":"jobID","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eInputs:\u003c/h3\u003e"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_7067976673585614E11","form_id":"258baba1-2bb3-4c9e-bcd9-502babcce88c"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_871518891705003E11","form_id":"258baba1-2bb3-4c9e-bcd9-502babcce88c"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_157410721528335E12","form_id":"258baba1-2bb3-4c9e-bcd9-502babcce88c"},"parts":[]}]}]}]}}