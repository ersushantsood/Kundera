/*******************************************************************************
 * * Copyright 2014 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.client.hbase.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.impetus.kundera.index.Index;
import com.impetus.kundera.index.IndexCollection;

/**
 * @author Pragalbh Garg
 *
 */
@Entity
@Table(name = "book_categories", schema = "KunderaExamples@hbaseTest")
@IndexCollection(columns = { @Index(name = "categoryId"), @Index(name = "categoryName") })
public class Categories
{

    /** The category_id. */
    @Id
    @Column(name = "category_id")
    private String categoryId;

    /** The category_name. */
    @Column(name = "category_name")
    private String categoryName;



    /**
     * Gets the category_name.
     * 
     * @return the category_name
     */
    public String getCategoryName()
    {
        return categoryName;
    }

    /**
     * Sets the category_name.
     * 
     * @param categoryName
     *            the new category_name
     */
    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    /**
     * Gets the category_id.
     * 
     * @return the category_id
     */
    public String getCategoryId()
    {
        return categoryId;
    }

    /**
     * Sets the category_id.
     * 
     * @param categoryId
     *            the new category_id
     */
    public void setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
    }
}
