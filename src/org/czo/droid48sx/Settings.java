package org.czo.droid48sx;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;

public class Settings extends PreferenceActivity {
	
	 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setPreferenceScreen(createPreferenceHierarchy());
    }
	 
	 private PreferenceScreen createPreferenceHierarchy() {
	        // Root
	        PreferenceScreen root = getPreferenceManager().createPreferenceScreen(this);
	        root.setTitle(R.string.settings);
	        PreferenceCategory inlinePrefCat = new PreferenceCategory(this);
	        inlinePrefCat.setTitle(R.string.general_preferences);
	        root.addPreference(inlinePrefCat);
	        
	        CheckBoxPreference savePref = new CheckBoxPreference(this);
	        savePref.setKey("saveOnExit");
	        savePref.setTitle(R.string.saveonexit_msgbox);
	        savePref.setSummary(R.string.saveonexit_msgbox_value);
	        savePref.setDefaultValue(true);
	        inlinePrefCat.addPreference(savePref);
	        
	        CheckBoxPreference keybLitePref = new CheckBoxPreference(this);
	        keybLitePref.setKey("keybLite");
	        keybLitePref.setTitle(R.string.show_lite_keyb);
	        keybLitePref.setSummary(R.string.show_lite_keyb_summary);
	        keybLitePref.setDefaultValue(false);
	        inlinePrefCat.addPreference(keybLitePref);
	        
	        ListPreference backKeyPref = new ListPreference(this);
	        backKeyPref.setEntries(R.array.backkey_entries);
	        backKeyPref.setEntryValues(R.array.backkey_values);
	        backKeyPref.setDefaultValue("0");
	        backKeyPref.setDialogTitle(R.string.choose_backkey_value);
	        backKeyPref.setKey("backkey");
	        backKeyPref.setTitle(R.string.choose_backkey);
	        backKeyPref.setSummary(R.string.choose_backkey_value);
	        inlinePrefCat.addPreference(backKeyPref);
	        
	        CheckBoxPreference togglePref = new CheckBoxPreference(this);
	        togglePref.setKey("no_loadprog_msgbox");
	        togglePref.setTitle(R.string.choose_msgbox);
	        togglePref.setSummary(R.string.choose_msgbox_value);
	        inlinePrefCat.addPreference(togglePref);
	        
	        PreferenceCategory inlineDispPrefCat = new PreferenceCategory(this);
	        inlineDispPrefCat.setTitle(R.string.display_preferences);
	        root.addPreference(inlineDispPrefCat);
	        
	        CheckBoxPreference hapticPref = new CheckBoxPreference(this);
	        hapticPref.setKey("haptic");
	        hapticPref.setTitle(R.string.haptic_feedback);
	        hapticPref.setDefaultValue(true);
	        inlineDispPrefCat.addPreference(hapticPref);
	        
	        CheckBoxPreference soundPref = new CheckBoxPreference(this);
	        soundPref.setKey("sound");
	        soundPref.setTitle(R.string.sound);
	        soundPref.setSummary(R.string.sound_summary);
	        soundPref.setDefaultValue(false);
	        inlineDispPrefCat.addPreference(soundPref);
	        
	        CheckBoxPreference largeLCDPref = new CheckBoxPreference(this);
	        largeLCDPref.setKey("large_width");
	        largeLCDPref.setTitle(R.string.large_width);
	        largeLCDPref.setSummary(R.string.large_width_summary);
	        largeLCDPref.setDefaultValue(true);
	        inlineDispPrefCat.addPreference(largeLCDPref);
	        
	        CheckBoxPreference scaleControlsPref = new CheckBoxPreference(this);
	        scaleControlsPref.setKey("scale_buttons");
	        scaleControlsPref.setTitle(R.string.scale_buttons);
	        scaleControlsPref.setSummary(R.string.scale_buttons_summary);
	        scaleControlsPref.setDefaultValue(true);
	        inlineDispPrefCat.addPreference(scaleControlsPref);
	        
	        CheckBoxPreference fullScreenPref = new CheckBoxPreference(this);
	        fullScreenPref.setKey("fullScreen");
	        fullScreenPref.setTitle(R.string.full_screen);
	        fullScreenPref.setSummary(R.string.full_screen_summary);
	        fullScreenPref.setDefaultValue(false);
	        inlineDispPrefCat.addPreference(fullScreenPref);
	        
	        ListPreference listPref = new ListPreference(this);
	        listPref.setEntries(R.array.contrast_entries);
	        listPref.setEntryValues(R.array.contrast_values);
	        listPref.setDefaultValue("1");
	        listPref.setDialogTitle(R.string.choose_contrast_value);
	        listPref.setKey("contrast");
	        listPref.setTitle(R.string.choose_contrast);
	        listPref.setSummary(R.string.choose_contrast_value);
	        inlineDispPrefCat.addPreference(listPref);
	        
	       
	        
	        PreferenceCategory portPrefCat = new PreferenceCategory(this);
	        portPrefCat.setTitle(R.string.ramcards_preferences);
	        root.addPreference(portPrefCat);
	        
	        ListPreference port1Pref = new ListPreference(this);
	        port1Pref.setEntries(R.array.port_1_entries);
	        port1Pref.setEntryValues(R.array.port_1_values);
	        port1Pref.setDefaultValue("0");
	        port1Pref.setDialogTitle(R.string.ram_install);
	        port1Pref.setKey("port1");
	        port1Pref.setTitle(R.string.port1_install);
	        portPrefCat.addPreference(port1Pref);
	        
	        ListPreference port2Pref = new ListPreference(this);
	        port2Pref.setEntries(R.array.port_2_entries);
	        port2Pref.setEntryValues(R.array.port_2_values);
	        port2Pref.setDefaultValue("0");
	        port2Pref.setDialogTitle(R.string.ram_install);
	        port2Pref.setKey("port2");
	        port2Pref.setTitle(R.string.port2_install);
	        portPrefCat.addPreference(port2Pref);
	        
	        setResult(RESULT_OK);
	        
	        return root;
	 }

}
