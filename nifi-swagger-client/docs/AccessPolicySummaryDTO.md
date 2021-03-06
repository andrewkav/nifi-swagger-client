

# AccessPolicySummaryDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**resource** | **String** | The resource for this access policy. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | The action associated with this access policy. |  [optional]
**componentReference** | [**ComponentReferenceEntity**](ComponentReferenceEntity.md) |  |  [optional]
**configurable** | **Boolean** | Whether this policy is configurable. |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;



