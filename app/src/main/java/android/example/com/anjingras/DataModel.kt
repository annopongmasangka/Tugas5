package android.example.com.anjingras

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataModel(
    val iconsImage : Int,
    val titleImage : String,
    val descImage : String
): Parcelable
