/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserPoolDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name
     * Service (DNS) provider.
     * </p>
     */
    private String cloudFrontDomain;

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name
     * Service (DNS) provider.
     * </p>
     * 
     * @param cloudFrontDomain
     *        The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain
     *        Name Service (DNS) provider.
     */

    public void setCloudFrontDomain(String cloudFrontDomain) {
        this.cloudFrontDomain = cloudFrontDomain;
    }

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name
     * Service (DNS) provider.
     * </p>
     * 
     * @return The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain
     *         Name Service (DNS) provider.
     */

    public String getCloudFrontDomain() {
        return this.cloudFrontDomain;
    }

    /**
     * <p>
     * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name
     * Service (DNS) provider.
     * </p>
     * 
     * @param cloudFrontDomain
     *        The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain
     *        Name Service (DNS) provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolDomainResult withCloudFrontDomain(String cloudFrontDomain) {
        setCloudFrontDomain(cloudFrontDomain);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCloudFrontDomain() != null)
            sb.append("CloudFrontDomain: ").append(getCloudFrontDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolDomainResult == false)
            return false;
        CreateUserPoolDomainResult other = (CreateUserPoolDomainResult) obj;
        if (other.getCloudFrontDomain() == null ^ this.getCloudFrontDomain() == null)
            return false;
        if (other.getCloudFrontDomain() != null && other.getCloudFrontDomain().equals(this.getCloudFrontDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFrontDomain() == null) ? 0 : getCloudFrontDomain().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolDomainResult clone() {
        try {
            return (CreateUserPoolDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
