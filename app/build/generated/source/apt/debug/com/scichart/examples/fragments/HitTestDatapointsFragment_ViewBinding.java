// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HitTestDatapointsFragment_ViewBinding implements Unbinder {
  private HitTestDatapointsFragment target;

  @UiThread
  public HitTestDatapointsFragment_ViewBinding(HitTestDatapointsFragment target, View source) {
    this.target = target;

    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HitTestDatapointsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
  }
}