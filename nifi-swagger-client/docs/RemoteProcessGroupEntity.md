

# RemoteProcessGroupEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**id** | **String** | The id of the component. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**component** | [**RemoteProcessGroupDTO**](RemoteProcessGroupDTO.md) |  |  [optional]
**status** | [**RemoteProcessGroupStatusDTO**](RemoteProcessGroupStatusDTO.md) |  |  [optional]
**inputPortCount** | **Integer** | The number of remote input ports currently available on the target. |  [optional]
**outputPortCount** | **Integer** | The number of remote output ports currently available on the target. |  [optional]
**operatePermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]



