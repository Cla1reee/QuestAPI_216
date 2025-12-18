package com.prak12.repositori

import com.prak12.apiservice.ServiceApiSiswa
import com.prak12.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa{
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDatasiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDatasiswa(dataSiswa: DataSiswa): retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}