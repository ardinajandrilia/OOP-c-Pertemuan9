/*
 * Copyright (c) 2015, 2025, Oracle and/or its affiliates.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License, version 2.0, as published by
 * the Free Software Foundation.
 *
 * This program is designed to work with certain software that is licensed under separate terms, as designated in a particular file or component or in
 * included license documentation. The authors of MySQL hereby grant you an additional permission to link the program and your derivative works with the
 * separately licensed software that they have either included with the program or referenced in the documentation.
 *
 * Without limiting anything contained in the foregoing, this file, which is part of MySQL Connector/J, is also subject to the Universal FOSS Exception,
 * version 1.0, a copy of which can be found at http://oss.oracle.com/licenses/universal-foss-exception.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License, version 2.0, for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package com.mysql.cj.xdevapi;

/**
 * A statement representing a SELECT query.
 */
public interface SelectStatement extends Statement<SelectStatement, RowResult> {

    /**
     * Add/replace the search condition for this query.
     *
     * @param searchCondition
     *            search condition expression
     * @return {@link SelectStatement}
     */
    SelectStatement where(String searchCondition);

    /**
     * Add/replace the aggregation fields for this query.
     *
     * @param groupBy
     *            groupBy expression
     * @return {@link SelectStatement}
     */
    SelectStatement groupBy(String... groupBy);

    /**
     * Add/replace the aggregate criteria for this query.
     *
     * @param having
     *            having expression
     * @return {@link SelectStatement}
     */
    SelectStatement having(String having);

    /**
     * Add/replace the order specification for this query.
     *
     * @param sortFields
     *            sort expression
     * @return {@link SelectStatement}
     */
    SelectStatement orderBy(String... sortFields);

    /**
     * Add/replace the row limit for this query.
     *
     * @param numberOfRows
     *            limit
     * @return {@link SelectStatement}
     */
    SelectStatement limit(long numberOfRows);

    /**
     * Add/replace the row offset for this query.
     *
     * @param limitOffset
     *            limit offset
     * @return {@link SelectStatement}
     */
    SelectStatement offset(long limitOffset);

    /**
     * Locks matching rows against updates.
     *
     * @return {@link SelectStatement}
     */
    SelectStatement lockShared();

    /**
     * Locks matching rows against updates using the provided lock contention option.
     *
     * @param lockContention
     *            The {@link com.mysql.cj.xdevapi.Statement.LockContention} value to set.
     * @return {@link SelectStatement}
     */
    SelectStatement lockShared(LockContention lockContention);

    /**
     * Locks matching rows exclusively so no other transactions can read or write to them.
     *
     * @return {@link SelectStatement}
     */
    SelectStatement lockExclusive();

    /**
     * Locks matching rows exclusively so no other transactions can read or write to them, using the provided lock contention option.
     *
     * @param lockContention
     *            The {@link com.mysql.cj.xdevapi.Statement.LockContention} value to set.
     * @return {@link SelectStatement}
     */
    SelectStatement lockExclusive(LockContention lockContention);

    /**
     * Return {@link FilterParams} defined for this statement.
     *
     * @return {@link FilterParams}
     */
    FilterParams getFilterParams();

}
