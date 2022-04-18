package com.amirhossein.stockmarketapp.domain.repository

import com.amirhossein.stockmarketapp.domain.model.CompanyInfo
import com.amirhossein.stockmarketapp.domain.model.CompanyListing
import com.amirhossein.stockmarketapp.domain.model.IntradayInfo
import com.amirhossein.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}