

# ConnectionEntity

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
**component** | [**ConnectionDTO**](ConnectionDTO.md) |  |  [optional]
**status** | [**ConnectionStatusDTO**](ConnectionStatusDTO.md) |  |  [optional]
**bends** | [**List&lt;PositionDTO&gt;**](PositionDTO.md) | The bend points on the connection. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**getzIndex** | **Long** | The z index of the connection. |  [optional]
**sourceId** | **String** | The identifier of the source of this connection. |  [optional]
**sourceGroupId** | **String** | The identifier of the group of the source of this connection. |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of component the source connectable is. | 
**destinationId** | **String** | The identifier of the destination of this connection. |  [optional]
**destinationGroupId** | **String** | The identifier of the group of the destination of this connection. |  [optional]
**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) | The type of component the destination connectable is. | 



## Enum: SourceTypeEnum

Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;



## Enum: DestinationTypeEnum

Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;



