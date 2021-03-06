

# FlowBreadcrumbEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of this ancestor ProcessGroup. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**versionedFlowState** | [**VersionedFlowStateEnum**](#VersionedFlowStateEnum) | The current state of the Process Group, as it relates to the Versioned Flow |  [optional]
**breadcrumb** | [**FlowBreadcrumbDTO**](FlowBreadcrumbDTO.md) |  |  [optional]
**parentBreadcrumb** | [**FlowBreadcrumbEntity**](FlowBreadcrumbEntity.md) |  |  [optional]



## Enum: VersionedFlowStateEnum

Name | Value
---- | -----
LOCALLY_MODIFIED | &quot;LOCALLY_MODIFIED&quot;
STALE | &quot;STALE&quot;
LOCALLY_MODIFIED_AND_STALE | &quot;LOCALLY_MODIFIED_AND_STALE&quot;
UP_TO_DATE | &quot;UP_TO_DATE&quot;
SYNC_FAILURE | &quot;SYNC_FAILURE&quot;



