

# VersionedFlowSnapshotEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionedFlowSnapshot** | [**VersionedFlowSnapshot**](VersionedFlowSnapshot.md) |  |  [optional]
**processGroupRevision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**registryId** | **String** | The ID of the Registry that this flow belongs to |  [optional]
**updateDescendantVersionedFlows** | **Boolean** | If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]



