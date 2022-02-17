package com.mungeun.android_clean_architecture_template.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import java.net.ConnectException
import java.net.SocketException
import java.net.UnknownHostException

open class BaseViewModel : ViewModel() {

    private var _errorState = MutableLiveData<ErrorState>()
    val errorState: LiveData<ErrorState>
        get() = _errorState

    protected val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        throwable.printStackTrace()

//        when (throwable) {
//            is SocketException -> _errorState.postValue(ErrorState.BAD_INTERNET)
//            is HttpException -> _errorState.postValue(ErrorState.PARSE_ERROR)
//            is UnknownHostException -> _errorState.postValue(ErrorState.WRONG_CONNECTION)
//            is ConnectException -> _errorState.postValue(ErrorState.CONNECT_ERROR)
//            else -> _errorState.postValue(ErrorState.FAIL)
//        }

    }


    companion object {
        enum class ErrorState {
            BAD_INTERNET,
            PARSE_ERROR,
            CONNECT_ERROR,
            WRONG_CONNECTION,
            FAIL
        }
    }

}