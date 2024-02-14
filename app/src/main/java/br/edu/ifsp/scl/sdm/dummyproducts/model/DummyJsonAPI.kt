package br.edu.ifsp.scl.sdm.dummyproducts.model

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class DummyJsonAPI(context: Context) {

    companion object{
        @Volatile
        private var INSTANCE: DummyJsonAPI? = null

        fun getInstance(context: Context) = INSTANCE ?: synchronized(this){
            INSTANCE ?: DummyJsonAPI(context).also {
                INSTANCE = it
            }
        }
    }

    private val requestQueue: RequestQueue by lazy{
        Volley.newRequestQueue(context.applicationContext)
    }

    fun <T> addToRequestQueue(request: Request<T>){
        requestQueue.add(request)
    }
}