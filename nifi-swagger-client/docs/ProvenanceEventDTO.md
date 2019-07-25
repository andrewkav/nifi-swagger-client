

# ProvenanceEventDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The event uuid. |  [optional]
**eventId** | **Long** | The event id. This is a one up number thats unique per node. |  [optional]
**eventTime** | **String** | The timestamp of the event. |  [optional]
**eventDuration** | **Long** | The event duration in milliseconds. |  [optional]
**lineageDuration** | **Long** | The duration since the lineage began, in milliseconds. |  [optional]
**eventType** | **String** | The type of the event. |  [optional]
**flowFileUuid** | **String** | The uuid of the flowfile for the event. |  [optional]
**fileSize** | **String** | The size of the flowfile for the event. |  [optional]
**fileSizeBytes** | **Long** | The size of the flowfile in bytes for the event. |  [optional]
**clusterNodeId** | **String** | The identifier for the node where the event originated. |  [optional]
**clusterNodeAddress** | **String** | The label for the node where the event originated. |  [optional]
**groupId** | **String** | The id of the group that the component resides in. If the component is no longer in the flow, the group id will not be set. |  [optional]
**componentId** | **String** | The id of the component that generated the event. |  [optional]
**componentType** | **String** | The type of the component that generated the event. |  [optional]
**componentName** | **String** | The name of the component that generated the event. |  [optional]
**sourceSystemFlowFileId** | **String** | The source system flowfile id. |  [optional]
**alternateIdentifierUri** | **String** | The alternate identifier uri for the fileflow for the event. |  [optional]
**attributes** | [**List&lt;AttributeDTO&gt;**](AttributeDTO.md) | The attributes of the flowfile for the event. |  [optional]
**parentUuids** | **List&lt;String&gt;** | The parent uuids for the event. |  [optional]
**childUuids** | **List&lt;String&gt;** | The child uuids for the event. |  [optional]
**transitUri** | **String** | The source/destination system uri if the event was a RECEIVE/SEND. |  [optional]
**relationship** | **String** | The relationship to which the flowfile was routed if the event is of type ROUTE. |  [optional]
**details** | **String** | The event details. |  [optional]
**contentEqual** | **Boolean** | Whether the input and output content claim is the same. |  [optional]
**inputContentAvailable** | **Boolean** | Whether the input content is still available. |  [optional]
**inputContentClaimSection** | **String** | The section in which the input content claim lives. |  [optional]
**inputContentClaimContainer** | **String** | The container in which the input content claim lives. |  [optional]
**inputContentClaimIdentifier** | **String** | The identifier of the input content claim. |  [optional]
**inputContentClaimOffset** | **Long** | The offset into the input content claim where the flowfiles content begins. |  [optional]
**inputContentClaimFileSize** | **String** | The file size of the input content claim formatted. |  [optional]
**inputContentClaimFileSizeBytes** | **Long** | The file size of the intput content claim in bytes. |  [optional]
**outputContentAvailable** | **Boolean** | Whether the output content is still available. |  [optional]
**outputContentClaimSection** | **String** | The section in which the output content claim lives. |  [optional]
**outputContentClaimContainer** | **String** | The container in which the output content claim lives. |  [optional]
**outputContentClaimIdentifier** | **String** | The identifier of the output content claim. |  [optional]
**outputContentClaimOffset** | **Long** | The offset into the output content claim where the flowfiles content begins. |  [optional]
**outputContentClaimFileSize** | **String** | The file size of the output content claim formatted. |  [optional]
**outputContentClaimFileSizeBytes** | **Long** | The file size of the output content claim in bytes. |  [optional]
**replayAvailable** | **Boolean** | Whether or not replay is available. |  [optional]
**replayExplanation** | **String** | Explanation as to why replay is unavailable. |  [optional]
**sourceConnectionIdentifier** | **String** | The identifier of the queue/connection from which the flowfile was pulled to genereate this event. May be null if the queue/connection is unknown or the flowfile was generated from this event. |  [optional]


