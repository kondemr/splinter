/* Copyright 2020 Braden Farmer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.farmerbb.taskbar.util;

public class Constants {

    private Constants() {}

    // Intent actions

    public static final String ACTION_ACCESSIBILITY_ACTION = "com.farmerbb.taskbar.ACCESSIBILITY_ACTION";
    public static final String ACTION_ADD_WIDGET_COMPLETED = "com.farmerbb.taskbar.ADD_WIDGET_COMPLETED";
    public static final String ACTION_ADD_WIDGET_REQUESTED = "com.farmerbb.taskbar.ADD_WIDGET_REQUESTED";
    public static final String ACTION_CONTEXT_MENU_APPEARING = "com.farmerbb.taskbar.CONTEXT_MENU_APPEARING";
    public static final String ACTION_CONTEXT_MENU_DISAPPEARING = "com.farmerbb.taskbar.CONTEXT_MENU_DISAPPEARING";
    public static final String ACTION_DASHBOARD_APPEARING = "com.farmerbb.taskbar.DASHBOARD_APPEARING";
    public static final String ACTION_DASHBOARD_DISAPPEARING = "com.farmerbb.taskbar.DASHBOARD_DISAPPEARING";
    public static final String ACTION_ENTER_ICON_ARRANGE_MODE = "com.farmerbb.taskbar.ENTER_ICON_ARRANGE_MODE";
    public static final String ACTION_FINISH_DIM_SCREEN_ACTIVITY = "com.farmerbb.taskbar.FINISH_DIM_SCREEN_ACTIVITY";
    public static final String ACTION_FINISH_FREEFORM_ACTIVITY = "com.farmerbb.taskbar.FINISH_FREEFORM_ACTIVITY";
    public static final String ACTION_FORCE_TASKBAR_RESTART = "com.farmerbb.taskbar.FORCE_TASKBAR_RESTART";
    public static final String ACTION_FREEFORM_PREF_CHANGED = "com.farmerbb.taskbar.FREEFORM_PREF_CHANGED";
    public static final String ACTION_HIDE_CONTEXT_MENU = "com.farmerbb.taskbar.HIDE_CONTEXT_MENU";
    public static final String ACTION_HIDE_DASHBOARD = "com.farmerbb.taskbar.HIDE_DASHBOARD";
    public static final String ACTION_HIDE_START_MENU = "com.farmerbb.taskbar.HIDE_START_MENU";
    public static final String ACTION_HIDE_START_MENU_NO_RESET = "com.farmerbb.taskbar.HIDE_START_MENU_NO_RESET";
    public static final String ACTION_HIDE_START_MENU_SPACE = "com.farmerbb.taskbar.HIDE_START_MENU_SPACE";
    public static final String ACTION_HIDE_TASKBAR = "com.farmerbb.taskbar.HIDE_TASKBAR";
    public static final String ACTION_IMPORT_FINISHED = "com.farmerbb.taskbar.IMPORT_FINISHED";
    public static final String ACTION_KILL_HOME_ACTIVITY = "com.farmerbb.taskbar.KILL_HOME_ACTIVITY";
    public static final String ACTION_LAUNCHER_PREF_CHANGED = "com.farmerbb.taskbar.LAUNCHER_PREF_CHANGED";
    public static final String ACTION_NOTIFICATION_COUNT_CHANGED = "com.farmerbb.taskbar.NOTIFICATION_COUNT_CHANGED";
    public static final String ACTION_QUIT = "com.farmerbb.taskbar.QUIT";
    public static final String ACTION_RECEIVE_SETTINGS = "com.farmerbb.taskbar.RECEIVE_SETTINGS";
    public static final String ACTION_REFRESH_DESKTOP_ICONS = "com.farmerbb.taskbar.REFRESH_DESKTOP_ICONS";
    public static final String ACTION_REMOVE_DESKTOP_WALLPAPER = "com.farmerbb.taskbar.REMOVE_DESKTOP_WALLPAPER";
    public static final String ACTION_REMOVE_WIDGET_COMPLETED = "com.farmerbb.taskbar.REMOVE_WIDGET_COMPLETED";
    public static final String ACTION_REMOVE_WIDGET_REQUESTED = "com.farmerbb.taskbar.REMOVE_WIDGET_REQUESTED";
    public static final String ACTION_REQUEST_NOTIFICATION_COUNT = "com.farmerbb.taskbar.REQUEST_NOTIFICATION_COUNT";
    public static final String ACTION_RESET_START_MENU = "com.farmerbb.taskbar.RESET_START_MENU";
    public static final String ACTION_RESTART = "com.farmerbb.taskbar.RESTART";
    public static final String ACTION_SEND_SETTINGS = "com.farmerbb.taskbar.SEND_SETTINGS";
    public static final String ACTION_SHOW_HIDE_TASKBAR = "com.farmerbb.taskbar.SHOW_HIDE_TASKBAR";
    public static final String ACTION_SHOW_START_MENU_SPACE = "com.farmerbb.taskbar.SHOW_START_MENU_SPACE";
    public static final String ACTION_SHOW_TASKBAR = "com.farmerbb.taskbar.SHOW_TASKBAR";
    public static final String ACTION_SORT_DESKTOP_ICONS = "com.farmerbb.taskbar.SORT_DESKTOP_ICONS";
    public static final String ACTION_START = "com.farmerbb.taskbar.START";
    public static final String ACTION_START_MENU_APPEARING = "com.farmerbb.taskbar.START_MENU_APPEARING";
    public static final String ACTION_START_MENU_DISAPPEARING = "com.farmerbb.taskbar.START_MENU_DISAPPEARING";
    public static final String ACTION_TEMP_HIDE_TASKBAR = "com.farmerbb.taskbar.TEMP_HIDE_TASKBAR";
    public static final String ACTION_TEMP_SHOW_TASKBAR = "com.farmerbb.taskbar.TEMP_SHOW_TASKBAR";
    public static final String ACTION_TOGGLE_DASHBOARD = "com.farmerbb.taskbar.TOGGLE_DASHBOARD";
    public static final String ACTION_TOGGLE_FREEFORM_MODE = "com.farmerbb.taskbar.TOGGLE_FREEFORM_MODE";
    public static final String ACTION_TOGGLE_START_MENU = "com.farmerbb.taskbar.TOGGLE_START_MENU";
    public static final String ACTION_TOUCH_ABSORBER_STATE_CHANGED = "com.farmerbb.taskbar.TOUCH_ABSORBER_STATE_CHANGED";
    public static final String ACTION_UNDIM_SCREEN = "com.farmerbb.taskbar.ACTION_UNDIM_SCREEN";
    public static final String ACTION_UPDATE_FREEFORM_CHECKBOX = "com.farmerbb.taskbar.UPDATE_FREEFORM_CHECKBOX";
    public static final String ACTION_UPDATE_HOME_SCREEN_MARGINS = "com.farmerbb.taskbar.UPDATE_HOME_SCREEN_MARGINS";
    public static final String ACTION_UPDATE_SWITCH = "com.farmerbb.taskbar.UPDATE_SWITCH";
    public static final String ACTION_WALLPAPER_CHANGE_REQUESTED = "com.farmerbb.taskbar.WALLPAPER_CHANGE_REQUESTED";

    // SharedPreference keys

    public static final String PREF_ABOUT = "about";
    public static final String PREF_ACCENT_COLOR = "accent_color";
    public static final String PREF_ACCENT_COLOR_PREF = "accent_color_pref";
    public static final String PREF_ADDITIONAL_SETTINGS = "additional_settings";
    public static final String PREF_ADD_ICON_TO_DESKTOP = "add_icon_to_desktop";
    public static final String PREF_ADD_SHORTCUT = "add_shortcut";
    public static final String PREF_ALT_BUTTON_CONFIG = "alt_button_config";
    public static final String PREF_ANCHOR = "anchor";
    public static final String PREF_ANDROID_X86_PREFS = "android_x86_prefs";
    public static final String PREF_APP_DRAWER_ICON = "app_drawer_icon";
    public static final String PREF_APP_INFO = "app_info";
    public static final String PREF_APP_SHORTCUTS = "app_shortcuts";
    public static final String PREF_ARRANGE_ICONS = "arrange_icons";
    public static final String PREF_AUTO_HIDE_NAVBAR = "auto_hide_navbar";
    public static final String PREF_AUTO_HIDE_NAVBAR_CATEGORY = "auto_hide_navbar_category";
    public static final String PREF_AUTO_HIDE_NAVBAR_DESKTOP_MODE = "auto_hide_navbar_desktop_mode";
    public static final String PREF_BACKGROUND_TINT = "background_tint";
    public static final String PREF_BACKGROUND_TINT_PREF = "background_tint_pref";
    public static final String PREF_BACKUP_SETTINGS = "backup_settings";
    public static final String PREF_BLACKLIST = "blacklist";
    public static final String PREF_BLISS_OS_PREFS = "bliss_os_prefs";
    public static final String PREF_BLOCK_APP = "block_app";
    public static final String PREF_BUTTON_BACK = "button_back";
    public static final String PREF_BUTTON_HOME = "button_home";
    public static final String PREF_BUTTON_RECENTS = "button_recents";
    public static final String PREF_CENTERED_ICONS = "centered_icons";
    public static final String PREF_CHANGE_WALLPAPER = "change_wallpaper";
    public static final String PREF_CHANGE_WALLPAPER_DESKTOP = "change_wallpaper_desktop";
    public static final String PREF_CHANGE_WALLPAPER_GLOBAL = "change_wallpaper_global";
    public static final String PREF_CHROME_OS_CONTEXT_MENU_FIX = "chrome_os_context_menu_fix";
    public static final String PREF_CLEAR_PINNED_APPS = "clear_pinned_apps";
    public static final String PREF_COLLAPSED = "collapsed";
    public static final String PREF_DASHBOARD = "dashboard";
    public static final String PREF_DASHBOARD_GRID_SIZE = "dashboard_grid_size";
    public static final String PREF_DASHBOARD_HEIGHT = "dashboard_height";
    public static final String PREF_DASHBOARD_TUTORIAL_SHOWN = "dashboard_tutorial_shown";
    public static final String PREF_DASHBOARD_WIDGET_PLACEHOLDER_SUFFIX = "_placeholder";
    public static final String PREF_DASHBOARD_WIDGET_PREFIX = "dashboard_widget_";
    public static final String PREF_DASHBOARD_WIDGET_PROVIDER_SUFFIX = "_provider";
    public static final String PREF_DASHBOARD_WIDTH = "dashboard_width";
    public static final String PREF_DEFAULT_NULL = "null";
    public static final String PREF_DESKTOP_ICONS = "desktop_icons";
    public static final String PREF_DESKTOP_MODE = "desktop_mode";
    public static final String PREF_DESKTOP_MODE_IME_FIX = "desktop_mode_ime_fix";
    public static final String PREF_DIM_SCREEN = "dim_screen";
    public static final String PREF_DISABLE_ANIMATIONS = "disable_animations";
    public static final String PREF_DISABLE_SCROLLING_LIST = "disable_scrolling_list";
    public static final String PREF_DISPLAY_DENSITY = "display_density";
    public static final String PREF_DONATE = "donate";
    public static final String PREF_DONT_SHOW_DOUBLE_TAP_DIALOG = "dont_show_double_tap_dialog";
    public static final String PREF_DONT_SHOW_UNINSTALL_DIALOG = "dont_show_uninstall_dialog";
    public static final String PREF_DONT_STOP_DASHBOARD = "dont_stop_dashboard";
    public static final String PREF_DOUBLE_TAP_DIALOG_SHOWN = "double_tap_dialog_shown";
    public static final String PREF_DOUBLE_TAP_TO_SLEEP = "double_tap_to_sleep";
    public static final String PREF_ENABLE_ADDITIONAL_SETTINGS = "enable_additional_settings";
    public static final String PREF_ENABLE_RECENTS = "enable_recents";
    public static final String PREF_FILE_MANAGER = "file_manager";
    public static final String PREF_FIRST_RUN = "first_run";
    public static final String PREF_FORCE_NEW_WINDOW = "force_new_window";
    public static final String PREF_FREEFORM_HACK = "freeform_hack";
    public static final String PREF_FREEFORM_POSITION = "freeform_position";
    public static final String PREF_FREEFORM_HACK_OVERRIDE = "freeform_hack_override";
    public static final String PREF_FULL_LENGTH = "full_length";
    public static final String PREF_GRIP_REJECTION_TOAST_SHOWN = "grip_rejection_toast_shown";
    public static final String PREF_HAS_CAPTION = "has_caption";
    public static final String PREF_HEADER = "header";
    public static final String PREF_HIDE_DONATE = "hide_donate";
    public static final String PREF_HIDE_FOREGROUND = "hide_foreground";
    public static final String PREF_HIDE_ICON_LABELS = "hide_icon_labels";
    public static final String PREF_HIDE_TASKBAR = "hide_taskbar";
    public static final String PREF_HIDE_WHEN_KEYBOARD_SHOWN = "hide_when_keyboard_shown";
    public static final String PREF_HSL_ID = "hsl_id";
    public static final String PREF_HSL_NAME = "hsl_name";
    public static final String PREF_ICON_PACK = "icon_pack";
    public static final String PREF_ICON_PACK_LIST = "icon_pack_list";
    public static final String PREF_ICON_PACK_USE_MASK = "icon_pack_use_mask";
    public static final String PREF_INVISIBLE_BUTTON = "invisible_button";
    public static final String PREF_IS_HIDDEN = "is_hidden";
    public static final String PREF_IS_RESTARTING = "is_restarting";
    public static final String PREF_KEYBOARD_SHORTCUT = "keyboard_shortcut";
    public static final String PREF_LAUNCHER = "launcher";
    public static final String PREF_LAUNCH_GAMES_FULLSCREEN = "launch_games_fullscreen";
    public static final String PREF_LOCK_DEVICE = "lock_device";
    public static final String PREF_MANAGE_APP_DATA = "manage_app_data";
    public static final String PREF_MAX_NUM_OF_RECENTS = "max_num_of_recents";
    public static final String PREF_NAVIGATION_BAR_BUTTONS = "navigation_bar_buttons";
    public static final String PREF_NOTIFICATION_COUNT = "notification_count";
    public static final String PREF_NOTIFICATION_SETTINGS = "notification_settings";
    public static final String PREF_OPEN_TASKBAR_SETTINGS = "open_taskbar_settings";
    public static final String PREF_OVERRIDE_FREEFORM_UNSUPPORTED = "override_freeform_unsupported";
    public static final String PREF_PIN_APP = "pin_app";
    public static final String PREF_POSITION = "position";
    public static final String PREF_SEEKBAR = "seekbar_preference";
    public static final String PREF_POWER_BUTTON_WARNING = "power_button_warning";
    public static final String PREF_POWER_MENU = "power_menu";
    public static final String PREF_PREF_SCREEN_ADVANCED = "pref_screen_advanced";
    public static final String PREF_PREF_SCREEN_APPEARANCE = "pref_screen_appearance";
    public static final String PREF_PREF_SCREEN_DESKTOP_MODE = "pref_screen_desktop_mode";
    public static final String PREF_PREF_SCREEN_FREEFORM = "pref_screen_freeform";
    public static final String PREF_PREF_SCREEN_GENERAL = "pref_screen_general";
    public static final String PREF_PREF_SCREEN_RECENT_APPS = "pref_screen_recent_apps";
    public static final String PREF_PRIMARY_LAUNCHER = "primary_launcher";
    public static final String PREF_QS_TILE = "qs_tile";
    public static final String PREF_QUIT_TASKBAR = "quit_taskbar";
    public static final String PREF_RECENTS_AMOUNT = "recents_amount";
    public static final String PREF_REFRESH_FREQUENCY = "refresh_frequency";
    public static final String PREF_REMOVE_DESKTOP_ICON = "remove_desktop_icon";
    public static final String PREF_REMOVE_DESKTOP_WALLPAPER = "remove_desktop_wallpaper";
    public static final String PREF_RESET_COLORS = "reset_colors";
    public static final String PREF_RESTORE_SETTINGS = "restore_settings";
    public static final String PREF_SAMSUNG_DIALOG_SHOWN = "samsung_dialog_shown";
    public static final String PREF_SAVE_WINDOW_SIZES = "save_window_sizes";
    public static final String PREF_SCROLLBAR = "scrollbar";
    public static final String PREF_SECONDSCREEN = "secondscreen";
    public static final String PREF_SET_LAUNCHER_DEFAULT = "set_launcher_default";
    public static final String PREF_SHORTCUT_1 = "shortcut_1";
    public static final String PREF_SHORTCUT_2 = "shortcut_2";
    public static final String PREF_SHORTCUT_3 = "shortcut_3";
    public static final String PREF_SHORTCUT_4 = "shortcut_4";
    public static final String PREF_SHORTCUT_5 = "shortcut_5";
    public static final String PREF_SHORTCUT_ICON = "shortcut_icon";
    public static final String PREF_SHOW_BACKGROUND = "show_background";
    public static final String PREF_SHOW_FREEFORM_DISABLED_MESSAGE = "show_freeform_disabled_message";
    public static final String PREF_SHOW_SEARCH_BAR = "show_search_bar";
    public static final String PREF_SHOW_WINDOW_SIZES = "show_window_sizes";
    public static final String PREF_SKIP_AUTO_HIDE_NAVBAR = "skip_auto_hide_navbar";
    public static final String PREF_SKIP_DISABLE_FREEFORM_RECEIVER = "skip_disable_freeform_receiver";
    public static final String PREF_SKIP_DISABLE_HOME_RECEIVER = "skip_disable_home_receiver";
    public static final String PREF_SKIP_QUIT_RECEIVER = "skip_quit_receiver";
    public static final String PREF_SORT_BY_NAME = "sort_by_name";
    public static final String PREF_SORT_ORDER = "sort_order";
    public static final String PREF_START_BUTTON_IMAGE = "start_button_image";
    public static final String PREF_START_MENU_APPS = "start_menu_apps";
    public static final String PREF_START_MENU_LAYOUT = "start_menu_layout";
    public static final String PREF_START_ON_BOOT = "start_on_boot";
    public static final String PREF_SYSTEM_SETTINGS = "system_settings";
    public static final String PREF_SYS_TRAY = "sys_tray";
    public static final String PREF_TASKBAR_ACTIVE = "taskbar_active";
    public static final String PREF_TASKER_ENABLED = "tasker_enabled";
    public static final String PREF_THEME = "theme";
    public static final String PREF_TIME_OF_SERVICE_START = "time_of_service_start";
    public static final String PREF_TRANSPARENT_START_MENU = "transparent_start_menu";
    public static final String PREF_UNINSTALL = "uninstall";
    public static final String PREF_UNINSTALL_DIALOG_SHOWN = "uninstall_dialog_shown";
    public static final String PREF_VISUAL_FEEDBACK = "visual_feedback";
    public static final String PREF_VOLUME = "volume";
    public static final String PREF_WINDOW_SIZE = "window_size";
    public static final String PREF_WINDOW_SIZE_FULLSCREEN = "window_size_fullscreen";
    public static final String PREF_WINDOW_SIZE_HALF_LEFT = "window_size_half_left";
    public static final String PREF_WINDOW_SIZE_HALF_RIGHT = "window_size_half_right";
    public static final String PREF_WINDOW_SIZE_LARGE = "window_size_large";
    public static final String PREF_WINDOW_SIZE_PHONE_SIZE = "window_size_phone_size";
    public static final String PREF_WINDOW_SIZE_STANDARD = "window_size_standard";

    public static final String PREF_ADDED_SUFFIX = "added";
    public static final String PREF_COMPONENT_NAME_SUFFIX = "component_name";
    public static final String PREF_ICON_THRESHOLD_SUFFIX = "icon_threshold";
    public static final String PREF_LABEL_SUFFIX = "label";
    public static final String PREF_PACKAGE_NAME_SUFFIX = "package_name";
    public static final String PREF_USER_ID_SUFFIX = "user_id";
    public static final String PREF_WINDOW_SIZE_SUFFIX = "window_size";

    // SharedPreference values

    public static final String PREF_RECENTS_AMOUNT_APP_START = "app_start";
    public static final String PREF_RECENTS_AMOUNT_PAST_DAY = "past_day";
    public static final String PREF_RECENTS_AMOUNT_RUNNING_APPS_ONLY = "running_apps_only";
    public static final String PREF_RECENTS_AMOUNT_SHOW_ALL = "show_all";

    public static final String PREF_START_BUTTON_IMAGE_APP_LOGO = "app_logo";
    public static final String PREF_START_BUTTON_IMAGE_CUSTOM  = "custom";
    public static final String PREF_START_BUTTON_IMAGE_DEFAULT = "default";

    // TaskbarPosition values

    public static final String POSITION_BOTTOM_LEFT = "bottom_left";
    public static final String POSITION_BOTTOM_RIGHT = "bottom_right";
    public static final String POSITION_BOTTOM_VERTICAL_LEFT = "bottom_vertical_left";
    public static final String POSITION_BOTTOM_VERTICAL_RIGHT = "bottom_vertical_right";
    public static final String POSITION_TOP_LEFT = "top_left";
    public static final String POSITION_TOP_RIGHT = "top_right";
    public static final String POSITION_TOP_VERTICAL_LEFT = "top_vertical_left";
    public static final String POSITION_TOP_VERTICAL_RIGHT = "top_vertical_right";

    // Intent extra keys

    public static final String EXTRA_ACTION = "action";
    public static final String EXTRA_APPWIDGET_ID = "appWidgetId";
    public static final String EXTRA_CELL_ID = "cellId";
    public static final String EXTRA_COMPONENT_NAME = "component_name";
    public static final String EXTRA_CONTEXT_MENU_FIX = "context_menu_fix";
    public static final String EXTRA_COUNT = "count";
    public static final String EXTRA_IS_LAUNCHING_SHORTCUT = "is_launching_shortcut";
    public static final String EXTRA_PACKAGE_NAME = "package_name";
    public static final String EXTRA_START_SERVICES = "start_services";
    public static final String EXTRA_USER_ID = "user_id";
    public static final String EXTRA_WINDOW_SIZE = "window_size";
    public static final String EXTRA_START_FREEFORM_HACK = "start_freeform_hack";
    public static final String EXTRA_SECONDSCREEN = "secondscreen";
    public static final String EXTRA_SHOW_PERMISSION_DIALOG = "show_permission_dialog";
    public static final String EXTRA_SHOW_RECENT_APPS_DIALOG = "show_recent_apps_dialog";
}
