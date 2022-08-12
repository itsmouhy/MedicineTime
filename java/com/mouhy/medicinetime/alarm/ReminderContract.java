package com.mouhy.medicinetime.alarm;

import com.mouhy.medicinetime.BasePresenter;
import com.mouhy.medicinetime.BaseView;
import com.mouhy.medicinetime.data.source.History;
import com.mouhy.medicinetime.data.source.MedicineAlarm;

/**
 * Created by mouhy on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
