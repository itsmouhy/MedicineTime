package com.mouhy.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;

import com.mouhy.medicinetime.data.source.MedicineRepository;
import com.mouhy.medicinetime.data.source.local.MedicinesLocalDataSource;


public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
