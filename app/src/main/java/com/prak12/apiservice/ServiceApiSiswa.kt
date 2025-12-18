package com.prak12.apiservice

import com.prak12.modeldata.DataSiswa
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body

interface ServiceApiSiswa {

    @GET("bacateman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body datasiswa: DataSiswa):retrofit2.Response<Void>

//  @GET("baca1teman.php/{id}")
//  suspen fun getStatusSiswa(@Query("id") id: int): DataSiswa

//  @PUT("editTM.php/{id}")
//  suspend fun editStatusSiswa(@Query("id") id: int, @Body datasiswa: DataSiswa): retrofit2.Response<Void>

}