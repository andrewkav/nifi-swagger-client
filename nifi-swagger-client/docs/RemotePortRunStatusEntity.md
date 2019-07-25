

# RemotePortRunStatusEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The run status of the RemotePort. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
TRANSMITTING | &quot;TRANSMITTING&quot;
STOPPED | &quot;STOPPED&quot;



