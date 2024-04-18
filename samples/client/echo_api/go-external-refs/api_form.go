/*
Echo Server API

Echo Server API

API version: 0.1.0
Contact: team@openapitools.org
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
)


// FormAPIService FormAPI service
type FormAPIService service

type ApiTestFormIntegerBooleanStringRequest struct {
	ctx context.Context
	ApiService *FormAPIService
	integerForm *int32
	booleanForm *bool
	stringForm *string
}

func (r ApiTestFormIntegerBooleanStringRequest) IntegerForm(integerForm int32) ApiTestFormIntegerBooleanStringRequest {
	r.integerForm = &integerForm
	return r
}

func (r ApiTestFormIntegerBooleanStringRequest) BooleanForm(booleanForm bool) ApiTestFormIntegerBooleanStringRequest {
	r.booleanForm = &booleanForm
	return r
}

func (r ApiTestFormIntegerBooleanStringRequest) StringForm(stringForm string) ApiTestFormIntegerBooleanStringRequest {
	r.stringForm = &stringForm
	return r
}

func (r ApiTestFormIntegerBooleanStringRequest) Execute() (string, *http.Response, error) {
	return r.ApiService.TestFormIntegerBooleanStringExecute(r)
}

/*
TestFormIntegerBooleanString Test form parameter(s)

Test form parameter(s)

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiTestFormIntegerBooleanStringRequest
*/
func (a *FormAPIService) TestFormIntegerBooleanString(ctx context.Context) ApiTestFormIntegerBooleanStringRequest {
	return ApiTestFormIntegerBooleanStringRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return string
func (a *FormAPIService) TestFormIntegerBooleanStringExecute(r ApiTestFormIntegerBooleanStringRequest) (string, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  string
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FormAPIService.TestFormIntegerBooleanString")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/form/integer/boolean/string"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/x-www-form-urlencoded"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"text/plain"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.integerForm != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "integer_form", r.integerForm, "")
	}
	if r.booleanForm != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "boolean_form", r.booleanForm, "")
	}
	if r.stringForm != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "string_form", r.stringForm, "")
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiTestFormOneofRequest struct {
	ctx context.Context
	ApiService *FormAPIService
	form1 *string
	form2 *int32
	form3 *string
	form4 *bool
	id *int64
	name *string
}

func (r ApiTestFormOneofRequest) Form1(form1 string) ApiTestFormOneofRequest {
	r.form1 = &form1
	return r
}

func (r ApiTestFormOneofRequest) Form2(form2 int32) ApiTestFormOneofRequest {
	r.form2 = &form2
	return r
}

func (r ApiTestFormOneofRequest) Form3(form3 string) ApiTestFormOneofRequest {
	r.form3 = &form3
	return r
}

func (r ApiTestFormOneofRequest) Form4(form4 bool) ApiTestFormOneofRequest {
	r.form4 = &form4
	return r
}

func (r ApiTestFormOneofRequest) Id(id int64) ApiTestFormOneofRequest {
	r.id = &id
	return r
}

func (r ApiTestFormOneofRequest) Name(name string) ApiTestFormOneofRequest {
	r.name = &name
	return r
}

func (r ApiTestFormOneofRequest) Execute() (string, *http.Response, error) {
	return r.ApiService.TestFormOneofExecute(r)
}

/*
TestFormOneof Test form parameter(s) for oneOf schema

Test form parameter(s) for oneOf schema

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiTestFormOneofRequest
*/
func (a *FormAPIService) TestFormOneof(ctx context.Context) ApiTestFormOneofRequest {
	return ApiTestFormOneofRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return string
func (a *FormAPIService) TestFormOneofExecute(r ApiTestFormOneofRequest) (string, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  string
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FormAPIService.TestFormOneof")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/form/oneof"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/x-www-form-urlencoded"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"text/plain"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.form1 != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "form1", r.form1, "")
	}
	if r.form2 != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "form2", r.form2, "")
	}
	if r.form3 != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "form3", r.form3, "")
	}
	if r.form4 != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "form4", r.form4, "")
	}
	if r.id != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "id", r.id, "")
	}
	if r.name != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "name", r.name, "")
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
