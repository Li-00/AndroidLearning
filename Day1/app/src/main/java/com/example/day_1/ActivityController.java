package com.example.day_1;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @param
 * @author zy
 * @description 移除销毁的 Avtivity
 * @return methodReturnType
 * @time 2022/12/25
 */
public class ActivityController {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
