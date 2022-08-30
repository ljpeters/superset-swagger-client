# Body5

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formData** | [**File**](File.md) | upload file (ZIP) |  [optional]
**overwrite** | **Boolean** | overwrite existing saved queries? |  [optional]
**passwords** | **String** | JSON map of passwords for each featured database in the ZIP file. If the ZIP includes a database config in the path &#x60;databases/MyDatabase.yaml&#x60;, the password should be provided in the following format: &#x60;{\&quot;databases/MyDatabase.yaml\&quot;: \&quot;my_password\&quot;}&#x60;. |  [optional]
