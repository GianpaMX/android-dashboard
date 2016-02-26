package mx.softux.dashboard;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.android.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setup() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void testAddTaskButtonExists() {
        View addTaskButton = mainActivity.findViewById(R.id.add_task_button);
        assertThat(addTaskButton).isNotNull();
    }

    @Test
    public void testClickingAddTaskButtonShowsBottomSheet() {
        View addTaskButton = mainActivity.findViewById(R.id.add_task_button);
        addTaskButton.performClick();

        View bottomSheetView = mainActivity.findViewById(R.id.bottom_sheet_view);
        assertThat(bottomSheetView).isVisible();
    }
}
