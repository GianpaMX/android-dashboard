package mx.softux.dashboard;

import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {
    @Test
    public void testAddTaskButtonExists() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        View addTask = activity.findViewById(R.id.add_task_button);

        assertThat(addTask).isNotNull();
    }
}
