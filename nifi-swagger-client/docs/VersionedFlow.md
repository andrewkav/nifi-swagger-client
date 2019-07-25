

# VersionedFlow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**Link**](Link.md) |  |  [optional]
**identifier** | **String** | An ID to uniquely identify this object. |  [optional]
**name** | **String** | The name of the item. | 
**description** | **String** | A description of the item. |  [optional]
**bucketIdentifier** | **String** | The identifier of the bucket this items belongs to. This cannot be changed after the item is created. | 
**bucketName** | **String** | The name of the bucket this items belongs to. |  [optional]
**createdTimestamp** | **Long** | The timestamp of when the item was created, as milliseconds since epoch. |  [optional]
**modifiedTimestamp** | **Long** | The timestamp of when the item was last modified, as milliseconds since epoch. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of item. | 
**permissions** | [**Permissions**](Permissions.md) |  |  [optional]
**versionCount** | **Long** | The number of versions of this flow. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FLOW | &quot;Flow&quot;



