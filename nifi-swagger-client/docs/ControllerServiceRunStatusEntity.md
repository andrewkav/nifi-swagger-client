

# ControllerServiceRunStatusEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The run status of the ControllerService. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;



