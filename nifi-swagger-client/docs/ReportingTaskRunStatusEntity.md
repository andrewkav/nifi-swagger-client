

# ReportingTaskRunStatusEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The run status of the ReportingTask. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;



