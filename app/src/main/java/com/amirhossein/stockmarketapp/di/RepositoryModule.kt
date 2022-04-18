package com.amirhossein.stockmarketapp.di

import com.amirhossein.stockmarketapp.data.csv.CSVParser
import com.amirhossein.stockmarketapp.data.csv.CompanyListingsParser
import com.amirhossein.stockmarketapp.data.csv.IntradayInfoParser
import com.amirhossein.stockmarketapp.data.repository.StockRepositoryImpl
import com.amirhossein.stockmarketapp.domain.model.CompanyListing
import com.amirhossein.stockmarketapp.domain.model.IntradayInfo
import com.amirhossein.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bingCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ):CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bingIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ):CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}