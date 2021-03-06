package com.chteuchteu.munin.ui;

import com.chteuchteu.munin.obj.Grid;

public interface IGridActivity {
	public void onPreviewHide();
	public void onEditModeChange(boolean editing);
	public void onPreview();
	public void onGridLoaded(Grid grid);
	public void onGridSaved();

	/**
	 * Triggered when the user hits the "Load" button when autoLoad=false
	 */
	public void onManualLoad();
}
