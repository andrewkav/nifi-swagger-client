

# CurrentUserEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity** | **String** | The user identity being serialized. |  [optional]
**anonymous** | **Boolean** | Whether the current user is anonymous. |  [optional]
**provenancePermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**countersPermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**tenantsPermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**controllerPermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**policiesPermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**systemPermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**restrictedComponentsPermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**componentRestrictionPermissions** | [**List&lt;ComponentRestrictionPermissionDTO&gt;**](ComponentRestrictionPermissionDTO.md) | Permissions for specific component restrictions. |  [optional]
**canVersionFlows** | **Boolean** | Whether the current user can version flows. |  [optional]



